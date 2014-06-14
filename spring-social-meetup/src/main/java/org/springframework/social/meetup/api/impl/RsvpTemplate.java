package org.springframework.social.meetup.api.impl;

import java.net.URI;
import java.util.List;

import org.springframework.social.meetup.api.Response;
import org.springframework.social.meetup.api.Rsvp;
import org.springframework.social.meetup.api.RsvpOperations;
import org.springframework.social.meetup.api.RsvpResults;
import org.springframework.web.client.RestTemplate;

public class RsvpTemplate extends AbstractMeetupOperations implements
		RsvpOperations {

	private final RestTemplate restTemplate;
	
	public RsvpTemplate(RestTemplate restTemplate, boolean authorized) {
		super(authorized);
		this.restTemplate = restTemplate;
	}
	
	@Override
	public List<Rsvp> findByEvent(String eventID) {
		
		RsvpResults results = restTemplate.getForObject(buildUri(RSVPS_URL, "event_id", eventID), RsvpResults.class);
		List<Rsvp> rsvps = results.getResults();
		return rsvps;
	}

	@Override
	public Rsvp create(String eventID) {
		// TODO Auto-generated method stub
		Rsvp rsvp = new Rsvp();
		URI uri = restTemplate.postForLocation(buildUri(RSVP_URL, "event_id", eventID), rsvp);
		System.out.println("Location:" + uri.toASCIIString());
		return null;
	}

	@Override
	public Rsvp create(String eventID, Response response) {
		// TODO Auto-generated method stub
		return null;
	}

	//URL Constants.
	public static final String RSVPS_URL = "2/rsvps";
	public static final String RSVP_URL = "2/rsvp";
}
