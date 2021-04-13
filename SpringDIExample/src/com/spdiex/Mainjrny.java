package com.spdiex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Mainjrny {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("spring.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		Journey j = (Journey)bf.getBean("Airbnb");
		j.start();

	}

}
