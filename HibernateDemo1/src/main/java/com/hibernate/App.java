package com.hibernate;

import java.sql.SQLException;

import com.hibernate.dao.EmployeeDao;
import com.hibernate.entity.Employee;

public class App {
    public static void main(String[] args) {
        System.out.println("Applcation Started Sucessfully...Without Hibernate");
         
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Alice");
        emp.setAge(30);
        emp.setSalary(60000);
        
        EmployeeDao empDao = new EmployeeDao();
        try {
			empDao.save(emp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
//        System.out.println(emp);
        
    }
}
