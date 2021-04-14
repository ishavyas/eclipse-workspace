package com.spjdbc;

public class Student {
	private int stdid;
	private String stdname;
	private int stdmarks;
	
	
	public Student() {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdmarks = stdmarks;
	}
	
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getStdmarks() {
		return stdmarks;
	}
	public void setStdmarks(int stdmarks) {
		this.stdmarks = stdmarks;
	}
	
	public String toString() {
		return stdid+" "+stdname+" "+stdmarks;
	}
}
