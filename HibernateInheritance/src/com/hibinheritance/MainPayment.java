package com.hibinheritance;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class MainPayment {

	public static void main(String[] args) {
		
		Configuration cf = new Configuration();
		cf.configure("config.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		CreditCard cc1 = new CreditCard();
		cc1.setPayid(2368);
		cc1.setAmount(800);
		cc1.setCrdtype("MasterCard");		
		se.save(cc1);
		
		Cheque cq1 = new Cheque();
		cq1.setPayid(2367);
		cq1.setAmount(1500);
		cq1.setCqbank("Wells Fargo");		
		se.save(cq1);
		
		tx.commit();
		se.close();
		

	}

}
