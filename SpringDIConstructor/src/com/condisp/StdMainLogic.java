package com.condisp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StdMainLogic {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("spring.xml");
		BeanFactory bf =new XmlBeanFactory(res);
		Student std = (Student)bf.getBean("Janet");
		std.display();

	}

}
