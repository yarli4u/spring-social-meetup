package org.springframework.social.meetup.connect;

/**
 * 
 * @author  Suresh Kumar (yarli4u).
 *
 */

import org.springframework.social.oauth2.OAuth2Template;

public class MeetupOAuth2Template extends OAuth2Template {
	
	public MeetupOAuth2Template(String clientId, String clientSecret) {
		super(clientId,clientSecret,"https://secure.meetup.com/oauth2/authorize","https://secure.meetup.com/oauth2/access");
		setUseParametersForClientAuthentication(true);
	}

}
