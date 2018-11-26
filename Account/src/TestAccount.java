
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 Account regular = new Account(100);
			 
			 regular.deposit(50.00);
			 
			 regular.withdraw(147.00);
			 
			 System.out.println("The final balance is " + "$" + regular.getBalance());
			 
	}
}

