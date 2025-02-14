package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.ElectronicsProduct;
import com.hibernate.utilities.HibernateSessionUtil;

public class AppTest {

	public static void main(String[] args) {
		System.out.println("AppTest.main() | Application started sucessfully...");

		// Deleting operations 		
		Session session = HibernateSessionUtil.getSession();
		
		Transaction trx = session.beginTransaction();
		
		//1
//		ElectronicsProduct p = new ElectronicsProduct();
//		p.setId(2);
		
		//2
		ElectronicsProduct p = session.get(ElectronicsProduct.class, 4);
		if(p!=null)
			session.delete(p);
		
		System.out.println("Executed Query....");
		trx.commit();
		HibernateSessionUtil.closeSession(session);
		
	}

}
