package org.as.jtrello.base;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TrelloObject {

	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString(){
		return ReflectionToStringBuilder.reflectionToString(this);
	}

}
