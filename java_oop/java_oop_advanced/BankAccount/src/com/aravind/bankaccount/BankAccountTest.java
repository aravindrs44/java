package com.aravind.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount aravind = new BankAccount();
		aravind.deposit("checking", 1000);
		System.out.println(aravind.getChecking());
		System.out.println("The above was the checking account!");
		System.out.println(BankAccount.getAccountsNum());
		System.out.println("The above was the number of accounts!");

	}

}
