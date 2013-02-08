package org.as.jtrello;

public class TrelloApiBaseException extends Exception {

	private static final long serialVersionUID = -7017370176994291113L;

	public TrelloApiBaseException() {
		super();
	}

	public TrelloApiBaseException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public TrelloApiBaseException(String arg0) {
		super(arg0);
	}

	public TrelloApiBaseException(Throwable arg0) {
		super(arg0);
	}

	
}
