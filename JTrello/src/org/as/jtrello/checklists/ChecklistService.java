package org.as.jtrello.checklists;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.as.jtrello.Config;
import org.as.jtrello.base.TrelloApiBase;
import org.as.jtrello.base.TrelloApiBaseException;

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
		
		Type typeOfT = new TypeToken<Checklist>(){}.getType();
		return this.doGet(parts, null, typeOfT);
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
		
		Type typeOfT = new TypeToken<List<Checklist>>(){}.getType();
		return this.doGet(parts, null, typeOfT);
	}

}
