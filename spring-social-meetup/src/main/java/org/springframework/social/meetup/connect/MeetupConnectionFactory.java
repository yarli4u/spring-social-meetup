package org.springframework.social.meetup.connect;

/**
 * 
 * @author  Suresh Kumar (yarli4u).
 *
 */

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.meetup.api.Meetup;

public class MeetupConnectionFactory extends OAuth2ConnectionFactory<Meetup> {
	
	public MeetupConnectionFactory(String clientId, String clientSecret) {	
		super("meetup",new MeetupServiceProvider(clientId, clientSecret), new MeetupAdapter());		
	}

}
