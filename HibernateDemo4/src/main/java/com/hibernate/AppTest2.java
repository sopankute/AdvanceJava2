package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.entities.ElectronicsProduct;
import com.hibernate.utilities.HibernateSessionUtil;

public class AppTest2 {

	public static void main(String[] args) {
		System.out.println("AppTest2.main() | Application started sucessfully...");

		Session session = HibernateSessionUtil.getSession();
		System.out.println("AppTest1.main() | "+session);
		Transaction trx = session.beginTransaction();
		
		
		ElectronicsProduct p1 = new ElectronicsProduct();
		p1.setId(103);
		p1.setName("Smartwatch");
		p1.setQuantity(33);
		p1.setPrice(153000.00f);
		System.out.println(p1+"  \n"+"Hashcode p1: "+p1.hashCode());
		
		
		ElectronicsProduct p2 = session.get(ElectronicsProduct.class, 103);	// 103 | Laptop | 3 |23500
		System.out.println(p2+"  \n"+"Hashcode p2: "+p2.hashCode());
		
//		session.save(p1);			// NonUniqueObjectException
//		session.saveOrUpdate(p1);   // NonUniqueObjectException
//		session.persist(p1);  		// NonUniqueObjectException
//		session.delete(p1);   		// NonUniqueObjectException
		
		ElectronicsProduct p3 = session.merge(p1);		// this'll override the object data p1 and return same object
		System.out.println(p3+"  \n"+"Hashcode p3: "+p3.hashCode());
		
		trx.commit();		
		HibernateSessionUtil.closeSession(session);
		System.out.println("AppTest1.main() | "+session);
		HibernateSessionUtil.closeSessionFactory();
		
	}

}
