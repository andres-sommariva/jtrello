package org.as.tests.jtrello.members;

import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.as.jtrello.members.Member;
import org.as.tests.jtrello.GenericServiceTest;
import org.as.tests.jtrello.TestValues;
import org.junit.Test;

public class MemberServiceTest extends GenericServiceTest {
	
	@Test
	public void testGet() {
		try {
			Member member = client.getMembers().get(TestValues.TRELLO_MEMBER);
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
			List<Member> members = client.getMembers().getByOrganization("devforuser");
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
			List<Member> members = client.getMembers().getByBoard("5112f4b6c4cde7265f011fc9");//JTrello
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
