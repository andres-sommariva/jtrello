package org.as.jtrello.tests.lists;

import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.as.jtrello.lists.TList;
import org.as.jtrello.tests.GenericServiceTest;
import org.junit.Test;

public class ListServiceTest extends GenericServiceTest {

	//TODO Check returned object values
	
	@Test
	public void testGet() {
		try {
			TList list = client.getLists().get(props.getProperty("TRELLO_LIST1"));
			System.out.println("DEBUG list=" + list.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testGetByBoard() {
		TList list;
		try {
			List<TList> lists = client.getLists().getByBoard(props.getProperty("TRELLO_BOARD_PUBLIC"));
			Iterator<TList> iterator = lists.iterator();
			while (iterator.hasNext()) {
				list = iterator.next();
				System.out.println("DEBUG list=" + list.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
