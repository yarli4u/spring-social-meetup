package org.springframework.social.meetup.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventResults {

	private List<Event> results;

	public List<Event> getResults() {
		return results;
	}
	
}
