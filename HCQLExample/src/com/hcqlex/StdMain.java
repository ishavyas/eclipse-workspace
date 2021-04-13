package com.hcqlex;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.*;

public class StdMain {

	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure("config.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		
		Criteria cr = se.createCriteria(Student3.class);
		Criterion co = Restrictions.ge("stdmarks", 68);
		cr.add(co);
		List li = cr.list();
		Iterator i = li.iterator();
		while(i.hasNext()) {
			Student3 s = (Student3)i.next();
			System.out.println(s.getStdid()+" "+ s.getStdname()+" "+s.getStdmarks());
		}

	}

}
