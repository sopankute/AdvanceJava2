package com.hibernate.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {
	private int id;
	private String holderName;
	private long accountNo;
	private float balance;
}
