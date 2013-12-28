package SingletonPattern;

public class Account {
	public static Account Account;
	private int accountNumber;
	private int balance;

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int amount) {
		balance = amount;
	}

	public void deposit(int amount) {
		if (balance > 0)
		balance = balance + amount;
		System.err.println(balance);
	}

	public void withdraw(int amount) {
		if (balance > 0)
			balance = balance - amount;
		System.err.println(balance);
	}

	public static Account getAccount() {
		if (Account == null)
			Account = new Account();
		return Account;
	}
}
