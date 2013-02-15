package org.as.jtrello.checklists;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.as.jtrello.Config;
import org.as.jtrello.base.TrelloApiBase;
import org.as.jtrello.base.TrelloApiBaseException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ChecklistService extends TrelloApiBase {

	/**
	 * @param config
	 */
	public ChecklistService(Config config) {
		super(config);
	}
	
	/**
	 * @param id Checklist id.
	 * @return Gets a checklist by id.
	 * @throws TrelloApiBaseException
	 */
	public Checklist get(String id) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("checklists");
		parts.add(id);
		
		String json = this.getRequest(parts, null);
		Gson gson = new Gson();
		Checklist checklist = gson.fromJson(json, Checklist.class);
		return checklist;
	}
	
	/**
	 * @param id Card id or shortlink.
	 * @return Gets a checklist list by card.
	 * @throws TrelloApiBaseException
	 */
	public List<Checklist> getByCard(String id) throws TrelloApiBaseException{
		List<String> parts = new ArrayList<String>();
		parts.add("cards");
		parts.add(id);
		parts.add("checklists");
		
		String json = this.getRequest(parts, null);
		Gson gson = new Gson();
		Type collectionType = new TypeToken<List<Checklist>>(){}.getType();
		List<Checklist> checklists = gson.fromJson(json, collectionType);
		return checklists;
	}

}
