package com.hibernateinheritance;

import org.hibernate.*;
import org.hibernate.cfg.*;



public class PaymentMain {

	public static void main(String[] args) {
		
		Configuration cf = new Configuration();
		cf.configure("config.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		CreditCard cc1 = new CreditCard();
		cc1.setPayid(2365);
		cc1.setAmount(800);
		cc1.setCctype("Visa");
		
		s.save(cc1);
		
		Cheque cq1 = new Cheque();
		cq1.setPayid(2366);
		cq1.setAmount(1000);
		cq1.setCqbank("Chase");
		
		s.save(cq1);
		tx.commit();
		s.close();
		

	}

}
