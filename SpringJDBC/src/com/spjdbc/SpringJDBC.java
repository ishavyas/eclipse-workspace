package com.spjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

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
	
	public List<EmpInfo> getemp(){
		return jdbctemplate.query("select * from empinfo", new RowMapper<EmpInfo>(){
		 @Override
		 public EmpInfo mapRow(ResultSet rs, int rownum) throws SQLException{
			 EmpInfo emp = new EmpInfo();
			 emp.setEmpid(rs.getInt(1));
			 emp.setEmpname(rs.getString(2));
			 emp.setEmpsal(rs.getInt(3));
			 
			return emp;
			 
		 }
			
		});	
	}
	
	public List<Student> getAllStd(){
		return jdbctemplate.query("select * from Student", new ResultSetExtractor<List<Student>>() {
			public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException{
				List<Student> list= new ArrayList<Student>();
				while(rs.next()) {
					Student std = new Student();
					std.setStdid(rs.getInt(1));
					std.setStdname(rs.getString(2));
					std.setStdmarks(rs.getInt(3));
					list.add(std);
				}
				return list;
			}
		});		
	}
	
}
