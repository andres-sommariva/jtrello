package org.as.jtrello.members;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.as.jtrello.Config;
import org.as.jtrello.TrelloApiBase;
import org.as.jtrello.TrelloApiBaseException;

import com.google.gson.Gson;
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
		
		String json = this.getRequest(this.config.getApiBaseUrl(), parts, null);
		Gson gson = new Gson();
		Member member = gson.fromJson(json, Member.class);
		return member;
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
		
		String json = this.getRequest(this.config.getApiBaseUrl(), parts, params);
		Gson gson = new Gson();
		Type collectionType = new TypeToken<List<Member>>(){}.getType();
		List<Member> members = gson.fromJson(json, collectionType);
		return members;
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
		
		String json = this.getRequest(this.config.getApiBaseUrl(), parts, params);
		Gson gson = new Gson();
		Type collectionType = new TypeToken<List<Member>>(){}.getType();
		List<Member> members = gson.fromJson(json, collectionType);
		return members;
	}

}
