package org.as.jtrello.cards;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Card {

	private String id;
	private String name;
	private String desc;
	private String idBoard;
	private String idList;
	private boolean closed;
	private String due;
	
	public class Label {
		private String color;
		private String name;
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return ReflectionToStringBuilder.reflectionToString(this);
		}
	}
	
	private List<Label> labels;

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
	public String getIdBoard() {
		return idBoard;
	}
	public void setIdBoard(String idBoard) {
		this.idBoard = idBoard;
	}
	public String getIdList() {
		return idList;
	}
	public void setIdList(String idList) {
		this.idList = idList;
	}
	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	public List<Label> getLabels() {
		return labels;
	}
	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}
	public String getDue() {
		return due;
	}
	public void setDue(String due) {
		this.due = due;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.reflectionToString(this);
	}

}
