package org.springframework.social.meetup.api;

/**
 * 
 * @author  Suresh Kumar (yarli4u).
 *
 */

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {

	private String bio;
	private Birthday birthday;
	private String country;
	private String city;
	private String state;
	private String email;
	private Gender gender;
	private String hometown;
	private String id;
	private BigInteger joined;
	private Locale lang;
	private double lat;
	private double lon;
	private String link;
	private int membershipCount;
	private String name;
	private Photo photo;
	private String photo_url;
	private String status;
	private List<Topic> topics;
	private String visited;
	
	public String getBio() {
		return bio;
	}
	public Birthday getBirthday() {
		return birthday;
	}
	public String getCountry() {
		return country;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getEmail() {
		return email;
	}
	public Gender getGender() {
		return gender;
	}
	public String getHometown() {
		return hometown;
	}
	public String getId() {
		return id;
	}
	public BigInteger getJoined() {
		return joined;
	}
	public Locale getLang() {
		return lang;
	}
	public double getLat() {
		return lat;
	}
	public double getLon() {
		return lon;
	}
	public String getLink() {
		return link;
	}
	public int getMembershipCount() {
		return membershipCount;
	}
	public String getName() {
		return name;
	}
	public Photo getPhoto() {
		return photo;
	}
	public String getPhoto_url() {
		return photo_url;
	}
	public String getStatus() {
		return status;
	}
	public List<Topic> getTopics() {
		return topics;
	}
	public String getVisited() {
		return visited;
	}

}
