package SingletonPattern;

class Withdraw extends Thread { 
	private int amount;
	  public Withdraw (String s,int amount) { 
	    super(s); 
	    this.amount=amount;
	  }

	  public void run() { 
	   Account.getAccount().withdraw(amount);
	  } 
	}