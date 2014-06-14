package org.springframework.social.meetup.api.impl;

import java.util.List;

import org.springframework.social.meetup.api.Group;
import org.springframework.social.meetup.api.GroupOperations;
import org.springframework.social.meetup.api.GroupResults;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class GroupTemplate extends AbstractMeetupOperations implements
		GroupOperations {
	
	private final RestTemplate restTemplate;
	
	public GroupTemplate(RestTemplate restTemplate, boolean authorized) {
		super(authorized);
		this.restTemplate = restTemplate;
	}

	@Override
	public List<Group> findByMember() {
		
		GroupResults results = restTemplate.getForObject(buildUri(GROUPS_URL, "member_id", "self"), GroupResults.class);
		List<Group> groups = results.getResults();
		
		return groups;
	}

	@Override
	public List<Group> findByMember(String memberID) {
		
		GroupResults results = restTemplate.getForObject(buildUri(GROUPS_URL, "member_id", memberID), GroupResults.class);
		List<Group> groups = results.getResults();
		
		return groups;
		
	}

	@Override
	public List<Group> findByID(String groupID) {

		GroupResults results = restTemplate.getForObject(buildUri(GROUPS_URL, "member_id", groupID), GroupResults.class);
		List<Group> groups = results.getResults();
		
		return groups;

	}

	@Override
	public List<Group> findByRadius(String country, String city) {
		
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String,String>();
		params.add("country", country);
		params.add("city", city);
		
		GroupResults results = restTemplate.getForObject(buildUri(GROUPS_URL, params), GroupResults.class);
		List<Group> groups = results.getResults();
		
		return groups;
	}

	//URL Constants
	public static final String GROUPS_URL = "2/groups"; 
}
