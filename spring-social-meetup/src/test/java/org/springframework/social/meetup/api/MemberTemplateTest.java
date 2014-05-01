package org.springframework.social.meetup.api;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;
import static org.springframework.http.MediaType.APPLICATION_JSON;

import org.junit.Test;
import org.springframework.http.HttpMethod;

public class MemberTemplateTest extends AbstractMeetupApiTest {
	
	@Test
	public void getSelfDetails() {
		
		mockServer
		.expect(requestTo("https://api.meetup.com/2/member/self"))
		.andExpect(method(HttpMethod.GET))
		.andRespond(
					withSuccess(jsonResource("self"), APPLICATION_JSON)	);
		
		Member self = meetup.memberOperations().getDetails();
	}

}
