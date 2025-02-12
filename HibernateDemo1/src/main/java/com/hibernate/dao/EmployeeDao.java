package com.hibernate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;

import com.hibernate.conn.DBConnectionProvider;
import com.hibernate.entity.Employee;

public class EmployeeDao {
	
	public void save(Employee emp) throws SQLException {
		
		Connection con = DBConnectionProvider.getConnection();
		
		PreparedStatement statement = con.prepareStatement("insert into employee value(?,?,?,?)");
		
		statement.setInt(1, emp.getId());
		statement.setString(2, emp.getName());
		statement.setInt(3, emp.getAge());
		statement.setLong(4, emp.getSalary());
		
		int i = statement.executeUpdate();
		if(i>0) {
			System.out.println("Record created sucessfully");
		}else {			
			System.out.println("Record NOT created !!");
		}
	}
	
}
