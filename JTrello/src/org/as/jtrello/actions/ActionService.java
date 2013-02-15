package org.as.jtrello.actions;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.as.jtrello.Config;
import org.as.jtrello.base.TrelloApiBase;
import org.as.jtrello.base.TrelloApiBaseException;

import com.google.gson.reflect.TypeToken;

public class ActionService extends TrelloApiBase {

	/**
	 * @param config
	 */
	public ActionService(Config config) {
		super(config);
	}
	
	/**
	 * @param idAction
	 * @return Gets an action by id.
	 * @throws TrelloApiBaseException
	 */
	public Action get(String idAction) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("actions");
		parts.add(idAction);
		
		Type typeOfT = new TypeToken<Action>(){}.getType();
		return this.doGet(parts, null, typeOfT);
	}
	
	/**
	 * @param idBoard
	 * @return Gets an actions lists by board id.
	 * @throws TrelloApiBaseException
	 */
	public List<Action> getByBoard(String idBoard) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("boards");
		parts.add(idBoard);
		parts.add("actions");
		
		Type typeOfT = new TypeToken<List<Action>>(){}.getType();
		return this.doGet(parts, null, typeOfT);
	}
	
	/**
	 * @param id Card id or shortlink.
	 * @return Gets an actions list by id or shortlink.
	 * @throws TrelloApiBaseException
	 */
	public List<Action> getByCard(String id) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("cards");
		parts.add(id);
		parts.add("actions");
		
		Type typeOfT = new TypeToken<List<Action>>(){}.getType();
		return this.doGet(parts, null, typeOfT);
	}
	
	/**
	 * @param idList
	 * @return Gets an actions list by list id.
	 * @throws TrelloApiBaseException
	 */
	public List<Action> getByList(String idList) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("lists");
		parts.add(idList);
		parts.add("actions");
		
		Type typeOfT = new TypeToken<List<Action>>(){}.getType();
		return this.doGet(parts, null, typeOfT);
	}
	
	/**
	 * @param key Id or username. 'me' will respond as if you had supplied the username associated with the supplied token.
	 * @return Gets an actions list by member.
	 * @throws TrelloApiBaseException
	 */
	public List<Action> getByUser(String key) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("members");
		parts.add(key);
		parts.add("actions");
		
		Type typeOfT = new TypeToken<List<Action>>(){}.getType();
		return this.doGet(parts, null, typeOfT);
	}
	
	/**
	 * @param key Organization id or name.
	 * @return Gets an actions list by organization.
	 * @throws TrelloApiBaseException
	 */
	public List<Action> getByOrganization(String key) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("organizations");
		parts.add(key);
		parts.add("actions");
		
		Type typeOfT = new TypeToken<List<Action>>(){}.getType();
		return this.doGet(parts, null, typeOfT);
	}

}
