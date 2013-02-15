package org.as.jtrello.members;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.as.jtrello.Config;
import org.as.jtrello.base.TrelloApiBase;
import org.as.jtrello.base.TrelloApiBaseException;

import com.google.gson.reflect.TypeToken;

public class MemberService extends TrelloApiBase {

	/**
	 * @param config
	 */
	public MemberService(Config config) {
		super(config);
	}
	
	/**
	 * 
	 * @param key Id or username. 'me' will respond as if you had supplied the username associated with the supplied token.
	 * @return Gets a member by id or username.
	 * @throws TrelloApiBaseException
	 */
	public Member get(String key) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("members");
		parts.add(key);
		
		Type typeOfT = new TypeToken<Member>(){}.getType();
		return this.doGet(parts, null, typeOfT);
	}
	
	/**
	 * @param organization Id or name.
	 * @return Gets a member list by organization.
	 * <br/><b>Note: </b> This method seems to return a partial representation of the member.
	 * @throws TrelloApiBaseException
	 */
	public List<Member> getByOrganization(String organization) throws TrelloApiBaseException{
		List<String> parts = new ArrayList<String>();
		parts.add("organizations");
		parts.add(organization);
		parts.add("members");
		
		// Request all member fields.
		Map<String, String> params = new HashMap<String, String>();
		params.put("fields", "all");
		
		Type typeOfT = new TypeToken<List<Member>>(){}.getType();
		return this.doGet(parts, params, typeOfT);
	}
	
	/**
	 * @param boardId 
	 * @return Gets a member list by board.
	 * <br/><b>Note: </b> This method seems to return a partial representation of the member.
	 * @throws TrelloApiBaseException
	 */
	public List<Member> getByBoard(String boardId) throws TrelloApiBaseException{
		List<String> parts = new ArrayList<String>();
		parts.add("boards");
		parts.add(boardId);
		parts.add("members");
		
		// Request all member fields.
		Map<String, String> params = new HashMap<String, String>();
		params.put("fields", "all");
		
		Type typeOfT = new TypeToken<List<Member>>(){}.getType();
		return this.doGet(parts, params, typeOfT);
	}
	
	/**
	 * @param id Card id or shortlink.
	 * @return Gets a member list by card.
	 * <br/><b>Note: </b> This method seems to return a partial representation of the member.
	 * @throws TrelloApiBaseException
	 */
	public List<Member> getByCard(String id) throws TrelloApiBaseException{
		List<String> parts = new ArrayList<String>();
		parts.add("cards");
		parts.add(id);
		parts.add("members");
		
		// Request all member fields.
		Map<String, String> params = new HashMap<String, String>();
		params.put("fields", "all");
		
		Type typeOfT = new TypeToken<List<Member>>(){}.getType();
		return this.doGet(parts, params, typeOfT);
	}

}
