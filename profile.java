package com.maren.demosec.controller;

public class profile {
	private String userid;
	private String name;
	private String email;
	private long mobile;
	
	public profile() {
		
	}
	public profile(String userid,Strig name,String emial,long mobie) {
		super();
	}
	public String getUserid() {

		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(long l) {
		this.mobile = l;
	}
	private String email;
	private String mobile;
}
