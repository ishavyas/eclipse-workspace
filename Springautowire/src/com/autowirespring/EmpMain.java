package com.autowirespring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmpMain {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("spring.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		Employee emp = (Employee)bf.getBean("James");
		System.out.println(emp.getEmpid()+" "+emp.getEmpname()+" "+emp.getDept().getDeptid()+" "+emp.getDept().getDeptname()+" "+emp.getDept().getDeptempcount());

	}

}
