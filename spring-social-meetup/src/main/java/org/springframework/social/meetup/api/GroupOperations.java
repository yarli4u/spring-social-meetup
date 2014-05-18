package org.springframework.social.meetup.api;

import java.util.List;

public interface GroupOperations {

	public List<Group> getGroupsByMember();
	public List<Group> getGroupsByMember(String memberID);
	
	public List<Group> getGroupsByID(String groupID);
	
	public List<Group> getGroupsByLocation(String country);
	public List<Group> getGroupsByLocation(String country,String city);
}
