package org.as.jtrello.tests;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.as.jtrello.JTrelloClient;
import org.junit.BeforeClass;

public abstract class GenericServiceTest {

	protected static JTrelloClient client;
	protected static Properties props;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		GenericServiceTest.props = new Properties();
		try {
			props.load(new InputStreamReader(GenericServiceTest.class.getClassLoader().getResourceAsStream("resources/testvalues.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		GenericServiceTest.client = new JTrelloClient(props.getProperty("TRELLO_API_KEY"), props.getProperty("TRELLO_USER_TOKEN"));
	}

}
