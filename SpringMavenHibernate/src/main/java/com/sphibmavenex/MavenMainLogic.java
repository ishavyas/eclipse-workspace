package com.sphibmavenex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MavenMainLogic {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
		SpHibJdbc shj = (SpHibJdbc)app.getBean("jobj");
		Empinfo ei = new Empinfo();
		ei.setEmpid(2597);
		ei.setEmpname("Robert");
		ei.setEmpsal(65000);
		ei.setEmpdept("Development");
		shj.saveEmp(ei);

	}

}
