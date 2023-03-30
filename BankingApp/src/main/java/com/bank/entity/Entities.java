package com.bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Entities {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer account_No;
	private String user_Name;
	private Double balance;
	private Integer pin;
	public Integer getAccount_No() {
		return account_No;
	}
	public void setAccount_No(Integer account_No) {
		this.account_No = account_No;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
