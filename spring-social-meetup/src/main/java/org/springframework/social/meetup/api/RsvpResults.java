package org.springframework.social.meetup.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RsvpResults {

	private List<Rsvp> results;

	public List<Rsvp> getResults() {
		return results;
	}
	
}
