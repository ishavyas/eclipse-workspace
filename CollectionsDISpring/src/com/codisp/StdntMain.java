package com.codisp;

import java.util.Iterator;
//import java.util.List;
import java.util.Set;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class StdntMain {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("spring.xml");
		BeanFactory bf =new XmlBeanFactory(res);
		StudentCo sc = (StudentCo)bf.getBean("Janet");
		System.out.println(sc.getStdid()+" "+sc.getStdname());
		//Set s = sc.getCourse();
		Map s = sc.getCourse();
		Set se = s.entrySet();
		Iterator i = se.iterator();
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey()+" "+ me.getValue());
		}

	}

}
