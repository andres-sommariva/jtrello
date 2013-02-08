package org.as.jtrello.boards;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.as.jtrello.Config;
import org.as.jtrello.TrelloApiBase;
import org.as.jtrello.TrelloApiBaseException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class BoardService extends TrelloApiBase {

	/**
	 * @param config
	 */
	public BoardService(Config config) {
		super(config);
	}
	
	/**
	 * @param id
	 * @return Gets a board by id.
	 * @throws TrelloApiBaseException
	 */
	public Board get(String id) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("boards");
		parts.add(id);
		
		String json = this.getRequest(this.config.getApiBaseUrl(), parts, null);
		Gson gson = new Gson();
		Board board = gson.fromJson(json, Board.class);
		return board;
	}
	
	/**
	 * @param key id or username. 'me' will respond as if you had supplied the username associated with the supplied token.
	 * @return Gets all member boards.
	 * @throws TrelloApiBaseException
	 */
	public List<Board> getByUser(String key) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("members");
		parts.add(key);
		parts.add("boards");
		
		String json = this.getRequest(this.config.getApiBaseUrl(), parts, null);
		Gson gson = new Gson();
		Type collectionType = new TypeToken<List<Board>>(){}.getType();
		List<Board> boards = gson.fromJson(json, collectionType);
		return boards;
	}
	
	/**
	 * @param key Organization id or name.
	 * @return  Gets all boards in the organization.
	 * @throws TrelloApiBaseException
	 */
	public List<Board> getByOrganization(String key) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("organizations");
		parts.add(key);
		parts.add("boards");
		
		String json = this.getRequest(this.config.getApiBaseUrl(), parts, null);
		Gson gson = new Gson();
		Type collectionType = new TypeToken<List<Board>>(){}.getType();
		List<Board> boards = gson.fromJson(json, collectionType);
		return boards;
	}

}
