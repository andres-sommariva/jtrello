package org.as.jtrello.base;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.as.jtrello.Config;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

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
	 * @param params params URL query string parameters.
	 * @return Execute resource request (GET) and returns its output in JSON format.
	 * @throws TrelloApiBaseException If http status code is not '200'.
	 */
	public String getRequest(List<String> parts, Map<String, String> params) throws TrelloApiBaseException {
		return getRequest(this.config.getApiBaseUrl(), parts, params);
	}

	/**
	 * @param path API base URL.
	 * @param parts URL segments.
	 * @param params URL query string parameters.
	 * @return Execute resource request (GET) and returns its output in JSON format.
	 * @throws TrelloApiBaseException If http status code is not '200'.
	 */
	public String getRequest(String path, List<String> parts, Map<String, String> params) throws TrelloApiBaseException {
		URI uri = buildUri(path, parts, params);

		Client client = Client.create();

		WebResource webResource = client.resource(uri);

		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

		if (response.getStatus() != 200) {
			throw new TrelloApiBaseException("Failed : HTTP error code : " + response.getStatus());
		}

		String output = response.getEntity(String.class);

		System.out.println("DEBUG output="+output);

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
		
		if (params != null) {
			Set<String> keys = params.keySet();
			Iterator<String> keysIterator = keys.iterator();
			while (keysIterator.hasNext()) {
				String key 	 = keysIterator.next();
				String value = params.get(key);
				urlparams 	 = MessageFormat.format("{0}&{1}={2}", urlparams, key, value);
			}
			url = url + urlparams;
		}
		
		try {
			uri = new URI(url);
		} catch (URISyntaxException e) {
			throw new TrelloApiBaseException(e);
		}

		System.out.println("DEBUG uri=" + uri.toString());

		return uri;
	}

}
