package org.as.jtrello.base;

import java.util.Map;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public abstract class TrelloObject {

	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public abstract Map<String, String> toParam();
	
	@Override
	public String toString(){
		return ReflectionToStringBuilder.reflectionToString(this);
	}

}
