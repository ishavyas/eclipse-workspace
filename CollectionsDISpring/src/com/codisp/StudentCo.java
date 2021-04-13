package com.codisp;

//import java.util.List;
import java.util.Map;

//import java.util.Set;

public class StudentCo {
	private int stdid;
	private String stdname;
	private Map course;
	
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
	public Map getCourse() {
		return course;
	}
	public void setCourse(Map course) {
		this.course = course;
	}
	/*public Set getCourse() {
		return course;
	}
	public void setCourse(Set course) {
		this.course = course;
	}
	public List getCourse() {
		return course;
	}
	public void setCourse(List course) {
		this.course = course;
	}*/
		
}
