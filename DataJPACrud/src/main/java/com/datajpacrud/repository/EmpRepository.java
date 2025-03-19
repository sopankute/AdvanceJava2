package com.datajpacrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datajpacrud.entities.Employee;


@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {
	
	// find emp by city

	// find emp by salary
	
	// find emp by dept
	
	// find emp by salary and dept
	
	// find emp by city or dept
	
	// find emp whose name is Diana or Hannah or Michael
	
	// find emps whose salary > 50000
	
	// delete emp by city 
	
	
	// sorting ascending
	
	
	// sorting descending
	
	
	// sorting by name
	
	
	// sorting by city and dept
	

	// pagination


}
