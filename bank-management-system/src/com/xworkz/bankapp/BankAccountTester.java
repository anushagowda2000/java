package com.xworkz.bankapp;

import com.xworkz.bankapp.bank.BankAccount;
//child/sub/derived class
public class BankAccountTester {
	public static void main(String[] args) {
		/*
		 * BankAccount account = new BankAccount(); account.deposit(5000);
		 * System.out.println("My account balance is" + account.getbalance);
		 * 
		 * BankAccount friendsAccount = new BankAccount(); friendsAccount.deposit(700);
		 * System.out.println("the friend's account balance is" +
		 * friendsAccount.balance); // String dullAccount = null;
		 * 
		 * account.transfer(700.00, friendsAccount);
		 * System.out.println("My Account balance is" + account.balance);
		 * System.out.println("The friend's account balance is" +
		 * friendsAccount.balance);
		 */
		SavingsAccount sv = new SavingsAccount(0.7);
		sv.deposit(1000);
		sv.periodicInterest();
		System.out.println(sv.getBalance);
		
		
	}
}


//inheritance : acquiring properties from one class to another class i.e from parent to child class/super too sub class/base to derived class
//Is - A relationship
//extends  used at class level