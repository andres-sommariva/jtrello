package org.as.jtrello.lists;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.as.jtrello.Config;
import org.as.jtrello.base.TrelloApiBase;
import org.as.jtrello.base.TrelloApiBaseException;

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
		
		Type typeOfT = new TypeToken<TList>(){}.getType();
		return this.doGet(parts, null, typeOfT);
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
		
		Type typeOfT = new TypeToken<List<TList>>(){}.getType();
		return this.doGet(parts, null, typeOfT);
	}
	
	/**
	 * @param list New list to be created.
	 * @return TList with updated information returned by Trello.
	 * @throws TrelloApiBaseException
	 */
	public TList create(TList list) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("lists");
		
		Type typeOfT = new TypeToken<TList>(){}.getType();
		list = this.doPost(parts, list.toParam(), typeOfT);
		
		return list;
	}

}
