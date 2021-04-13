package com.condisp;

public class Student {
	private int stdid;
	private String stdname;
	private int stdmarks;
	
	public Student(int stdid, String stdname, int stdmarks) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdmarks = stdmarks;
	}
	
	void display() {
		System.out.println(stdid+" "+stdname+" "+stdmarks);
	}
	
}
