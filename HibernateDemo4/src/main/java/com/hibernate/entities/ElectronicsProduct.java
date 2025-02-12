package com.hibernate.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ElectronicsProduct {
	
	int id;
	String name;
	int quantity;
	float price;
	
}
