package com.hcqlex;

import javax.persistence.*;

@Entity
@Table(name="Student3")
public class Student3 {
	@Id
	@Column(name="stdid")
	private int stdid;
	@Column(name="stdname")	
	private String stdname;
	@Column(name="stdmarks")
	private int stdmarks;
	
	
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
}
