package com.techtalentsouth.AgendaApp.Entry;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String event;
	private String description;
	private String date;

	public Entry(String event, String description, String date) {
		this.event = event;
		this.description = description;
		this.date = date;
	}
	

	public Entry() {
		// non-argument constructor needed for JPA
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getDescription() {
		return description;
	}

	public void setDescripton(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	@Override
	public String toString() {
		return "Entry [id=" + id + ", event=" + event + ", description=" + description + ", date=" + date + "]";
	}

}
