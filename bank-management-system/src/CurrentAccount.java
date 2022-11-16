import com.xworkz.bankapp.bank.*;

public class CurrentAccount extends BankAccount {
	public static void main(String[] args) {

		CurrentAccount current = new CurrentAccount();
		current.deposit(2000);
		System.out.println("Current account balance is" + current.balance);

		CurrentAccount businessAccount = new CurrentAccount();
		businessAccount.deposit(1000);
		System.out.println("business account balance is" + businessAccount.balance);

		current.transfer(500.00, businessAccount);
		System.out.println("current account balance is" + current.balance);
		System.out.println("business account balance is" + businessAccount.balance);

	}

}
