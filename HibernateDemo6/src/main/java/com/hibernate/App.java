package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.entities.Employee;
import com.hibernate.utilities.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Appliacation Started....." );
        
        Session session = HibernateUtil.getSession();
        System.out.println("App.main() | Session : "+session);
        Transaction trx = session.beginTransaction();
        
        Employee emp = new Employee();
        emp.setId(18);
        emp.setName("Virat Kohali");
        emp.setAge(33);
        emp.setSalary(23451.21f);
        
        session.save(emp);
        
        
        System.out.println("Query Executed");
        trx.commit();
        HibernateUtil.closeFactory();
        HibernateUtil.closeSession(session);
        System.out.println("App.main() | Session : "+session);
    }
}
