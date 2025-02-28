package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.entities.Employee;
import com.hibernate.utilities.HibernateUtil;

public class AppTest1 {

	public static void main(String[] args) {
		
		System.out.println("Application Started.....");
		
		Session session = HibernateUtil.getSession();
		System.out.println("App.main() | Session : "+session);
		Transaction trx = session.beginTransaction();
		
//		Employee emp = new Employee();
//        emp.setId(232);
//        emp.setName("Abhishek");
////        emp.setAge(32);
//        emp.setSalary(6351.43f);
		
        // @DynamicInsert
//		int id = (int) session.save(emp);
//		System.out.println("Id : "+id);

        // @DynamicUpdate
        Employee emp1 = (Employee) session.get(Employee.class, 45);
        emp1.setSalary(98776.45f);
        session.update(emp1);
        
		trx.commit();
		HibernateUtil.closeFactory();
		session.close();
		System.out.println("App.main() | Session : "+session);
	}

}
