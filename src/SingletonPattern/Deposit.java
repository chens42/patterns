package SingletonPattern;

class Deposit extends Thread { 
	private int amount;

	  public Deposit (String s,int amount) { 
	    super(s); 
	    this.amount=amount;
	  }



	public void run() { 
	   Account.getAccount().deposit(amount);
	  } 
	}