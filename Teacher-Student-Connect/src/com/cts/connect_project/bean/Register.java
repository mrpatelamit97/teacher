package com.cts.connect_project.bean;

public class Register {

    private String fname;
    private String lname;
    private String age;
    private String gender;
    private String cno;
    private String cat;
    private String userid;
    private String password;
	
    
    public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public Register() {
		super();
	}
	
	public Register(String fname, String lname, String age, String gender, String cno, String cat, String userid,
			String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.gender = gender;
		this.cno = cno;
		this.cat = cat;
		this.userid = userid;
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "Register [fname=" + fname + ", lname=" + lname + ", age=" + age + ", gender=" + gender + ", cno=" + cno
				+ ", cat=" + cat + ", userid=" + userid + ", password=" + password + "]";
	}
	
    

	
}
