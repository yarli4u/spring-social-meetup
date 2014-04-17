package org.springframework.social.meetup.api;

import java.math.BigInteger;

public class Group {

	private BigInteger id;
	private double group_lat;
	private String name;
	private double group_lon;
	private String urlname;
	private String who;
	
	public BigInteger getId() {
		return id;
	}
	public double getGroup_lat() {
		return group_lat;
	}
	public String getName() {
		return name;
	}
	public double getGroup_lon() {
		return group_lon;
	}
	public String getUrlname() {
		return urlname;
	}
	public String getWho() {
		return who;
	}
	
}
