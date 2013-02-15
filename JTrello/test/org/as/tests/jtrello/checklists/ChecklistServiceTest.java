package org.as.tests.jtrello.checklists;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.as.jtrello.checklists.Checklist;
import org.as.tests.jtrello.GenericServiceTest;
import org.junit.Test;

public class ChecklistServiceTest extends GenericServiceTest {

	@Test
	public void testGet() {
		Checklist checklist = null;
		try {
			checklist = client.getChecklists().get(props.getProperty("TRELLO_CHECKLIST1"));
			System.out.println("DEBUG checklist=" + checklist.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		assertThat(checklist.getId(), 		equalTo("5112f4cb3fed01f255002873"));
		assertThat(checklist.getName(), 	equalTo("Java Libs"));
		assertThat(checklist.getIdBoard(), 	equalTo("5112f4b6c4cde7265f011fc9"));
		assertThat(checklist.getIdCard(), 	equalTo("5112f4c131b1bf1a0b004177"));
	}
	
	@Test
	public void testGetByCard() {
		Checklist checklist;
		try {
			List<Checklist> checklists = client.getChecklists().getByCard(props.getProperty("TRELLO_CARD1"));
			Iterator<Checklist> iterator = checklists.iterator();
			while (iterator.hasNext()) {
				checklist = iterator.next();
				System.out.println("DEBUG checklist=" + checklist.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
