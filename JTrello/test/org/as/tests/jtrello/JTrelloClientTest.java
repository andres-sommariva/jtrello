package org.as.tests.jtrello;

import static org.junit.Assert.assertNotNull;

import org.as.jtrello.JTrelloClient;
import org.junit.Test;

public class JTrelloClientTest {

	@Test
	public void testJTrelloClientString() {
		JTrelloClient client = new JTrelloClient(TestValues.TRELLO_API_KEY, null);
		assertNotNull(client);
	}
	
	@Test
	public void testJTrelloClientStringStringString() {
		JTrelloClient client = new JTrelloClient(TestValues.TRELLO_API_KEY, 
				TestValues.TRELLO_SECRET_KEY, TestValues.TRELLO_USER_TOKEN);
		assertNotNull(client);
	}

}
