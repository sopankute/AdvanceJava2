package com.datajpacrud.services;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.datajpacrud.entities.Employee;

public interface EmpService {

	void insertEmp(Employee emp);

	void insertEmps(List<Employee> emps);

	Employee updateEmp(Integer Id, String city);

	Employee getEmp(Integer id);

	List<Employee> getAllEmps();

	boolean isEmpPresent(Integer id);

	void removeEmp(Integer id);

	void removeEmp(Employee emp);
	
	List<Employee> empSortById();
	
	List<Employee> empSortDescById();
	
	List<Employee> empSortByName();

	List<Employee> empSortByDeptNameAndByCity();
	
	void getFirstEmpRecords();
	
	void getEmpRecordsPerPage(int pageNumber, int pageSize);
	
	void getPageRecordsInSorted(int pageNumber, int pageSize);
}
