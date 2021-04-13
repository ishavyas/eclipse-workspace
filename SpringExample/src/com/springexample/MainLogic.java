package com.springexample;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("spring.xml");
		BeanFactory bf =new XmlBeanFactory(res);
		//ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
		SchlStudent sc = (SchlStudent)bf.getBean("Janet");
		System.out.println(sc.getStdid()+" "+sc.getStdname()+" "+sc.getStdsub()+" "+sc.getStdmarks());

	}

}
