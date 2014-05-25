package org.springframework.social.meetup.api;

import java.util.List;

public interface EventOperations {

	public List<Event> findByMember();
	public List<Event> findByMember(String memberID);
	
	public List<Event> findByGroup(String groupID);
	public List<Event> findByGroup(List<String> groupID);
	
}
