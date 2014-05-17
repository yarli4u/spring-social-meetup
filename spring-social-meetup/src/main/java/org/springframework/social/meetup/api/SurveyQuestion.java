package org.springframework.social.meetup.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SurveyQuestion {

	private int id;
	private String question;
	private boolean required;
	
	public int getId() {
		return id;
	}
	public String getQuestion() {
		return question;
	}
	public boolean isRequired() {
		return required;
	}
	
}
