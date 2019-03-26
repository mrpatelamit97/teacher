package com.cts.connect_project.bean;

public class Help {
	private String Issue;
	private String Description;
	private String Email;
	public String getIssue() {
		return Issue;
	}
	public void setIssue(String issue) {
		Issue = issue;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Help(String issue, String description, String email) {
		super();
		Issue = issue;
		Description = description;
		Email = email;
	}
	public Help() {
		super();
	
	}
	@Override
	public String toString() {
		return "Help [Issue=" + Issue + ", Description=" + Description + ", Email=" + Email + "]";
	}

}
