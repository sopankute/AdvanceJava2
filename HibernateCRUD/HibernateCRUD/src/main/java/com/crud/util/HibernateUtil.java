package com.crud.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static Configuration config;
//	private static ServiceRegistry serviceRegistry;
	private static SessionFactory factory;

	static {
		try {
			config = new Configuration().configure("hibernate.cfg.xml");
//			serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
//			System.out.println("HibernateUtil.enclosing_method()"+" | serviceRegistry : "+serviceRegistry);
			
			factory = config.buildSessionFactory();

		} catch (HibernateException e) {
			System.err.println("Initial SessionFactory creation Failed :" + e);
			throw new ExceptionInInitializerError(e);
		}
	}

	public static Session getSession() {

		Session session = factory.openSession();

		if (factory == null) {
			throw new IllegalStateException("Initial SessionFactory creation Failed");
		}else {
			return session;
		}
		
	}
	
	public static void closeSession(Session session) {
		if(session!=null) {
			session.close();
		}
	}
	
	public static void closeFactory() {
		if(factory!=null && factory.isClosed()) {
			factory.close();
		}
	}
}
