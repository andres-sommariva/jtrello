package org.as.jtrello.notifications;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.as.jtrello.base.TrelloObject;
import org.as.jtrello.boards.Board;
import org.as.jtrello.cards.Card;
import org.as.jtrello.members.Member;

public class Notification extends TrelloObject {

	private boolean unread;
	private String type;
	private String date;
	
	public class Data {
		private String text;
		private Card card;
		private Board board;
		
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public Card getCard() {
			return card;
		}
		public void setCard(Card card) {
			this.card = card;
		}
		public Board getBoard() {
			return board;
		}
		public void setBoard(Board board) {
			this.board = board;
		}
		
		@Override
		public String toString() {
			return ReflectionToStringBuilder.reflectionToString(this);
		}
	}
	private Data data;
	private Member memberCreator;
	
	public boolean isUnread() {
		return unread;
	}
	public void setUnread(boolean unread) {
		this.unread = unread;
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
	public Data getData() {
		return this.data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public Member getMemberCreator() {
		return this.memberCreator;
	}
	public void setMemberCreator(Member memberCreator) {
		this.memberCreator = memberCreator;
	}
	
}
