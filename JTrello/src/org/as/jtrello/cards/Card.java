package org.as.jtrello.cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.as.jtrello.base.TrelloObject;

public class Card extends TrelloObject {

	private String idShort;
	private String name;
	private String desc;
	private String idBoard;
	private String idList;
	private boolean closed;
	private String due = "null";
	
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
	private List<Label> labels = new ArrayList<Label>();

	public String getIdShort() {
		return idShort;
	}
	public void setIdShort(String idShort) {
		this.idShort = idShort;
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
	public Map<String, String> toParam() {
		Set<String> labelNames = new HashSet<String>();
		Iterator<Label> iterator = getLabels().iterator();
		while (iterator.hasNext()){
			labelNames.add(iterator.next().getName());
		}
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("name", getName());
		params.put("desc", getDesc());
		params.put("due", getDue());
		params.put("idList", getIdList());
		if (labels.size() > 0)
			params.put("labels", labels.toString());
		System.out.println(params);
		return params;
	}
	
}
