package org.springframework.social.meetup.api.impl;

/**
 * 
 * @author  Suresh Kumar (yarli4u).
 *
 */

import org.springframework.social.meetup.api.EventOperations;
import org.springframework.social.meetup.api.GroupOperations;
import org.springframework.social.meetup.api.Meetup;
import org.springframework.social.meetup.api.MemberOperations;
import org.springframework.social.meetup.api.RsvpOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.support.ClientHttpRequestFactorySelector;

public class MeetupTemplate extends AbstractOAuth2ApiBinding implements Meetup {

	private MemberOperations memberOperations;
	private EventOperations eventOperations;
	private GroupOperations groupOperations;
	private RsvpOperations rsvpOperations;
	
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

	@Override
	public EventOperations eventOperations() {		
		return eventOperations;
	}
	
	@Override
	public GroupOperations groupOperations() {
		return groupOperations;
	}

	@Override
	public RsvpOperations rsvpOperations() {
		return rsvpOperations;
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
		eventOperations = new EventTemplate(getRestTemplate(), isAuthorized());
		groupOperations = new GroupTemplate(getRestTemplate(), isAuthorized());
		rsvpOperations = new RsvpTemplate(getRestTemplate(), isAuthorized());
	}
}