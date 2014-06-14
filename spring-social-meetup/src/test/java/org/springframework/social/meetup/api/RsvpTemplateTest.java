package org.springframework.social.meetup.api;

import static org.junit.Assert.assertEquals;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import java.util.List;

import org.junit.Test;
import org.springframework.http.HttpMethod;

public class RsvpTemplateTest extends AbstractMeetupApiTest {

	@Test
	public void testRsvps() {
		
		mockServer
		.expect(requestTo("https://api.meetup.com/2/rsvps?event_id=179847252"))
		.andExpect(method(HttpMethod.GET))
		.andRespond( 
					withSuccess(jsonResource("/rsvps"), APPLICATION_JSON)	);
		
		List<Rsvp> rsvps = meetup.rsvpOperations().findByEvent("179847252");
		assertEquals(8, rsvps.size());
	}
}
