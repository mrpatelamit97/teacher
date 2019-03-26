package com.cts.connect_project.bean;

public class Batch {

	private String userid;
	private String batch_name;
	private String subject;
	private String time_slot;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getBatch_name() {
		return batch_name;
	}
	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTime_slot() {
		return time_slot;
	}
	public void setTime_slot(String time_slot) {
		this.time_slot = time_slot;
	}
	public Batch() {
		// TODO Auto-generated constructor stub
	}
	public Batch(String userid, String batch_name, String subject, String time_slot) {
		super();
		this.userid = userid;
		this.batch_name = batch_name;
		this.subject = subject;
		this.time_slot = time_slot;
	}
	@Override
	public String toString() {
		return "Batch [userid=" + userid + ", batch_name=" + batch_name + ", subject=" + subject + ", time_slot="
				+ time_slot + "]";
	}
	
	
}
