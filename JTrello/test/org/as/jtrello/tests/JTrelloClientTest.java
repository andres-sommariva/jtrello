package org.as.jtrello.tests;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.as.jtrello.JTrelloClient;
import org.junit.Test;

public class JTrelloClientTest {
	
	private Properties props;
	
	public JTrelloClientTest() {
		props = new Properties();
		try {
			props.load(new InputStreamReader(JTrelloClientTest.class.getClassLoader().getResourceAsStream("resources/testvalues.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testJTrelloClientString() {
		JTrelloClient client = new JTrelloClient(props.getProperty("TRELLO_API_KEY"), null);
		assertNotNull(client);
	}
	
	@Test
	public void testJTrelloClientStringStringString() {
		JTrelloClient client = new JTrelloClient(props.getProperty("TRELLO_API_KEY"), 
				props.getProperty("TRELLO_SECRET_KEY"), props.getProperty("TRELLO_USER_TOKEN"));
		assertNotNull(client);
	}

}
