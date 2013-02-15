package org.as.jtrello.lists;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.as.jtrello.Config;
import org.as.jtrello.base.TrelloApiBase;
import org.as.jtrello.base.TrelloApiBaseException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ListService extends TrelloApiBase {

	/**
	 * @param config
	 */
	public ListService(Config config) {
		super(config);
	}
	
	/**
	 * @param id List id.
	 * @return Gets a list by id.
	 * @throws TrelloApiBaseException
	 */
	public TList get(String id) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("lists");
		parts.add(id);
		
		String json = this.getRequest(parts, null);
		Gson gson = new Gson();
		TList list = gson.fromJson(json, TList.class);
		return list;
	}
	
	/**
	 * @param boardId 
	 * @return Gets all lists by board.
	 * @throws TrelloApiBaseException
	 */
	public List<TList> getByBoard(String boardId) throws TrelloApiBaseException{
		List<String> parts = new ArrayList<String>();
		parts.add("boards");
		parts.add(boardId);
		parts.add("lists");
		
		String json = this.getRequest(this.config.getApiBaseUrl(), parts, null);
		Gson gson = new Gson();
		Type collectionType = new TypeToken<List<TList>>(){}.getType();
		List<TList> lists = gson.fromJson(json, collectionType);
		return lists;
	}

}
