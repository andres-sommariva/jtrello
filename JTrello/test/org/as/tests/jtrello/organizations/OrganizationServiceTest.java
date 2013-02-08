package org.as.tests.jtrello.organizations;

import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.as.jtrello.organizations.Organization;
import org.as.tests.jtrello.GenericServiceTest;
import org.as.tests.jtrello.TestValues;
import org.junit.Test;

public class OrganizationServiceTest extends GenericServiceTest {

	@Test
	public void testGet() {
		try {
			Organization organization = OrganizationServiceTest.client.getOrganizations().get(TestValues.TRELLO_ORGANIZATION);
			System.out.println("DEBUG organization=" + organization.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testGetByUser() {
		Organization organization;
		try {
			List<Organization> organizations = OrganizationServiceTest.client.getOrganizations().getByUser(TestValues.TRELLO_MEMBER);
			Iterator<Organization> iterator = organizations.iterator();
			while (iterator.hasNext()) {
				organization = iterator.next();
				System.out.println("DEBUG organization=" + organization.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testGetByUserMe() {
		Organization organization;
		try {
			List<Organization> organizations = OrganizationServiceTest.client.getOrganizations().getByUser("me");
			Iterator<Organization> iterator = organizations.iterator();
			while (iterator.hasNext()) {
				organization = iterator.next();
				System.out.println("DEBUG organization=" + organization.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
