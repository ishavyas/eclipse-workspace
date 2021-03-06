package com.hqlex;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;




public class StdMain {

	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();		
		
		Query qr = se.createQuery("from Student2 s");
		List li = qr.list();
		Iterator i = li.iterator();
		while(i.hasNext()) {
			Student2 st = (Student2)i.next();
			System.out.println(st.getStdid()+" "+ st.getStdname()+" "+ st.getStdsub()+" "+st.getStdmarks());
		}
		se.close();

	}

}
