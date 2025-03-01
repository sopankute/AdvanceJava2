package com.crud;

import org.hibernate.Session;

import com.crud.entities.Employee;
import com.crud.util.HibernateUtil;

public class AppTest1 {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		
		
		Employee emp1 = session.get(Employee.class, 34);
		System.out.println(emp1.hashCode()+"\t"+emp1);		// 176191196
		
		System.out.println("");
		
		Employee emp2 = session.get(Employee.class, 34);
		System.out.println(emp2.hashCode()+"\t"+emp2);		// 176191196
		
		
		
		
		session.getTransaction().commit();
		HibernateUtil.closeSession(session);
		HibernateUtil.closeFactory();
	}
}
