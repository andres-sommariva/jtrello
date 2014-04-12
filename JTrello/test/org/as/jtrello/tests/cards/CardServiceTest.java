package org.as.jtrello.tests.cards;

import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.as.jtrello.cards.Card;
import org.as.jtrello.tests.GenericServiceTest;
import org.junit.Test;

public class CardServiceTest extends GenericServiceTest {

	//TODO Check returned object values
	
	@Test
	public void testGet() {
		try {
			Card card = client.getCards().get(props.getProperty("TRELLO_CARD1"));
			System.out.println("DEBUG card=" + card.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		try {
			Card card = client.getCards().get(props.getProperty("TRELLO_CARD2"));
			System.out.println("DEBUG card=" + card.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testGetByBoard() {
		Card card;
		try {
			List<Card> cards = client.getCards().getByBoard(props.getProperty("TRELLO_BOARD_PRIVATE"));
			Iterator<Card> iterator = cards.iterator();
			while (iterator.hasNext()) {
				card = iterator.next();
				System.out.println("DEBUG card=" + card.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testGetByUser() {
		Card card;
		try {
			List<Card> cards = client.getCards().getByUser(props.getProperty("TRELLO_MEMBER"));
			Iterator<Card> iterator = cards.iterator();
			while (iterator.hasNext()) {
				card = iterator.next();
				System.out.println("DEBUG card=" + card.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testGetByUserMe() {
		Card card;
		try {
			List<Card> cards = client.getCards().getByUser("me");
			Iterator<Card> iterator = cards.iterator();
			while (iterator.hasNext()) {
				card = iterator.next();
				System.out.println("DEBUG card=" + card.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testCreate() {
		Card card = new Card();
		card.setName("TestCard");
		card.setDesc("This card is created for test purposes.");
		card.setIdList(props.getProperty("TRELLO_LIST_TOWRITE"));
		try {
			Card newCard = client.getCards().create(card);
			System.out.println("DEBUG card=" + card.toString());
			System.out.println("DEBUG newCard=" + newCard.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
}
