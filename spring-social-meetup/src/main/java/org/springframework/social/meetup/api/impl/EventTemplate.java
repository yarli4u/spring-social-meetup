package org.springframework.social.meetup.api.impl;

import java.util.List;

import org.springframework.social.meetup.api.Event;
import org.springframework.social.meetup.api.EventOperations;
import org.springframework.social.meetup.api.EventResults;
import org.springframework.web.client.RestTemplate;

public class EventTemplate extends AbstractMeetupOperations implements 
			EventOperations {

	private final RestTemplate restTemplate;
	
	public EventTemplate(RestTemplate restTemplate, boolean authorized) {
		super(authorized);
		this.restTemplate = restTemplate;
	}
	
	@Override
	public List<Event> findByMember() {
		
		EventResults eventlist = restTemplate.getForObject(buildUri(EVENTS_URL, "member_id", "self"), EventResults.class);
		List<Event> events = eventlist.getResults();
		
		return events;
	}
	
	@Override
	public List<Event> findByMember(String memberID) {
		
		EventResults eventlist = restTemplate.getForObject(buildUri(EVENTS_URL, "member_id", memberID), EventResults.class);
		List<Event> events = eventlist.getResults();
		
		return events;
	}

	@Override
	public List<Event> findByGroup(String groupID) {
		
		EventResults eventlist = restTemplate.getForObject(buildUri(EVENTS_URL, "group_id", groupID), EventResults.class);
		List<Event> events = eventlist.getResults();
		
		return events;
	}
	
	@Override
	public List<Event> findByGroup(List<String> groupID) {
		
		int idsLength = groupID.toString().length()-1;
		String gIds = groupID.toString().substring(1, idsLength).replace(", ", ",");
		
		EventResults eventlist = restTemplate.getForObject(buildUri(EVENTS_URL,"group_id",gIds), EventResults.class);
		List<Event> events = eventlist.getResults();
		
		return events;
	}

	//URL Constants
	public static final String EVENTS_URL = "events";

}
