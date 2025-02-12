package com.hibernate.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
	
	private int pid;
	private String pname;
	private int pquantity;
	private float price;
	
}
