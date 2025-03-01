package com.crud.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.crud.entities.Employee;
import com.crud.util.HibernateUtil;

public class HibernateDao {

	// save() / persist()
	public static void insertEmp(Employee emp) {
		Session session = HibernateUtil.getSession();
		Transaction trx = session.beginTransaction();
		System.out.println("HibernateDao.insertEmp()|session:" + session);

//		session.save(emp);
		session.persist(emp);

		trx.commit();
		HibernateUtil.closeSession(session);
		System.out.println("HibernateDao.insertEmp()|session:" + session);
	}

	
	// get() / load()
	public static Employee getEmp(int id) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		System.out.println("HibernateDao.insertEmp()|session:" + session);

        Employee employee = session.get(Employee.class, id);
		
//		Employee employee = session.load(Employee.class, id);

//		System.out.println("HibernateDao.getEmp() | employee : " + employee.getEmpName());

		session.getTransaction().commit();
		HibernateUtil.closeSession(session);
		System.out.println("HibernateDao.insertEmp()|session:" + session);
		
		return employee;
	}

	// update()
	public static void updateEmp(int id) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		Employee emp = session.get(Employee.class, id);
		
		emp.setEmpCity("Kandhar");
		
		if(emp!=null) {
			session.update(emp);
		}
		
		session.getTransaction().commit();
		HibernateUtil.closeSession(session);
	}

	public static void getAllEmps() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		
		String hql = "FROM Employee";
		
		Query<Employee> query = session.createQuery(hql, Employee.class);
		
		query.list().forEach(e->System.out.println(e));
		
		session.getTransaction().commit();
		HibernateUtil.closeSession(session);
	}
}
