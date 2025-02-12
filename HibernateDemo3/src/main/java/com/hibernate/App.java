package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.Product;

public class App {
    public static void main(String[] args) {
        System.out.println("App.main() | Application started sucessfully...");
        
//        MotherBoard
//        Monitor
//        Mouse
//        CPU
//        Keyboard
        
        Product p = new Product();
        p.setPid(1);
        p.setPname("Keyboard");
        p.setPquantity(3);
        p.setPrice(4500.00f);
        
       Configuration config = new Configuration().configure("hibernate.cfg.xml");
       System.out.println(config.getClass().getName());
       
       SessionFactory factory = config.buildSessionFactory();
       System.out.println(factory.getClass().getName());
       
       Session session = factory.openSession(); 
       System.out.println(session.getClass().getName());
       System.out.println("App.main() | Session Created");
       
//       int id = (int)session.save(p);
//       System.out.println("App.main() | "+"Product ID : "+id);
       
       session.persist(p);
       
       
       Transaction trx = session.beginTransaction();
       System.out.println("App.main() | Calling : trx.commit()");
       trx.commit();
       System.out.println("App.main() | Record Inserted.");
       
       session.close();
       System.out.println("App.main() | Session Closed");
    }

}