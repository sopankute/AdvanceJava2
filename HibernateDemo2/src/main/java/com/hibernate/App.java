package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Employee;

public class App {
    public static void main(String[] args) {
        System.out.println("Applcation Started Sucessfully...Without Hibernate");
         
        Employee emp = new Employee();
        emp.setId(3);
        emp.setName("sunil");
        emp.setAge(31);
        emp.setSalary(70000);
        
        Configuration config = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Transaction trx = session.beginTransaction();
        session.persist(emp);
        trx.commit();
        
        
        session.close();
        
        
    }
}
