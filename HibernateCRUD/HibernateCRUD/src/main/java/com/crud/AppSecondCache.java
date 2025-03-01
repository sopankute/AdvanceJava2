package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.crud.entities.Employee;
import com.crud.util.HibernateUtil;

public class AppSecondCache {
	
	public static void main(String[] args) {
		
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session1 = factory.openSession();
		System.out.println(session1);
		
		Employee emp2 = session1.get(Employee.class, 34);
		System.out.println(emp2.hashCode()+"\t"+emp2);		// 176191196
		
		HibernateUtil.closeSession(session1);
		
		
		// second
		Session session2 = factory.openSession();
		System.out.println(session2);
		
		Employee emp1 = session2.get(Employee.class, 34);
		System.out.println(emp1.hashCode()+"\t"+emp1);		// 176191196
		
		HibernateUtil.closeSession(session2);
		HibernateUtil.closeFactory();
	}
}
