package org.springframework.social.meetup.api;

/**
 * 
 * @author  Suresh Kumar (yarli4u).
 *
 */

import java.math.BigInteger;

public class Photo {

	private String highres_link;
	private String photo_link;
	private String thumb_link;
	private BigInteger photo_id;
	
	public String getHighres_link() {
		return highres_link;
	}
	public String getPhoto_link() {
		return photo_link;
	}
	public String getThumb_link() {
		return thumb_link;
	}
	public BigInteger getPhoto_id() {
		return photo_id;
	}
	
	
}
