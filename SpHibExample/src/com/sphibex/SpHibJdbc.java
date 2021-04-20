package com.sphibex;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class SpHibJdbc {
	//HibernateTemplate htemp;
	SessionFactory sessionFactory;
	
	

	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	public void saveEmp(Empinfo emp) {
		Session se = sessionFactory.openSession();
		Transaction tx = se.beginTransaction();
		se.save(emp);
		tx.commit();
	}
}
