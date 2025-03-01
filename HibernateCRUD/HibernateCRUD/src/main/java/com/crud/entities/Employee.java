package com.crud.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Employee {
	
	private Integer empId;
	private String empName;
	private Integer empAge;
	private Float empSalary;
	private String empCity;
}
