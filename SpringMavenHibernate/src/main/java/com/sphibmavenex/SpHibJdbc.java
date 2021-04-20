package com.sphibmavenex;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class SpHibJdbc {
	private HibernateTemplate hibernateTemplate;
	//SessionFactory sessionFactory;

	
	
	
	/*public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}




	public void saveEmp(Empinfo emp) {
		/*Session se = sessionFactory.openSession();
		Transaction tx = se.beginTransaction();
		se.save(emp);
		tx.commit();*/
		this.hibernateTemplate.setCheckWriteOperations(false);
		hibernateTemplate.saveOrUpdate(emp);
	}
}
