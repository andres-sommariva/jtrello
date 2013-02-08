package org.as.tests.jtrello;

import org.as.jtrello.JTrelloClient;
import org.junit.BeforeClass;

public abstract class GenericServiceTest {

	protected static JTrelloClient client;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		GenericServiceTest.client = new JTrelloClient(TestValues.TRELLO_API_KEY, TestValues.TRELLO_USER_TOKEN);
	}

}
