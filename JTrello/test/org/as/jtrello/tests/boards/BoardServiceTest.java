package org.as.jtrello.tests.boards;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.as.jtrello.boards.Board;
import org.as.jtrello.tests.GenericServiceTest;
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
	
	@Test
	public void testCreate() {
		Board board = new Board();
		board.setName("TestBoard"+System.currentTimeMillis());
		board.setDesc("Test board created on: " + (new Date()).toString());
		board.setIdOrganization(props.getProperty("TRELLO_ORGANIZATION_TOWRITE"));
		try {
			Board newBoard = client.getBoards().create(board);
			System.out.println("DEBUG board=" + board.toString());
			System.out.println("DEBUG newBoard=" + newBoard.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
