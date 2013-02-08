package org.as.tests.jtrello.cards;

import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.as.jtrello.cards.Card;
import org.as.tests.jtrello.GenericServiceTest;
import org.as.tests.jtrello.TestValues;
import org.junit.Test;

public class CardServiceTest extends GenericServiceTest {

	@Test
	public void testGet() {
		try {
			Card card = client.getCards().get(TestValues.TRELLO_CARD1);
			System.out.println("DEBUG card=" + card.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		try {
			Card card = client.getCards().get(TestValues.TRELLO_CARD2);
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
			List<Card> cards = client.getCards().getByBoard(TestValues.TRELLO_BOARD_PRIVATE);
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
			List<Card> cards = client.getCards().getByUser(TestValues.TRELLO_MEMBER);
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

}
