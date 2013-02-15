package org.as.jtrello.tests.actions;

import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.as.jtrello.actions.Action;
import org.as.jtrello.tests.GenericServiceTest;
import org.junit.Test;

public class ActionServiceTest extends GenericServiceTest {

	@Test
	public void testGet() {
		try {
			Action action = client.getActions().get(props.getProperty("TRELLO_ACTION1"));
			System.out.println("DEBUG action=" + action.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testGetByBoard() {
		try {
			List<Action> actions = client.getActions().getByBoard(props.getProperty("TRELLO_BOARD_PUBLIC"));
			showResults(actions);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testGetByCard() {
		try {
			List<Action> actions = client.getActions().getByCard(props.getProperty("TRELLO_CARD1"));
			showResults(actions);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testGetByList() {
		try {
			List<Action> actions = client.getActions().getByList(props.getProperty("TRELLO_LIST1"));
			showResults(actions);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testGetByUser() {
		try {
			List<Action> actions = client.getActions().getByUser(props.getProperty("TRELLO_MEMBER"));
			showResults(actions);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		try {
			List<Action> actions = client.getActions().getByUser("me");
			showResults(actions);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testGetByOrganization() {
		try {
			List<Action> actions = client.getActions().getByOrganization(props.getProperty("TRELLO_ORGANIZATION"));
			showResults(actions);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	/**
	 * @param actions
	 */
	private void showResults(List<Action> actions) {
		Action action;
		Iterator<Action> iterator = actions.iterator();
		while (iterator.hasNext()) {
			action = iterator.next();
			System.out.println("DEBUG action=" + action.toString());
		}
	}
	
}
