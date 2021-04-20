package mavenex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class MainLogicMaven {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("spring.xml");
		@SuppressWarnings("deprecation")
		BeanFactory bn = new XmlBeanFactory(res);
		//ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
		SpHibJdbc shj = (SpHibJdbc)bn.getBean("obj1");
		Studentinfo s = new Studentinfo();
		s.setStdid(4258);
		s.setStdname("Mary");
		s.setMarks(94);
		shj.saveStd(s);
	}

}
