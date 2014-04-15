package org.springframework.social.meetup.api;

public interface MemberOperations {
	
	Member getDetails();
	Member getDetails(String id);

}
