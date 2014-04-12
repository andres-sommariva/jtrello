package org.as.jtrello.actions;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.as.jtrello.base.TrelloObject;
import org.as.jtrello.boards.Board;
import org.as.jtrello.cards.Card;
import org.as.jtrello.members.Member;

public class Action extends TrelloObject {

	private String idMemberCreator;
	private String type;
	private String date;
	private Member memberCreator;
	
	public class Data {
		private String text;
		private Board board;
		private Card card;
		
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public Board getBoard() {
			return board;
		}
		public void setBoard(Board board) {
			this.board = board;
		}
		public Card getCard() {
			return card;
		}
		public void setCard(Card card) {
			this.card = card;
		}
		
		@Override
		public String toString(){
			return ReflectionToStringBuilder.reflectionToString(this);
		}
		
	}
	private Data data;
	
	public String getIdMemberCreator() {
		return idMemberCreator;
	}
	public void setIdMemberCreator(String idMemberCreator) {
		this.idMemberCreator = idMemberCreator;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Member getMemberCreator() {
		return memberCreator;
	}
	public void setMemberCreator(Member memberCreator) {
		this.memberCreator = memberCreator;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	
	@Override
	public Map<String, String> toParam() {
		Map<String, String> params = new HashMap<String, String>();
		return params;
	}
	
}
