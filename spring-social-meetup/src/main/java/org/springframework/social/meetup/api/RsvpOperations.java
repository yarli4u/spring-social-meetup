package org.springframework.social.meetup.api;

import java.util.List;

public interface RsvpOperations {

	public List<Rsvp> findByEvent(String eventID);
	
	public Rsvp create(String eventID);
	public Rsvp create(String eventID,Response response);
}
