package org.springframework.social.meetup.api;

import java.util.List;

public interface GroupOperations {

	public List<Group> findByMember();
	public List<Group> findByMember(String memberID);
	
	public List<Group> findByID(String groupID);
	
	
	public List<Group> findByLocation(String country,String city);
}
