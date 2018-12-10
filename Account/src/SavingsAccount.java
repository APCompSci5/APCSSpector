
public class SavingsAccount extends Account{
	
	private double interestRate;
		
	public SavingsAccount(double dollars, double rate){
		super(dollars + (rate*dollars));
		interestRate = rate;
		
	}
	
	
	}


