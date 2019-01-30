
public class TestBank {

	public static void main(String[] args) {
		Bank piggyBank = new Bank();
		
		
		piggyBank.addCustomer("Jane" , "Simms", 100.00);
		piggyBank.addCustomer("Owen", "Bryant", 5);
		piggyBank.addCustomer("Tim", "Soley" ,2 );
		piggyBank.addCustomer("Maria", "Soley" , 4);
		
		for(int i =0; i < piggyBank.getNumOfCustomers();i++)
			System.out.println(piggyBank.getCustomer(i).getFirstName() + " balance is " + piggyBank.getCustomer(i).getAccount().getBalance());
		
}
}
