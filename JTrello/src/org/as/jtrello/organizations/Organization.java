package org.as.jtrello.organizations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.as.jtrello.base.TrelloObject;

public class Organization extends TrelloObject {

	private String name;
	private String displayName;
	private String desc;
	private String url;
	private List<String> idBoards;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<String> getIdBoards() {
		return idBoards;
	}
	public void setIdBoards(List<String> idBoards) {
		this.idBoards = idBoards;
	}
	
	@Override
	public Map<String, String> toParam() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("name", getName());
		params.put("displayName", getDisplayName());
		params.put("desc", getDesc());
		return params;
	}
	
}
