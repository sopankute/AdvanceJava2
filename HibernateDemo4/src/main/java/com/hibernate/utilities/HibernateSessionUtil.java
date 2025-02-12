package com.hibernate.utilities;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionUtil{
	
	
	private static Configuration config = null;
	private static SessionFactory factory = null;
	private static Session session = null;
	
	static {
		try {
			config = new Configuration().configure("hibernate.cfg.xml");
			factory = config.buildSessionFactory();
		}catch(HibernateException e) {
			System.out.println("Session factory creatin failed :"+e);
		}
	}
	
	public static Session getSession() {
		if(factory!=null ) {
			return factory.openSession();
		}else {
			return null;
		}
	}
	
	public static void closeSession(Session session) {
		if(session!=null) {
			session.close();
			closeSessionFactory(factory);
		}
	}
	
	public static void closeSessionFactory(SessionFactory factory) {
		if(factory!=null && !factory.isClosed()) {
			factory.close();
		}
	}
}
