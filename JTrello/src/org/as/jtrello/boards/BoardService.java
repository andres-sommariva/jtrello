package org.as.jtrello.boards;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.as.jtrello.Config;
import org.as.jtrello.base.TrelloApiBase;
import org.as.jtrello.base.TrelloApiBaseException;

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
		
		Type typeOfT = new TypeToken<Board>(){}.getType();
		return this.doGet(parts, null, typeOfT);
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
		
		Type typeOfT = new TypeToken<List<Board>>(){}.getType();
		return this.doGet(parts, null, typeOfT);
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
		
		Type typeOfT = new TypeToken<List<Board>>(){}.getType();
		return this.doGet(parts, null, typeOfT);
	}

	/**
	 * @param board New board to be created.
	 * @return Board with updated information returned by Trello.
	 * @throws TrelloApiBaseException
	 */
	public Board create(Board board) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("boards");
		
		Type typeOfT = new TypeToken<Board>(){}.getType();
		board = this.doPost(parts, board.toParam(), typeOfT);
		
		return board;
	}
}
