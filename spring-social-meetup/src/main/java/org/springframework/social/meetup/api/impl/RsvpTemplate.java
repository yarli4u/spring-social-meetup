package org.springframework.social.meetup.api.impl;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.social.meetup.api.Event;
import org.springframework.social.meetup.api.Response;
import org.springframework.social.meetup.api.Rsvp;
import org.springframework.social.meetup.api.RsvpOperations;
import org.springframework.social.meetup.api.RsvpResults;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
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
		//System.out.println("Location:" + uri.toASCIIString());
		return rsvp;
	}

	@Override
	public Rsvp create(String eventID, Response response) {
		// TODO Auto-generated method stub
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String,String>();
		params.add("event_id", eventID);
		params.add("rsvp", response.getValue());
		
		Event event = new Event("http://www.meetup.com/Meetup-API-Testing/events/179847252/",eventID,"May NYTM");
		Rsvp rsvp = new Rsvp(event,response);
		
		URI uri = restTemplate.postForLocation(buildUri(RSVP_URL,params).toString(), null);
		
		if ( uri != null)
			System.out.println("Location:" + uri.toString());
		return rsvp;
	}

	//URL Constants.
	public static final String RSVPS_URL = "2/rsvps";
	public static final String RSVP_URL = "2/rsvp";
}
