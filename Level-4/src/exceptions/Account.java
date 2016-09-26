package exceptions;

public class Account {
	private float balance = 0;
	public int actNum;
	
	Account() {
	
	}
	
	void addMoney(float amount) {
		balance += amount;
	}
	
	float withdrawMoney(float amount) throws AccountOverdrawnException{
		if(balance - amount < 0) {
			throw new AccountOverdrawnException("Not enough money in account.");
		}
		else {
			balance = balance - amount;
			return amount;
		}
	}
	
	void setAccountNumber(int num) {
		actNum = num;
	}
	
	int getAccountNumber() {
		return actNum;
	}
}
