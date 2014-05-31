package org.springframework.social.meetup.api.impl;

/**
 * 
 * @author  Suresh Kumar (yarli4u).
 *
 */

import org.springframework.social.meetup.api.Member;
import org.springframework.social.meetup.api.MemberOperations;
import org.springframework.web.client.RestTemplate;

public class MemberTemplate extends AbstractMeetupOperations implements
		MemberOperations {

	private final RestTemplate restTemplate;
	
	public MemberTemplate(RestTemplate restTemplate, boolean authorized) {
		
		super(authorized);
		this.restTemplate = restTemplate;
	}
	
	@Override
	public Member getDetails() {
		
		return restTemplate.getForObject(buildUri(MEMBER_URL_SELF), Member.class);
	}

	@Override
	public Member getDetails(String id) {
		
		return restTemplate.getForObject(buildUri(MEMBER_URL+id), Member.class);
	}

	
	private static final String MEMBER_URL_SELF = "2/member/self";
	private static final String MEMBER_URL = "2/member/";
}
