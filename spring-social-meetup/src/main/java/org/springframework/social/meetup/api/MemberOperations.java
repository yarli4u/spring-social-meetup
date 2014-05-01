package org.springframework.social.meetup.api;

/**
 * 
 * @author Suresh Kumar (yarli4u).
 *
 */

public interface MemberOperations {
	
	Member getDetails();
	Member getDetails(String id);

}
