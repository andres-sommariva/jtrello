package org.as.jtrello.notifications;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.as.jtrello.Config;
import org.as.jtrello.base.TrelloApiBase;
import org.as.jtrello.base.TrelloApiBaseException;

import com.google.gson.reflect.TypeToken;

public class NotificationService extends TrelloApiBase {

	/**
	 * @param config
	 */
	public NotificationService(Config config) {
		super(config);
	}
	
	/**
	 * @param id Notification id.
	 * @return Gets a notification by id.
	 * @throws TrelloApiBaseException
	 */
	public Notification get(String id) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("notifications");
		parts.add(id);
		
		Type typeOfT = new TypeToken<Notification>(){}.getType();
		return this.doGet(parts, null, typeOfT);
	}
	
	/**
	 * @param key Id or username. 'me' will respond as if you had supplied the username associated with the supplied token.
	 * @return Gets a notification list by member.
	 * @throws TrelloApiBaseException
	 */
	public List<Notification> getByUser(String key) throws TrelloApiBaseException {
		List<String> parts = new ArrayList<String>();
		parts.add("members");
		parts.add(key);
		parts.add("notifications");
		
		Type typeOfT = new TypeToken<List<Notification>>(){}.getType();
		return this.doGet(parts, null, typeOfT);
	}

}
