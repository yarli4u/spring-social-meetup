package org.springframework.social.meetup.api;

/**
 * 
 * @author  Suresh Kumar (yarli4u).
 *
 */

import java.math.BigInteger;

public class Topic {

	private BigInteger id;
	private String name;
	private String urlkey;
	
	public BigInteger getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getUrlkey() {
		return urlkey;
	}
	
}
