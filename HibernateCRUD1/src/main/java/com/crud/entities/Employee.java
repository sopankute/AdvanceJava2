package com.crud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_TBL")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMP_ID")
	private Integer empId;
	
	@Column(name = "EMP_NAME", nullable = false)
	private String empName;
	
	@Column(name = "EMP_AGE")
	private Integer empAge;
	
	@Column(name = "EMP_SALARY")
	private Float empSalary;
	
	@Column(name = "EMP_CITY")
	private String empCity;
}
