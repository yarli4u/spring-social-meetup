package org.springframework.social.meetup.connect;

/**
 * 
 * @author  Suresh Kumar (yarli4u).
 *
 */

import org.springframework.social.meetup.api.Meetup;
import org.springframework.social.meetup.api.impl.MeetupTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

public class MeetupServiceProvider extends AbstractOAuth2ServiceProvider<Meetup> {
	
	public MeetupServiceProvider(String clientId, String clientSecret) {
		super(new MeetupOAuth2Template(clientId, clientSecret));
	}

	@Override
	public Meetup getApi(String accessToken) {
		
		return new MeetupTemplate(accessToken);
	}

}
