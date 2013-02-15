package org.as.tests.jtrello.boards;

import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.as.jtrello.boards.Board;
import org.as.tests.jtrello.GenericServiceTest;
import org.junit.Test;

public class BoardServiceTest extends GenericServiceTest {

	//TODO Check returned object values
	
	@Test
	public void testGetPublic() {
		try {
			Board board = client.getBoards().get(props.getProperty("TRELLO_BOARD_PUBLIC"));
			System.out.println("DEBUG board=" + board.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testGetPrivate() {
		try {
			Board board = client.getBoards().get(props.getProperty("TRELLO_BOARD_PRIVATE"));
			System.out.println("DEBUG board=" + board.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testGetByUser() {
		Board board;
		try {
			List<Board> boards = client.getBoards().getByUser(props.getProperty("TRELLO_MEMBER"));
			Iterator<Board> iterator = boards.iterator();
			while (iterator.hasNext()) {
				board = iterator.next();
				System.out.println("DEBUG board=" + board.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testGetByOrganization() {
		Board board;
		try {
			List<Board> boards = client.getBoards().getByOrganization(props.getProperty("TRELLO_ORGANIZATION"));
			Iterator<Board> iterator = boards.iterator();
			while (iterator.hasNext()) {
				board = iterator.next();
				System.out.println("DEBUG board=" + board.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
