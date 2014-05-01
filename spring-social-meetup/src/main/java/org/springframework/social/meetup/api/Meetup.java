package org.springframework.social.meetup.api;

/**
 * 
 * @author Suresh Kumar (yarli4u).
 *
 */

public interface Meetup {

	MemberOperations memberOperations();
	EventOperations eventOperations();
}
