
public class AccountTest2 {
	
	public static void main(String[] args){
		SavingsAccount a1 = new SavingsAccount(1000,.1);
		CheckingAccount b1 = new CheckingAccount(1000,250);
		
	    System.out.println("The balance in your savings account is " + a1.getBalance());
	   System.out.println(b1.Withdraw(500));


				CheckingAccount OwenBryant = new CheckingAccount(500);
				OwenBryant.Withdraw(150);
				OwenBryant.deposit(22.55);
				OwenBryant.Withdraw(47.62);
				OwenBryant.Withdraw(400);
				System.out.println("Your balance: $"+OwenBryant.getBalance()+"\n");
				
				CheckingAccount TimSoley = new CheckingAccount(500, 500);
				TimSoley.Withdraw(150);
				TimSoley.deposit(22.50);
				TimSoley.Withdraw(47.62);
				TimSoley.Withdraw(400);
				System.out.println("Your balance: $"+TimSoley.getBalance());
				System.out.println("Overdraft Amount: $"+TimSoley.getOverDraftAmount());
				
				
			}

		}

