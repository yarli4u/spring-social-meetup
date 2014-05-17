package org.springframework.social.meetup.api;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RsvpRules {
	
	private Date close_time;
	private boolean closed;
	private int guest_limit;
	private Date open_time;
	private String refund_policy;
	private int days;
	private String notes;
	
	public Date getClose_time() {
		return close_time;
	}
	public boolean isClosed() {
		return closed;
	}
	public int getGuest_limit() {
		return guest_limit;
	}
	public Date getOpen_time() {
		return open_time;
	}
	public String getRefund_policy() {
		return refund_policy;
	}
	public int getDays() {
		return days;
	}
	public String getNotes() {
		return notes;
	}
	
}
