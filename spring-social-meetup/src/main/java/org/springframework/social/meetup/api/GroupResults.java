package org.springframework.social.meetup.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupResults {

	private List<Group> results;

	public List<Group> getResults() {
		return results;
	}
	
}
