package com.cts.connect_project.bean;

public class Resource {
	
	private String subject;
	private String title;
	private String author;
	private String year;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Resource() {
		super();
	}
	public Resource(String subject, String title, String author, String year) {
		super();
		this.subject = subject;
		this.title = title;
		this.author = author;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Resource [subject=" + subject + ", title=" + title + ", author=" + author + ", year=" + year + "]";
	}

	
	
}