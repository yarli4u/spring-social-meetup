package org.springframework.social.meetup.connect;

/**
 * 
 * @author  Suresh Kumar (yarli4u).
 *
 */

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.meetup.api.Meetup;
import org.springframework.social.meetup.api.Member;

public class MeetupAdapter implements ApiAdapter<Meetup> {

	@Override
	public UserProfile fetchUserProfile(Meetup meetup) {
		
		Member self = meetup.memberOperations().getDetails();
		
		return new UserProfileBuilder().setName(self.getName())
								.setEmail(self.getEmail())
								.setUsername(self.getId()).build();
	}

	@Override
	public void setConnectionValues(Meetup meetup, ConnectionValues connValues) {

		Member self = meetup.memberOperations().getDetails();
		connValues.setDisplayName(self.getName());
		connValues.setImageUrl(self.getPhoto_url());		
	}

	@Override
	public boolean test(Meetup meetup) {
		try {
			meetup.memberOperations().getDetails();
			return true;
		} catch(ApiException ex) {
			return false;
		}
	}

	@Override
	public void updateStatus(Meetup meetup, String message) {
		// TODO Auto-generated method stub
		
	}

}
