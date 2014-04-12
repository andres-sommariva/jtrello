package org.as.jtrello.tests.notifications;

import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.as.jtrello.base.TrelloApiBaseException;
import org.as.jtrello.notifications.Notification;
import org.as.jtrello.tests.GenericServiceTest;
import org.junit.Test;

public class NotificationServiceTest extends GenericServiceTest {

	//TODO Check returned object values
	
	@Test
	public void testGet() {
		try {
			List<Notification> notifications = client.getNotifications().getByUser(props.getProperty("TRELLO_MEMBER"));
			if (notifications.size() > 0){
				//Notification notification = client.getNotifications().get(props.getProperty("TRELLO_NOTIFICATION1"));
				Notification notification = client.getNotifications().get(notifications.get(0).getId());
				System.out.println("DEBUG notification=" + notification.toString());
			} else {
				fail("Need notifications to test this method.");
			}
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
