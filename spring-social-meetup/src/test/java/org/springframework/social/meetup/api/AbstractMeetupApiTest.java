package org.springframework.social.meetup.api;

import org.junit.Before;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.social.meetup.api.impl.MeetupTemplate;
import org.springframework.test.web.client.MockRestServiceServer;

public class AbstractMeetupApiTest {
	
	protected static final String ACCESS_TOKEN="";
	
	protected MeetupTemplate meetup;
	protected MockRestServiceServer mockServer;
	
	@Before
	public void setup() {
		meetup = new MeetupTemplate(ACCESS_TOKEN);
		mockServer = MockRestServiceServer.createServer(meetup.getRestTemplate());
	}
	
	protected Resource jsonResource(String filename) {
		return new ClassPathResource(filename + ".json",getClass());
	}

}
