package com.sphibex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class JdbcMainLogic {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("spring.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		SpHibJdbc shj = (SpHibJdbc)bf.getBean("jobj");
		Empinfo ei = new Empinfo();
		ei.setEmpid(2597);
		ei.setEmpmame("Robert");
		ei.setEmpsal(65000);
		ei.setEmpdept("Development");
		
		shj.saveEmp(ei);

	}

}
