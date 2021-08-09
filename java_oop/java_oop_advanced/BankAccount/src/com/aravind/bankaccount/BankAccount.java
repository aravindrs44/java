package com.aravind.bankaccount;

public class BankAccount {
	private double checking;
	private double savings;
	private static int accountsNum = 0;
	private static double totalMoney = 0.0;
	private String accountNumber;
	
	public BankAccount(double checking) {
		this.checking = checking;
		this.savings = 0.0;
		this.accountNumber = newAccountNumber();
		accountsNum++;
		totalMoney += this.checking + this.savings;
	}
	
	public BankAccount() {
		this.checking = 0.0;
		this.savings = 0.0;
		this.accountNumber = newAccountNumber();
		accountsNum++;
		totalMoney += this.checking + this.savings;
	}
	
	public void withdraw(String account, double amount) {
		if(account == "checking") {
			if(amount > this.checking) {
				System.out.println("Not enough funds in checking account!");
			} else {
				this.checking -= amount;
				totalMoney -= amount;
			}
		} else if(account == "savings") {
			if(amount > this.savings) {
				System.out.println("Not enough funds in savings account!");
			} else {
				this.savings -= amount;
				totalMoney -= amount;
			}
		}
	}
	
	public void deposit(String account, double amount) {
		if(account == "checking") {
			this.checking +=  amount;
			totalMoney += amount;
		} else if (account == "savings") {
			this.savings += amount;
			totalMoney += amount;
		}
	}
	
	private String newAccountNumber() {
		String accountNumber = "";
		for(int i = 1; i <= 10; i++) {
			String temp = Double.toString(Math.floor(Math.random() * 10));
			accountNumber += temp;
		}
		return accountNumber;
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public double getChecking() {
		return this.checking;
	}
	
	public double getSavings() {
		return this.savings;
	}
	
	public static int getAccountsNum() {
		return accountsNum;
	}
	
	public double getTotalMoney() {
		return totalMoney;
	}
	
	public double getAccountTotal() {
		return this.savings + this.checking;
	}
	
}
