package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.entities.ElectronicsProduct;
import com.hibernate.utilities.HibernateSessionUtil;

public class AppTest1 {
	public static void main(String[] args) {
		
		System.out.println("AppTest1.main() | Application started sucessfully...");
		
		
		Session session = HibernateSessionUtil.getSession();
		System.out.println("AppTest1.main() | "+session);
		Transaction trx = session.beginTransaction();
		System.out.println("AppTest1.main() | "+trx);
		
		ElectronicsProduct p1 = new ElectronicsProduct();
		p1.setId(101);
		p1.setName("Mouse");
		p1.setQuantity(19);
		p1.setPrice(15000.00f);
		
		System.out.println("Calling : session.merge(p1)");
		session.merge(p1);
		
		System.out.println("calling : trx.commit()");
		trx.commit();
		
		System.out.println("AppTest1.main() | "+trx);
		HibernateSessionUtil.closeSession(session);
		System.out.println("AppTest1.main() | "+session);
		HibernateSessionUtil.closeSessionFactory();
	}
}
