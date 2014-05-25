package org.springframework.social.meetup.api;

import static org.junit.Assert.assertEquals;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import java.math.BigInteger;
import java.util.ArrayList;
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
		
		List<Event> events = meetup.eventOperations().findByMember();
		assertEventsForMember(events);
	}
	
	@Test
	public void testEventsByMemberID() {
		
		mockServer
		.expect(requestTo("https://api.meetup.com/2/events?member_id=102273082"))
		.andExpect(method(HttpMethod.GET))
		.andRespond( 
					withSuccess(jsonResource("/events_self"), APPLICATION_JSON)	);
		
		List<Event> events = meetup.eventOperations().findByMember("102273082");		
		assertEventsForMember(events);				
	}
	
	@Test
	public void testEventsByGroupIDs() {
		
		mockServer
		.expect(requestTo("https://api.meetup.com/2/events?group_id=1556336%2C3189882%2C11205502"))
		.andExpect(method(HttpMethod.GET))
		.andRespond( 
					withSuccess(jsonResource("/events_self"), APPLICATION_JSON)	);
		List<String> groupids = new ArrayList<String>();
		groupids.add(0, "1556336");
		groupids.add(1, "3189882");
		groupids.add(2, "11205502");
		List<Event> events = meetup.eventOperations().findByGroup(groupids);
		assertEquals(20, events.size());
		//assertEventsForMember(events);				
	}
	
	public void assertEventsForMember(List<Event> events) {
		
		assertEquals(20, events.size());
		assertEquals("179847252", events.get(0).getId());
		assertEquals(100,events.get(0).getRsvp_limit());
		assertEquals(Status.UPCOMING, events.get(0).getStatus());
		assertEquals(new BigInteger("1556336"),events.get(0).getGroup().getId());
	}
}
