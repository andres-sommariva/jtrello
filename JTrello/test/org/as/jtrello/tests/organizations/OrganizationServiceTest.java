package org.as.jtrello.tests.organizations;

import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.as.jtrello.organizations.Organization;
import org.as.jtrello.tests.GenericServiceTest;
import org.junit.Test;

public class OrganizationServiceTest extends GenericServiceTest {

	//TODO Check returned object values
	
	@Test
	public void testGet() {
		try {
			Organization organization = OrganizationServiceTest.client.getOrganizations().get(props.getProperty("TRELLO_ORGANIZATION"));
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
			List<Organization> organizations = OrganizationServiceTest.client.getOrganizations().getByUser(props.getProperty("TRELLO_MEMBER"));
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
	
	@Test
	public void testCreate() {
		Organization organization = new Organization();
		organization.setName("testOrganization");
		organization.setDisplayName("Test Organization");
		organization.setDesc("This organization is created for test purposes.");
		try {
			Organization newOrganization = OrganizationServiceTest.client.getOrganizations().create(organization);
			System.out.println("DEBUG organization=" + organization.toString());
			System.out.println("DEBUG newOrganization=" + newOrganization.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
