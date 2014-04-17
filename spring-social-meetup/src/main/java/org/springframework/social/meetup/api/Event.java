package org.springframework.social.meetup.api;

/**
 * 
 * @author  Suresh Kumar (yarli4u).
 *
 */

import java.math.BigInteger;

public class Event {

	private int rsvp_limit;
	private int maybe_rsvp_count;
	private BigInteger id;
	private int waitlist_count;
	private int yes_rsvp_count;
	private String event_url;
	private String description;
	private String name;
	private int headcount;
	private Venue venue;
	private Group group;
	
	public int getRsvp_limit() {
		return rsvp_limit;
	}
	public int getMaybe_rsvp_count() {
		return maybe_rsvp_count;
	}
	public BigInteger getId() {
		return id;
	}
	public int getWaitlist_count() {
		return waitlist_count;
	}
	public int getYes_rsvp_count() {
		return yes_rsvp_count;
	}
	public String getEvent_url() {
		return event_url;
	}
	public String getDescription() {
		return description;
	}
	public String getName() {
		return name;
	}
	public int getHeadcount() {
		return headcount;
	}
	public Venue getVenue() {
		return venue;
	}
	public Group getGroup() {
		return group;
	}
	
}
