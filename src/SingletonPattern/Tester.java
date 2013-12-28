package SingletonPattern;

public class Tester {
	public static void main(String[] args) {
		Account.getAccount().setBalance(0);
		System.out.println(Account.getAccount().getBalance());

		for (int i = 0; i < 600; i++) {

			Deposit one = new Deposit("Thread #" + i, 100);
			one.start();

			Deposit two = new Deposit("Thread #" + i, 100);
			two.start();

			Withdraw withdrawOne = new Withdraw("Thread #" + i, 200);
			withdrawOne.start();

			Deposit three = new Deposit("Thread #" + i, 100);
			three.start();

			Deposit four = new Deposit("Thread #" + i, 100);
			four.start();

			Withdraw withdraw = new Withdraw("Thread #" + i, 300);
			withdraw.start();
		}

	}

}
