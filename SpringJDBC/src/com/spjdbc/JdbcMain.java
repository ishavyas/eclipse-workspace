package com.spjdbc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class JdbcMain {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("spring.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		SpringJDBC sj = (SpringJDBC)bf.getBean("jobj");
		sj.addData();
		sj.getData();
		sj.updateData();
		sj.getData();
		sj.deleteData();
		sj.getData();

	}

}
