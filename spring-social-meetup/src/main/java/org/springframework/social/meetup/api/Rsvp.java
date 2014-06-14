package org.springframework.social.meetup.api;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Suresh Kumar (yarli4u).
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rsvp {

	private String comments;
	private BigInteger created;
	private int guests;
	private boolean host;
	private BigInteger mtime;
	private Response response;
	private BigInteger rsvp_id;
	private Venue venue;
	private boolean watching;
	
	public String getComments() {
		return comments;
	}
	public BigInteger getCreated() {
		return created;
	}
	public int getGuests() {
		return guests;
	}
	public boolean isHost() {
		return host;
	}
	public BigInteger getMtime() {
		return mtime;
	}
	public Response getResponse() {
		return response;
	}
	public BigInteger getRsvp_id() {
		return rsvp_id;
	}
	public Venue getVenue() {
		return venue;
	}
	public boolean isWatching() {
		return watching;
	}
}
