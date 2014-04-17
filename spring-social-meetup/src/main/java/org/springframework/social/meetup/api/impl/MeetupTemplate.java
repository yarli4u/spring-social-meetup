package org.springframework.social.meetup.api.impl;

/**
 * 
 * @author  Suresh Kumar (yarli4u).
 *
 */

import org.springframework.social.meetup.api.Meetup;
import org.springframework.social.meetup.api.MemberOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.support.ClientHttpRequestFactorySelector;

public class MeetupTemplate extends AbstractOAuth2ApiBinding implements Meetup {

	private MemberOperations memberOperations;
	
	public MeetupTemplate() {
		initialize();
	}
	
	public MeetupTemplate(String accessToken) {
		super(accessToken);
		initialize();
	}
	
	@Override
	public MemberOperations memberOperations() {
		return memberOperations;
	}

	
	/**
	 * private helpers.
	 */
	
	private void initialize() {
		super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(getRestTemplate().getRequestFactory()));
		initSubApis();
	}
	
	private void initSubApis() {
		memberOperations = new MemberTemplate(getRestTemplate(), isAuthorized());
	}
}
