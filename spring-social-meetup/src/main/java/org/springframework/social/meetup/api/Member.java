package org.springframework.social.meetup.api;

import java.util.Locale;

public class Member {

	private String bio;
	private String status;
	private String link;
	private Locale locale;
	private String city;
	private String country;
	private String state;
	private String email;
	private String gender;
	private String id;
	private String visited;
	private String name;
	private String photo_url;
	private int membershipCount;
		
	public String getStatus() {
		return status;
	}
	public String getLink() {
		return link;
	}
	public Locale getLocale() {
		return locale;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public String getId() {
		return id;
	}
	public String getVisited() {
		return visited;
	}
	public String getName() {
		return name;
	}
	public String getBio() {
		return bio;
	}
	public String getState() {
		return state;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	public String getPhoto_url() {
		return photo_url;
	}
	public int getMembershipCount() {
		return membershipCount;
	}
	
}
