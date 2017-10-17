package com.cn.spring.web.entity;

import java.io.Serializable;

public class Students implements Serializable {
	
	private int stuId;
	private String stuName;
	private String stuPwd;
	private String stuEmal;
	
	
	
	public Students() {
		super();
	}
	public Students(int stuId, String stuName, String stuPwd, String stuEmal) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuPwd = stuPwd;
		this.stuEmal = stuEmal;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuPwd() {
		return stuPwd;
	}
	public void setStuPwd(String stuPwd) {
		this.stuPwd = stuPwd;
	}
	public String getStuEmal() {
		return stuEmal;
	}
	public void setStuEmal(String stuEmal) {
		this.stuEmal = stuEmal;
	}
	@Override
	public String toString() {
		return "Students [stuId=" + stuId + ", stuName=" + stuName + ", stuPwd=" + stuPwd + ", stuEmal=" + stuEmal
				+ "]";
	}
	
	
}
