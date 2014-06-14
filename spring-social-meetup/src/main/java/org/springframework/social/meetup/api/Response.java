package org.springframework.social.meetup.api;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author Suresh Kumar (yarli4u).
 *
 */

public enum Response {
	
	YES("yes"),
	NO("no"),
	WAITLIST("waitlist"),
	YES_PENDING_PAYMENT("yes_pending_payment");
	
	private String value;
	
	@JsonValue
	public String getValue() {
		return value;
	}
	
	private Response(String value) {
		this.value = value;
	}	
}
