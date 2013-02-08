package org.as.jtrello.boards;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Board {

	private String id;
	private String name;
	private String desc;
	private boolean closed;
	private String idOrganization;
	private String url;
	//private Preferences prefs;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String toString(){
		return ReflectionToStringBuilder.reflectionToString(this);
	}
}
