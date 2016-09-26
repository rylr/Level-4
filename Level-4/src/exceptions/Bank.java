package exceptions;

import java.util.ArrayList;

public class Bank {
	ArrayList<Account> accounts = new ArrayList<Account>();
	
	Bank() {
		
	}
	
	public void addAccount(Account a, int num) throws PreviouslyExistingAccountException{
		for(Account acc : accounts) {
			if(acc.getAccountNumber() == num) {
				throw new PreviouslyExistingAccountException("Account already exists.");
			}
		}
		
		accounts.add(a);
		a.setAccountNumber(num);
	}
	
	public void removeAccount(int num) throws NonExistentAccountException{
		for(Account acc : accounts) {
			if(acc.getAccountNumber() == num) {
				accounts.remove(acc);
				return;
			}
		}
		throw new NonExistentAccountException("Account does not exist.");
	}
	
	public void addMoney(int num, float amount) throws NonExistentAccountException{
		for(Account acc : accounts) {
			if(acc.getAccountNumber() == num) {
				acc.addMoney(amount);
				return;
			}
		}
		
		throw new NonExistentAccountException("Account does not exist.");
	}
	
	public void withdrawMoney(int num, float amount) throws NonExistentAccountException, AccountOverdrawnException{
		for(Account acc : accounts) {
			if(acc.getAccountNumber() == num) {
				acc.withdrawMoney(amount);
			}
		}
	}
}
