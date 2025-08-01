package org.as.jtrello.base;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.StringUtils;
import org.as.jtrello.Config;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class TrelloApiBase {

	protected Config config;

	/**
	 * @param authKey
	 * @param authToken
	 */
	public TrelloApiBase(Config config) {
		this.config = config;
	}

	public Config getConfig() {
		return config;
	}
	
	/**
	 * @param parts URL segments.
	 * @param params URL query string parameters.
	 * @param typeOfT The type of the object to be returned. This is needed in order to tell Gson how to deserialize the JSON response.
	 * @return Execute resource request (GET) and returns an object of typeOfT type.
	 * @throws TrelloApiBaseException If a problem occurs during request or parsing.
	 */
	public <T> T doGet(List<String> parts, Map<String, String> params, Type typeOfT) throws TrelloApiBaseException {
		String json = this.getRequest(parts, params, Method.GET);
		Gson gson = new Gson();
		T obj;
		try {
			obj = gson.fromJson(json, typeOfT);
		} catch (JsonSyntaxException e) {
			throw new TrelloApiBaseException(e);
		}
		return obj;
	}
	
	public <T> T doPost(List<String> parts, Map<String, String> params, Type typeOfT) throws TrelloApiBaseException {
		Gson gson = new Gson();
		String json = this.getRequest(parts, params, Method.POST);
		T obj;
		try {
			obj = gson.fromJson(json, typeOfT);
		} catch (JsonSyntaxException e) {
			throw new TrelloApiBaseException(e);
		}
		return obj;
	}

	/**
	 * @param parts URL segments.
	 * @param params URL query string parameters.
	 * @return Execute resource request (GET) and returns its output in JSON format.
	 * @throws TrelloApiBaseException If http status code is not '200'.
	 */
	private String getRequest(List<String> parts, Map<String, String> params, Method method) throws TrelloApiBaseException {
		URI uri = buildUri(this.config.getApiBaseUrl(), parts, params);

		Client client = Client.create();

		WebResource webResource = client.resource(uri);

		Builder builder = webResource.accept(MediaType.APPLICATION_JSON);
		ClientResponse response = null;
		if (Method.GET.equals(method)) {
			response = builder.get(ClientResponse.class);
		} else if (Method.POST.equals(method)) {
			response = builder.post(ClientResponse.class);
		}
		
//		System.out.println("DEBUG data=" + data);
//		System.out.println("DEBUG response=" + response.toString());
//		System.out.println("DEBUG response headers=" + response.getHeaders().toString());

		if (response.getStatus() != 200) {
			throw new TrelloApiBaseException("Failed : HTTP error code : " + response.getStatus());
		}

		String output = response.getEntity(String.class);

		// TODO Implement logging library
//		System.out.println("DEBUG output="+output);

		return output;
	}

	/**
	 * @param path API base URL.
	 * @param parts URL segments.
	 * @param params URL query string parameters.
	 * @return Resource URI.
	 * @throws TrelloApiBaseException
	 */
	protected URI buildUri(String path, List<String> parts, Map<String, String> params) throws TrelloApiBaseException {
		URI uri;
		String url = path + "/" + StringUtils.join(parts, "/");
		String urlparams = "";
		
		url = MessageFormat.format("{0}?key={1}", url, this.config.getAuthKey());
		
		if (this.config.getAuthToken() != null) {
			url = MessageFormat.format("{0}&token={1}", url, this.config.getAuthToken());
		}
		
		try {
			if (params != null) {
				Set<String> keys = params.keySet();
				Iterator<String> keysIterator = keys.iterator();
				while (keysIterator.hasNext()) {
					String key 	 = keysIterator.next();
					String value = params.get(key);
					urlparams 	 = MessageFormat.format("{0}&{1}={2}", urlparams, key, URLEncoder.encode(value, "UTF-8"));
				}
				url = url + urlparams;
			}
		} catch (UnsupportedEncodingException e) {
			throw new TrelloApiBaseException(e);
		}
		
		try {
			uri = new URI(url);
		} catch (URISyntaxException e) {
			throw new TrelloApiBaseException(e);
		}

//		System.out.println("DEBUG uri=" + uri.toString());

		return uri;
	}
	
	private enum Method {
		GET, POST, PUT, DELETE
	}

}
