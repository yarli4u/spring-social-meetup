/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.quickstart;

import java.util.List;

import javax.inject.Inject;

import org.springframework.social.meetup.api.Event;
import org.springframework.social.meetup.api.Meetup;
import org.springframework.social.meetup.api.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Simple little @Controller that invokes Meetup and renders the result.
 * The injected {@link Meetup} reference is configured with the required authorization credentials for the current user behind the scenes.
 * @author Suresh Kumar (yarli4u).
 */
@Controller
public class HomeController {

	private final Meetup meetup;
	
	@Inject
	public HomeController(Meetup meetup) {
		this.meetup = meetup;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		Member profile = meetup.memberOperations().getDetails("102273082");
		model.addAttribute("profile", profile);
		List<Event> events = meetup.eventOperations().getSelfEvents();
		model.addAttribute("events", events);
		
		return "home";
	}

}
