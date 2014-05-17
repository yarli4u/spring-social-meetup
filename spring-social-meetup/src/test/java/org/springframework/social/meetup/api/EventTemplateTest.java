package org.springframework.social.meetup.api;

import static org.junit.Assert.assertEquals;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import java.util.List;

import org.junit.Test;
import org.springframework.http.HttpMethod;

public class EventTemplateTest extends AbstractMeetupApiTest {

	@Test
	public void getSelfEvents() {
		
		mockServer
		.expect(requestTo("https://api.meetup.com/2/events?member_id=self"))
		.andExpect(method(HttpMethod.GET))
		.andRespond( 
					withSuccess(jsonResource("/events_self"), APPLICATION_JSON)	);
		
		List<Event> events = meetup.eventOperations().getSelfEvents();
		assertEquals(20, events.size());
	}
}
