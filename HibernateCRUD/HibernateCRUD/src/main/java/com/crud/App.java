package com.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.crud.dao.HibernateDao;
import com.crud.entities.Employee;
import com.crud.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate Annotation Application Started Sucessfully...");

//        Configuration config = new Configuration().configure("hibernate.cfg.xml");
//        SessionFactory factory = config.buildSessionFactory();
//        Session session = factory.openSession();

//		insert
		Employee emp = new Employee();
		emp.setEmpId(46);
		emp.setEmpName("Vishwajit");
		emp.setEmpAge(29);
		emp.setEmpCity("Nanded");
		emp.setEmpSalary(98733.89f);

//		HibernateDao.insertEmp(emp);
		
		// retrieve
//		Employee emp2 = HibernateDao.getEmp(75);
//		System.out.println(emp2);
		
		// update
//		HibernateDao.updateEmp(75);
		
		HibernateDao.getAllEmps();
	}
}
