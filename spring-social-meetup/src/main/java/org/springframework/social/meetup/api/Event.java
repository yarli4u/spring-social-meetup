package org.springframework.social.meetup.api;

/**
 * 
 * @author  Suresh Kumar (yarli4u).
 *
 */

import java.math.BigInteger;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

	private boolean announced;
	private BigInteger created;
	private String description;
	private int distance;
	private int duration;
	private boolean email_remainders;
	private List<EventHost> event_hosts;
	private String event_url;
	private boolean featured;
	private Group group;
	private int headcount;
	private String how_tofind_us;
	private String id;
	private boolean is_simplehtml;
	private int maybe_rsvp_count;
	private String name;
	private int photo_album_id;
	private int photo_count;
	private String photo_url;
	private Rating rating;
	private boolean rsvp_alerts;
	private int rsvp_limit;
	private RsvpRules rsvp_rules;
	private boolean rsvpable;
	private String short_link;
	private String simple_html_code;
	private List<SurveyQuestion> survey_questions;
	private BigInteger time;	
	private int trending_rank;
	private BigInteger updated;
	private BigInteger utc_offset;
	private Venue venue;
	private int waitlist_count;
	private String why;
	private int yes_rsvp_count;
	public boolean isAnnounced() {
		return announced;
	}
	public BigInteger getCreated() {
		return created;
	}
	public String getDescription() {
		return description;
	}
	public int getDistance() {
		return distance;
	}
	public int getDuration() {
		return duration;
	}
	public boolean isEmail_remainders() {
		return email_remainders;
	}
	public List<EventHost> getEvent_hosts() {
		return event_hosts;
	}
	public String getEvent_url() {
		return event_url;
	}
	public boolean isFeatured() {
		return featured;
	}
	public Group getGroup() {
		return group;
	}
	public int getHeadcount() {
		return headcount;
	}
	public String getHow_tofind_us() {
		return how_tofind_us;
	}
	public String getId() {
		return id;
	}
	public boolean isIs_simplehtml() {
		return is_simplehtml;
	}
	public int getMaybe_rsvp_count() {
		return maybe_rsvp_count;
	}
	public String getName() {
		return name;
	}
	public int getPhoto_album_id() {
		return photo_album_id;
	}
	public int getPhoto_count() {
		return photo_count;
	}
	public String getPhoto_url() {
		return photo_url;
	}
	public Rating getRating() {
		return rating;
	}
	public boolean isRsvp_alerts() {
		return rsvp_alerts;
	}
	public int getRsvp_limit() {
		return rsvp_limit;
	}
	public RsvpRules getRsvp_rules() {
		return rsvp_rules;
	}
	public boolean isRsvpable() {
		return rsvpable;
	}
	public String getShort_link() {
		return short_link;
	}
	public String getSimple_html_code() {
		return simple_html_code;
	}
	public List<SurveyQuestion> getSurvey_questions() {
		return survey_questions;
	}
	public BigInteger getTime() {
		return time;
	}
	public int getTrending_rank() {
		return trending_rank;
	}
	public BigInteger getUpdated() {
		return updated;
	}
	public BigInteger getUtc_offset() {
		return utc_offset;
	}
	public Venue getVenue() {
		return venue;
	}
	public int getWaitlist_count() {
		return waitlist_count;
	}
	public String getWhy() {
		return why;
	}
	public int getYes_rsvp_count() {
		return yes_rsvp_count;
	}

}
