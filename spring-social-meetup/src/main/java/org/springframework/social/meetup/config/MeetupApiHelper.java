package org.springframework.social.meetup.config;

/**
 * 
 * @author  Suresh Kumar (yarli4u).
 *
 */

import org.springframework.social.UserIdSource;
import org.springframework.social.config.xml.ApiHelper;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.meetup.api.Meetup;

public class MeetupApiHelper implements ApiHelper<Meetup> {
	
	private final UsersConnectionRepository usersConnectionRepository;
	private final UserIdSource userIdSource;
	
	public MeetupApiHelper(UsersConnectionRepository usersConnectionRepository,UserIdSource userIdSource) {
		this.usersConnectionRepository = usersConnectionRepository;
		this.userIdSource = userIdSource;
	}

	@Override
	public Meetup getApi() {

		Connection<Meetup> connection = usersConnectionRepository.createConnectionRepository(userIdSource.getUserId())
						.findPrimaryConnection(Meetup.class);
		
		return connection != null ? connection.getApi() : null;
	}

}
