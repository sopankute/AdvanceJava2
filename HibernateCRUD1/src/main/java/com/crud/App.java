package com.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.crud.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Hibernate Annotation Application Started Sucessfully...");

    	Session session = HibernateUtil.getSession();        
        Transaction trx = session.beginTransaction();
        System.out.println("HibernateDao.insertEmp()|session:"+session);
        
        
        
        HibernateUtil.closeSession(session);     
        System.out.println("HibernateDao.insertEmp()|session:"+session);
    }
}
