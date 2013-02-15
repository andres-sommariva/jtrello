package org.as.tests.jtrello.notifications;

import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.as.jtrello.base.TrelloApiBaseException;
import org.as.jtrello.notifications.Notification;
import org.as.tests.jtrello.GenericServiceTest;
import org.junit.Test;

public class NotificationServiceTest extends GenericServiceTest {

	//TODO Check returned object values
	
	@Test
	public void testGet() {
		try {
			Notification notification = client.getNotifications().get(props.getProperty("TRELLO_NOTIFICATION1"));
			System.out.println("DEBUG notification=" + notification.toString());
		} catch (TrelloApiBaseException e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testGetByUser() {
		Notification notification;
		try {
			List<Notification> notifications = client.getNotifications().getByUser(props.getProperty("TRELLO_MEMBER"));
			Iterator<Notification> iterator = notifications.iterator();
			while (iterator.hasNext()) {
				notification = iterator.next();
				System.out.println("DEBUG notification=" + notification.toString());
			}
		} catch (TrelloApiBaseException e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testGetByUserMe() {
		Notification notification;
		try {
			List<Notification> notifications = client.getNotifications().getByUser("me");
			Iterator<Notification> iterator = notifications.iterator();
			while (iterator.hasNext()) {
				notification = iterator.next();
				System.out.println("DEBUG notification=" + notification.toString());
			}
		} catch (TrelloApiBaseException e) {
			e.printStackTrace();
			fail();
		}
	}

}
