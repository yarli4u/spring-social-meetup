package org.springframework.social.meetup.api;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Status {

	UPCOMING("upcoming"),
	PROPOSED("proposed"),
	SUGGESTED("suggested"),
	CANCELLED("cancelled"),
	DRAFT("draft"),
	PAST("past");
	
	private String value;
	
	private Status(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	@JsonValue
	public String getValue() {
		return value;
	}
		
}
