package com.spjdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJDBC {
	private JdbcTemplate jdbctemplate;

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	public void getData() {
		List li = jdbctemplate.queryForList("select * from empinfo");
		Iterator i = li.iterator();
		while(i.hasNext()) {
			Object obj = i.next();
			System.out.println(obj.toString());
		}
	}
	
	public int addData() {
		return jdbctemplate.update("insert into empinfo(empid, empname, empsal) values(2569, 'John', 50000)");		
	}
	
	public int updateData() {
		return jdbctemplate.update("update empinfo set empsal = 30000 where empid = 2569");
		
	}
	
	public int deleteData() {
		return jdbctemplate.update("delete from empinfo where empid = 2569");
	}
	
}
