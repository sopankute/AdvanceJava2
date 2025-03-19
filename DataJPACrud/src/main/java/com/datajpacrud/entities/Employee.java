package com.datajpacrud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "EMPLOYEE_TBL")
public class Employee {

	// new Employee(1, "Alice", 30, 60000, "Female", "HR", "New York");

	@Id
	@Column(name = "EMP_ID", nullable = false, unique = true)
	private Integer empId;

	@Column(name = "EMP_NAME", nullable = false)
	private String empName;

	@Column(name = "EMP_AGE")
	private Integer empAge;

	@Column(name = "EMP_SALARY")
	private Double empSalary;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "DEPT_NAME", nullable = false)
	private String deptName;

	@Column(name = "CITY", nullable = false)
	private String city;

}
