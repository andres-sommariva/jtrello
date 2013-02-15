package org.as.jtrello.members;

import java.util.List;

import org.as.jtrello.base.TrelloObject;

public class Member extends TrelloObject {

	private String username;
	private String fullName;
	private String initials;
	private String avatarHash;
	private String bio;
	private String url;
	private List<String> idBoards;
	private List<String> idOrganizations;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	public String getAvatarHash() {
		return avatarHash;
	}
	public void setAvatarHash(String avatarHash) {
		this.avatarHash = avatarHash;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<String> getIdBoards() {
		return idBoards;
	}
	public void setIdBoards(List<String> idBoards) {
		this.idBoards = idBoards;
	}
	public List<String> getIdOrganizations() {
		return idOrganizations;
	}
	public void setIdOrganizations(List<String> idOrganizations) {
		this.idOrganizations = idOrganizations;
	}
	
}
