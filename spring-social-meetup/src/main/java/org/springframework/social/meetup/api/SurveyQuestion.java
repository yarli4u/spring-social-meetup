package org.springframework.social.meetup.api;

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
