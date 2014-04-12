package org.as.jtrello.cards;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.as.jtrello.Config;
import org.as.jtrello.base.TrelloApiBase;
import org.as.jtrello.base.TrelloApiBaseException;

import com.google.gson.reflect.TypeToken;

public class CardService extends TrelloApiBase {

	/**
	 * @param config
	 */
	public CardService(Config config) {
		super(config);
	}
	
	/**
	 * @param id Card id or shortlink.
	 * @return Gets a card by id or shortlink.
	 * @throws TrelloApiBaseException
	 */
	public Card get(String id) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("cards");
		parts.add(id);
		
		Type typeOfT = new TypeToken<Card>(){}.getType();
		return this.doGet(parts, null, typeOfT);
	}
	
	/**
	 * @param boardId 
	 * @return Gets a card list by board.
	 * @throws TrelloApiBaseException
	 */
	public List<Card> getByBoard(String boardId) throws TrelloApiBaseException{
		List<String> parts = new ArrayList<String>();
		parts.add("boards");
		parts.add(boardId);
		parts.add("cards");
		
		Type typeOfT = new TypeToken<List<Card>>(){}.getType();
		return this.doGet(parts, null, typeOfT);
	}
	
	/**
	 * @param key Id or username. 'me' will respond as if you had supplied the username associated with the supplied token.
	 * @return Gets a card list by member.
	 * @throws TrelloApiBaseException
	 */
	public List<Card> getByUser(String key) throws TrelloApiBaseException{
		List<String> parts = new ArrayList<String>();
		parts.add("members");
		parts.add(key);
		parts.add("cards");
		
		Type typeOfT = new TypeToken<List<Card>>(){}.getType();
		return this.doGet(parts, null, typeOfT);
	}
	
	/**
	 * @param card New card to be created.
	 * @return Card with updated information returned by Trello.
	 * @throws TrelloApiBaseException
	 */
	public Card create(Card card) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("cards");
		
		Type typeOfT = new TypeToken<Card>(){}.getType();
		card = this.doPost(parts, card.toParam(), typeOfT);
		
		return card;
	}

}
