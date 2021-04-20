package com.spaopex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AopMain {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("spring.xml");
		BeanFactory bn = new XmlBeanFactory(res);
		ChaseBank cb = (ChaseBank)bn.getBean("pfb");
		cb.withdraw();
		cb.deposit();

	}

}
