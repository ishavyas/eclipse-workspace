package com.spjdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class JdbcMain {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("spring.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		SpringJDBC sj = (SpringJDBC)bf.getBean("jobj");
		System.out.println("Insert Query");
		sj.addData();
		sj.getData();
		System.out.println("========================");
		System.out.println("Update Query");
		sj.updateData();
		sj.getData();
		System.out.println("========================");
		System.out.println("delete Query");
		sj.deleteData();
		sj.getData();	

		System.out.println("========================");
		System.out.println("RowMapper:");
		List<EmpInfo> list = sj.getemp();
		Iterator i = list.iterator();
		for(EmpInfo e:list) {
			System.out.println(e);
		}
		
		System.out.println("========================");
		System.out.println("ResultsetExtractor:");
		
		List<Student> slist = sj.getAllStd();
		for(Student s: slist) {
			System.out.println(s);
		}

	}

}
