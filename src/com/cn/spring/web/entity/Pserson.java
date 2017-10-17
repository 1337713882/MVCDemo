package com.cn.spring.web.entity;

public class Pserson {
	private int perID;
	private String pserName;
	private String pserPwd;
	private String perEmal;
	private Address address;
	
	
	public Pserson() {
		super();
	}
	public Pserson(int perID, String pserName, String pserPwd, String perEmal, Address address) {
		super();
		this.perID = perID;
		this.pserName = pserName;
		this.pserPwd = pserPwd;
		this.perEmal = perEmal;
		this.address = address;
	}
	public int getPerID() {
		return perID;
	}
	public void setPerID(int perID) {
		this.perID = perID;
	}
	public String getPserName() {
		return pserName;
	}
	public void setPserName(String pserName) {
		this.pserName = pserName;
	}
	public String getPserPwd() {
		return pserPwd;
	}
	public void setPserPwd(String pserPwd) {
		this.pserPwd = pserPwd;
	}
	public String getPerEmal() {
		return perEmal;
	}
	public void setPerEmal(String perEmal) {
		this.perEmal = perEmal;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Pserson [perID=" + perID + ", pserName=" + pserName + ", pserPwd=" + pserPwd + ", perEmal=" + perEmal
				+ ", address=" + address + "]";
	}
	
	
}
