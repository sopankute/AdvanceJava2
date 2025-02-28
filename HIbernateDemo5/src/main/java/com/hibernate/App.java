package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.entities.BankAccount;
import com.hibernate.utilities.HibernateSessionUtil;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Application Started sucessfully...." );
        
        Session session = HibernateSessionUtil.getSession();
        
        Transaction trx = session.beginTransaction();
        
        BankAccount acc = new BankAccount();
        acc.setId(341243);
        acc.setHolderName("Raja Kumari");
        acc.setAccountNo(86544325);
        acc.setBalance(43533.07f);
        
        session.save(acc);
        
        trx.commit();
        HibernateSessionUtil.closeSession(session);
        HibernateSessionUtil.closeSessionFactory();
        
    }
}
