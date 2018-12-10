
public class Account {
	protected double balance;

	public Account(double dollars){
		balance = dollars;
	}
	public double getBalance(){
		return balance;
	}
	public void deposit(double amt){
		balance=balance + amt;
	}
	public void withdraw(double amt){
		balance=balance-amt;
	}
	

	    
	
}

