package org.as.tests.jtrello.members;

import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.as.jtrello.members.Member;
import org.as.tests.jtrello.GenericServiceTest;
import org.junit.Test;

public class MemberServiceTest extends GenericServiceTest {
	
	//TODO Check returned object values
	
	@Test
	public void testGet() {
		try {
			Member member = client.getMembers().get(props.getProperty("TRELLO_MEMBER"));
			System.out.println("DEBUG member=" + member.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testGetMe() {
		try {
			Member member = client.getMembers().get("me");
			System.out.println("DEBUG member=" + member.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testGetByOrganization() {
		Member member;
		try {
			List<Member> members = client.getMembers().getByOrganization(props.getProperty("TRELLO_ORGANIZATION"));
			Iterator<Member> iterator = members.iterator();
			while (iterator.hasNext()) {
				member = iterator.next();
				System.out.println("DEBUG member=" + member.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testGetByBoard() {
		Member member;
		try {
			List<Member> members = client.getMembers().getByBoard(props.getProperty("TRELLO_BOARD_PRIVATE"));//JTrello
			Iterator<Member> iterator = members.iterator();
			while (iterator.hasNext()) {
				member = iterator.next();
				System.out.println("DEBUG member=" + member.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testGetByCard() {
		Member member;
		try {
			List<Member> members = client.getMembers().getByCard(props.getProperty("TRELLO_CARD1"));
			Iterator<Member> iterator = members.iterator();
			while (iterator.hasNext()) {
				member = iterator.next();
				System.out.println("DEBUG member=" + member.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
