package com.xworkz.bankapp.bank;

public class BankAccount {
//parent / super /base
	String name;
	String ifscCode;
	String branchName;
	String accountNo;
	private double balance;
	
	public void setBalance(double balance) {
		this.balance = balance;
		}
	public double getBalance() {
		return balance;
	}

	public double withDraw(double amount) {
		this.balance = this.balance - amount;
		return amount;
	}

	// balance = 5000

	public double deposit(double amount) {
		// 0.0 + 5000
		this.balance = this.balance + amount;
		return amount;
	}

	public void transfer(double amount, BankAccount friendsAccount) {
		System.out.println("Transferring to friend's Account");
		withDraw(amount);
		friendsAccount.deposit(amount);
		System.out.println("Transferring Done....");
	}
}


