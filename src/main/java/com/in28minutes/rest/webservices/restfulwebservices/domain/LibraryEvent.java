package com.in28minutes.rest.webservices.restfulwebservices.domain;

public class LibraryEvent {

	private Integer libraryEventId;
	private Book book;
	private String eventType;

	
	public Integer getLibraryEventId() {
		return libraryEventId;
	}

	public void setLibraryEventId(Integer libraryEventId) {
		this.libraryEventId = libraryEventId;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}


}
