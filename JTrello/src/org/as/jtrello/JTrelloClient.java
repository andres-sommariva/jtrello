package org.as.jtrello;

import org.as.jtrello.boards.BoardService;
import org.as.jtrello.cards.CardService;
import org.as.jtrello.members.MemberService;
import org.as.jtrello.organizations.OrganizationService;

public class JTrelloClient {
	private MemberService members;
	private OrganizationService organizations;
	private BoardService boards;
	private CardService cards;

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
		this.cards			= new CardService(config);
		
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
	public CardService getCards() {
		return this.cards;
	}
}
