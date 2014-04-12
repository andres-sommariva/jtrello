package org.as.jtrello.lists;

import java.util.HashMap;
import java.util.Map;

import org.as.jtrello.base.TrelloObject;

public class TList extends TrelloObject {

	private String name;
	private String idBoard;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdBoard() {
		return idBoard;
	}
	public void setIdBoard(String idBoard) {
		this.idBoard = idBoard;
	}
	
	@Override
	public Map<String, String> toParam() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("name", getName());
		params.put("idBoard", getIdBoard());
		return params;
	}
	
}
