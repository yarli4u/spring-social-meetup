package org.springframework.social.meetup.api.impl;

import java.net.URI;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.support.URIBuilder;
import org.springframework.util.MultiValueMap;

public class AbstractMeetupOperations {

	private final boolean isAuthorized;
	
	public AbstractMeetupOperations(boolean isAuthorized) {		
		this.isAuthorized = isAuthorized;
	}
	
	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException("meetup");
		}
	}
	
	protected URI buildUri(String path) {
		
		URI uri = URIBuilder.fromUri(API_URL_BASE+path).build();
		
		return uri;
	}
	
	public URI buildUri(String path, String name, String value) {

		URI uri = URIBuilder.fromUri(API_URL_BASE+path).queryParam(name, value).build();	
		return uri;
	}

	public URI buildUri(String path, MultiValueMap<String, String> queryParams) {

		URI uri = URIBuilder.fromUri(API_URL_BASE + path).queryParams(queryParams).build();
		return uri;
	}
	
	/**
	 * Base URL Live API's
	 */
	private static final String API_URL_BASE = "https://api.meetup.com/2/";
}
