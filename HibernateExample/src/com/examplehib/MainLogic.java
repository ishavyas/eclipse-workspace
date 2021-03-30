package com.examplehib;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class MainLogic {

	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		Student smith = new Student();
		
		smith.setStdid(4588);
		smith.setStdname("David Kane");
		smith.setMarks(84);		
		se.saveOrUpdate(smith);
		
		Student sam = new Student();
		sam.setStdid(4589);
		sam.setStdname("Sam Murphy");
		sam.setMarks(70);
		se.persist(sam);
		
		Student dave = new Student();
		dave.setStdid(4590);
		dave.setStdname("Dave Willis");
		dave.setMarks(90);
		se.merge(dave);
		
		tx.commit();
		Student x = (Student)se.load(Student.class, 4587);
		System.out.println(x.getStdid()+" "+ x.getStdname()+" "+ x.getMarks());		
		se.close(); 
		
		Session ses = sf.openSession();
		Transaction txn = ses.beginTransaction();	
		Empdata andrea = new Empdata();
		andrea.setEmpid(6357);
		andrea.setEmpname("Adam Gates");
		andrea.setEmprole("Sr Developer");
		andrea.setEmpdept("Development");
		andrea.setEmpemail("andrea@xyz.com");
		andrea.setEmpsalary(95000);
		ses.update(andrea);
		
		Empdata james = new Empdata();
		james.setEmpid(6355);
		james.setEmpname("Adam Gates");
		james.setEmprole("Junior Developer");
		james.setEmpdept("App Development");
		james.setEmpemail("adam@xyz.com");
		james.setEmpsalary(40000);		
		ses.save(james);		
		txn.commit();
		
		
		Empdata y = (Empdata)ses.get(Empdata.class, 6354);
		System.out.println(y.getEmpid()+" "+y.getEmpname()+" "+y.getEmprole()+" "+y.getEmpdept()+" "+ y.getEmpemail()+" "+y.getEmpsalary());
		ses.close();
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();	
		Empdata derek = new Empdata();
		derek.setEmpid(6356);
		derek.setEmpname("Derek Wayen");
		derek.setEmprole("HR Manager");
		derek.setEmpdept("HR");
		derek.setEmpemail("derek@xyz.com");
		derek.setEmpsalary(80000);
		s.saveOrUpdate(derek);
		Empdata a = (Empdata)s.load(Empdata.class, 6355);
		System.out.println(a.getEmpid()+" "+a.getEmpname()+" "+a.getEmprole()+" "+a.getEmpdept()+" "+ a.getEmpemail()+" "+a.getEmpsalary());
		s.delete(a);
		t.commit();
		s.close();
		

	}

}
