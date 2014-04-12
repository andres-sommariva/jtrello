package org.as.jtrello.checklists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.as.jtrello.base.TrelloObject;

public class Checklist extends TrelloObject {

	private String name;
	private String idBoard;
	private String idCard;
	
	public class CheckItem extends TrelloObject {
		private String state;
		private String name;
		private String type;
		private String pos;
		
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getPos() {
			return pos;
		}
		public void setPos(String pos) {
			this.pos = pos;
		}
		
		@Override
		public Map<String, String> toParam() {
			Map<String, String> params = new HashMap<String, String>();
			params.put("name", getName());
			return params;
		}
		
	}
	private List<CheckItem> checkItems;
	
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
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public List<CheckItem> getCheckItems() {
		return checkItems;
	}
	public void setCheckItems(List<CheckItem> checkItems) {
		this.checkItems = checkItems;
	}
	
	@Override
	public Map<String, String> toParam() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("name", getName());
		params.put("idBoard ", getIdBoard());
		params.put("isCard", getIdCard());
		return params;
	}
	
}
