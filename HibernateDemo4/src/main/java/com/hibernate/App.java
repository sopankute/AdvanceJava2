package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.ElectronicsProduct;
import com.hibernate.utilities.HibernateSessionUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("App.main() | Application started sucessfully...");

		Transaction trx = null;
		Session session = null;
		boolean flag = false;

		ElectronicsProduct p = new ElectronicsProduct();
		p.setId(3);
		p.setName("Earbuds");
		p.setQuantity(25);
		p.setPrice(1649.99f);

		try {
			session = HibernateSessionUtil.getSession();
			System.out.println("\nSession : " + session);
			trx = session.beginTransaction();

			ElectronicsProduct p2 = session.get(ElectronicsProduct.class, 1);
			if (p2 != null) {
				p2.setName("Extension Board");
			}
			
			
			/*
			 * ElectronicsProduct p1 = session.get(ElectronicsProduct.class, 1);
			 * if(p1!=null) { p1.setName("Gaming Console"); } session.update(p1);
			 */

//            session.update(p);
//            session.persist(p);
			flag = true;

		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		} finally {
			if (flag == true)
				trx.commit();
			else
				trx.rollback();

			HibernateSessionUtil.closeSession(session);
			System.out.println("\nSession Closed : " + session);
		}

		/*
		 * Configuration config = new Configuration().configure("hibernate.cfg.xml");
		 * System.out.println("App.main() | Configuration : "+config);
		 * 
		 * SessionFactory factory = config.buildSessionFactory();
		 * System.out.println("App.main() | SessionFactory : "+factory.getClass().
		 * getName());
		 * 
		 * Session session = factory.openSession();
		 * System.out.println("App.main() | Session : "+session.getClass().getName());
		 * 
		 * Transaction trx = session.beginTransaction();
		 * 
		 * // saving to DB // session.persist(p); //
		 * System.out.println("App.main()| Method called : session.persist(p)");
		 * 
		 * 
		 * // ElectronicsProduct product = session.get(ElectronicsProduct.class, 2); //
		 * System.out.println(product+"\n"); //
		 * System.out.println(product.getClass().getName());
		 * 
		 * 
		 * ElectronicsProduct product1 = session.load(ElectronicsProduct.class, 7);
		 * System.out.println(product1);
		 * System.out.println(product1.getClass().getName()+"----"+product1.getClass().
		 * getSuperclass());
		 * 
		 * // trx.commit(); // System.out.println("Query Executed ");
		 * 
		 * session.close();
		 * System.out.println("\nSession Closed | "+session.getClass().getName());
		 */
	}
}
