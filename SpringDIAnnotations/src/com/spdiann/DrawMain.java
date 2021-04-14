package com.spdiann;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class DrawMain {

	public static void main(String[] args) {
		Resource res  = new ClassPathResource("spring.xml");	
		BeanFactory bn = new XmlBeanFactory(res);
		Shape sh = (Shape) bn.getBean("circle");
		sh.draw();

	}

}
