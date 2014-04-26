package org.springframework.social.meetup.api;

/**
 * 
 * @author  Suresh Kumar (yarli4u).
 *
 */

public enum Gender {

	NONE("None"),
	OTHER("Other"),
	FEMALE("female"),
	MALE("male");
	
	private String value;
	
	private Gender(String value) {
		this.value = value;
	}
	public String getValue() { return value;}
}
