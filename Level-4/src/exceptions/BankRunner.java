package exceptions;

public class BankRunner {
	public static void main(String[] args) throws PreviouslyExistingAccountException, AccountOverdrawnException, NonExistentAccountException {
		Bank bank = new Bank();
		bank.addAccount(new Account(), 0);
		bank.addAccount(new Account(), 1);
		bank.addAccount(new Account(), 2);
		bank.addAccount(new Account(), 3);
		bank.addAccount(new Account(), 4);
		
		bank.removeAccount(1);
		
		bank.addMoney(3, 400f);
		
		bank.withdrawMoney(3, 600f);
		
	}
}
