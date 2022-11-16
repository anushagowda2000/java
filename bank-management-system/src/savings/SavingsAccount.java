package savings;

import com.xworkz.bankapp.bank.BankAccount;

public class SavingsAccount extends BankAccount {

	public double interestRate;

	public SavingsAccount() {
		System.out.println("savings account constructor is called");
	}

	public SavingsAccount (double interestRate) {
			this.interestRate = interestRate;
			
			
			
		
		
			/*
			 * public static void main(String[] args) {
			 * 
			 * SavingsAccount myAccount = new SavingsAccount(); myAccount.deposit(5000);
			 * System.out.println("my account balance is" + myAccount.balance);
			 * 
			 * SavingsAccount sisterAccount = new SavingsAccount();
			 * sisterAccount.deposit(2000); System.out.println("sister's account balance is"
			 * + sisterAccount.balance);
			 * 
			 * myAccount.transfer(500.00, sisterAccount);
			 * System.out.println("my account balance is" + myAccount.balance);
			 * System.out.println("sister's account balance is" + sisterAccount.balance);
			 * 
			 */
public void periodicInterest() {
	double newBalance = getBalance() * interestRate/100;
	deposit(newBalance);
}
}
}
//child/sub/derived class	

// properties cannot be reversed to parent .......can be inherited to child
