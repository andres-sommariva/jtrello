package org.as.jtrello.organizations;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Organization {

	private String id;
	private String name;
	private String displayName;
	private String desc;
	private String url;
	private List<String> idBoards;
	
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
	public String toString() {
		return ReflectionToStringBuilder.reflectionToString(this);
	}
}
