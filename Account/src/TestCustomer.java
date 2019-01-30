
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer leeman = new Customer("josh", "leeman", 1000);
		Account leemanAcct = leeman.getAccount();
		leeman.getAccount().deposit(500);
		leeman.getAccount().withdraw(100);
		System.out.println(leeman.getAccount().getBalance());
		
		Customer Noa = new Customer("Noa" , "Rogoszinski" , 500);
		Account NoaAcct = Noa.getAccount();
		NoaAcct.deposit(1000);
		NoaAcct.withdraw(10);
		System.out.println(Noa.getFirstName() + "balance is " + NoaAcct.getBalance());
	}

}
