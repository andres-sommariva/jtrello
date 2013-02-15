package org.as.jtrello;

import org.as.jtrello.actions.ActionService;
import org.as.jtrello.boards.BoardService;
import org.as.jtrello.cards.CardService;
import org.as.jtrello.checklists.ChecklistService;
import org.as.jtrello.lists.ListService;
import org.as.jtrello.members.MemberService;
import org.as.jtrello.notifications.NotificationService;
import org.as.jtrello.organizations.OrganizationService;

public class JTrelloClient {
	private MemberService members;
	private OrganizationService organizations;
	private BoardService boards;
	private ListService lists;
	private CardService cards;
	private ChecklistService checklists;
	private NotificationService notifications;
	private ActionService actions;

	/**
	 * 
	 * @param authKey the Trello App Key (can be retrieved from https://trello.com/1/appKey/generate)
	 */
	public JTrelloClient(String authKey) {
	    this(authKey, null, null);
	}
	
	/**
	 * 
	 * @param authKey the Trello App Key (can be retrieved from https://trello.com/1/appKey/generate)
	 * @param authToken the Trello user token (can be generated with various expiration dates and
	 * permissions via instructions at https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user)
	 */
	public JTrelloClient(String authKey, String authToken) {
	    this(authKey, null, authToken);
	}
	
	/**
	 * @param authKey the Trello App Key (can be retrieved from https://trello.com/1/appKey/generate)
	 * @param secretKey the Trello "secret" (can be retrieved from https://trello.com/1/appKey/generate)
	 * @param authToken the Trello user token (can be generated with various expiration dates and
	 * permissions via instructions at https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user)
	 */
	public JTrelloClient(String authKey, String secretKey, String authToken) {
		Config config = Config.getInstance(authKey, secretKey, authToken);
	    
		this.members 		= new MemberService(config);
		this.organizations 	= new OrganizationService(config);
		this.boards 		= new BoardService(config);
		this.lists			= new ListService(config);
		this.cards			= new CardService(config);
		this.checklists		= new ChecklistService(config);
		this.notifications	= new NotificationService(config);
		this.actions		= new ActionService(config);
		
	}
	
	public MemberService getMembers() {
		return this.members;
	}
	public OrganizationService getOrganizations() {
		return this.organizations;
	}
	public BoardService getBoards() {
		return this.boards;
	}
	public ListService getLists() {
		return this.lists;
	}
	public CardService getCards() {
		return this.cards;
	}
	public ChecklistService getChecklists() {
		return this.checklists;
	}
	public NotificationService getNotifications() {
		return this.notifications;
	}
	public ActionService getActions() {
		return this.actions;
	}
}
