package org.as.jtrello.organizations;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.as.jtrello.Config;
import org.as.jtrello.base.TrelloApiBase;
import org.as.jtrello.base.TrelloApiBaseException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class OrganizationService extends TrelloApiBase {

	/**
	 * @param config
	 */
	public OrganizationService(Config config) {
		super(config);
	}
	
	/**
	 * @param key Organization id or name.
	 * @return Gets an organization by id or name.
	 * @throws TrelloApiBaseException
	 */
	public Organization get(String key) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("organizations");
		parts.add(key);
		
		String json = this.getRequest(this.config.getApiBaseUrl(), parts, null);
		Gson gson = new Gson();
		Organization organization = gson.fromJson(json, Organization.class);
		return organization;
	}
	
	/**
	 * 
	 * @param key Id or username. 'me' will respond as if you had supplied the username associated with the supplied token.
	 * @return Gets an organization list by member.
	 * @throws TrelloApiBaseException
	 */
	public List<Organization> getByUser(String key) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("members");
		parts.add(key);
		parts.add("organizations");
		
		String json = this.getRequest(this.config.getApiBaseUrl(), parts, null);
		Gson gson = new Gson();
		Type collectionType = new TypeToken<List<Organization>>(){}.getType();
		List<Organization> organizations = gson.fromJson(json, collectionType);
		return organizations;
	}

}
