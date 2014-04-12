package org.as.jtrello.boards;

import java.util.HashMap;
import java.util.Map;

import org.as.jtrello.base.TrelloObject;

public class Board extends TrelloObject {

	private String name;
	private String desc;
	private boolean closed;
	private String idOrganization;
	private String url;
	//private Preferences prefs;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	public String getIdOrganization() {
		return idOrganization;
	}
	public void setIdOrganization(String idOrganization) {
		this.idOrganization = idOrganization;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public Map<String, String> toParam() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("name", getName());
		params.put("desc", getDesc());
		params.put("idOrganization", getIdOrganization());
		return params;
	}
	
}
