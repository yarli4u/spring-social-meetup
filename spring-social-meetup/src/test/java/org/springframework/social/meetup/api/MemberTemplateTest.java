package org.springframework.social.meetup.api;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.http.HttpMethod;

public class MemberTemplateTest extends AbstractMeetupApiTest {
	
	@Test
	public void getSelfDetails() {
		
		mockServer
		.expect(requestTo("https://api.meetup.com/2/member/self"))
		.andExpect(method(HttpMethod.GET))
		.andRespond(withSuccess(jsonResource("/self"), APPLICATION_JSON));
		
		Member self = meetup.memberOperations().getDetails();
		assertSelf(self);		
	}
	
	@Test
	public void getMemberDetails() {
		
		mockServer
		.expect(requestTo("https://api.meetup.com/2/member/102273082"))
		.andExpect(method(HttpMethod.GET))
		.andRespond(withSuccess(jsonResource("/self"), APPLICATION_JSON));
		
		Member self = meetup.memberOperations().getDetails("102273082");
		assertSelf(self);		
	}
	
	//private helper methods.
	
	private void assertSelf(Member self) {
		
		assertEquals("102273082", self.getId());
		assertEquals("Bangalore", self.getHometown());
		assertEquals("Bangalore", self.getCity());
		assertEquals("in",self.getCountry());
		assertEquals(4,self.getTopics().size());
		assertEquals("JavaScript",self.getTopics().get(3).getName());
		
		System.out.println("Gender:" + self.getGender());
		//assertEquals("male",self.getGender().getValue());
	}
}
