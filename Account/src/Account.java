
public class Account {
	private double balance=100;

	public Account(double dollars){
		dollars = balance;
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
