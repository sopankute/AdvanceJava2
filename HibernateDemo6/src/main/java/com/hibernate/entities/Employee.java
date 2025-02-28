package com.hibernate.entities;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
@Entity
@Table(name = "emp_table")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "e_id")
	private Integer id;
	
	@Column(name = "e_name")
    private String name;
	
	@Column(name = "e_age")
//	@Transient
    private Integer age;
	
	@Column(name = "e_salary")
    private Float salary;
	
	

}
