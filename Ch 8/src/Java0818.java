// Java0818.java
// This tests the <Bank> class, which was originally used in Chapter V.
// This time the source code of Bank.java is available by loading
// the Bank.java file.


public class Java0818
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0818.JAVA\n");
		Bank tom = new Bank(5000.0,10000.0);
		Bank sue = new Bank(3000.0,15000.0);
        
        System.out.println("Tom's checking balance: " + tom.getChecking());
		System.out.println("Tom's savings balance:  " + tom.getSavings());
		System.out.println("Sue's checking balance: " + sue.getChecking());
		System.out.println("Sue's savings balance:  " + sue.getSavings());
		System.out.println();
		
		System.out.println("Tom makes a $1000.00 checking withdrawal");
		tom.checkingWithdrawal(-1000.0);
		System.out.println("Tom makes a $2000.00 savings withdrawal");
		tom.savingsWithdrawal(-2000.0);
		System.out.println("Sue makes a $1500.00 checking deposit");
		sue.checkingDeposit(+1500.0);
		System.out.println("Sue makes a $3000.00 savings deposit");
		sue.savingsDeposit(+3000.0);
		System.out.println();		
				
		System.out.println("Tom's combined balance: " + tom.getCombined());
		System.out.println("Sue's combined balance: " + sue.getCombined());
		System.out.println();
		
		tom.closeChecking();
		tom.closeSavings();
		sue.closeChecking();
		sue.closeSavings();
		
		System.out.println("Tom's combined balance: " + tom.getCombined());
		System.out.println("Sue's combined balance: " + sue.getCombined());
		System.out.println();
	}
}

