package org.as.jtrello.members;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Member {

	private String id;
	private String username;
	private String fullName;
	private String initials;
	private String avatarHash;
	private String bio;
	private String url;
	private List<String> idBoards;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.reflectionToString(this);
	}

}
