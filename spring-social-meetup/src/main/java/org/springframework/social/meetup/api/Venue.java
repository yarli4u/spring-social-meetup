package org.springframework.social.meetup.api;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Suresh Kumar (yarli4u).
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Venue {
	
	private BigInteger id;
	private double lon;
	private double lat;
	private boolean repinned;
	private String name;
	private String address_1;
	private String country;
	private String city;
	private String address_2;
	private String address_3;
	private String state;
	private String phone;
	private String zip;
	
	public BigInteger getId() {
		return id;
	}
	public double getLon() {
		return lon;
	}
	public double getLat() {
		return lat;
	}
	public boolean isRepinned() {
		return repinned;
	}
	public String getName() {
		return name;
	}
	public String getAddress_1() {
		return address_1;
	}
	public String getCountry() {
		return country;
	}
	public String getCity() {
		return city;
	}
	public String getAddress_2() {
		return address_2;
	}
	public String getAddress_3() {
		return address_3;
	}
	public String getState() {
		return state;
	}
	public String getPhone() {
		return phone;
	}
	public String getZip() {
		return zip;
	}

}
