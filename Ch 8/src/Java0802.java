// Java0802.java
// This program removes the <static> keyword from the members of the
// <Piggy> class.  The program no longer compiles.


public class Java0802
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0802.JAVA\n");
		Piggy.initData();
		Piggy.showData();
		Piggy.addData(1200);
		Piggy.showData();
		System.out.println();
	}      
}


class Piggy
{
	
	double savings;

	public void initData()
	{
		savings = 0;
	}

	public void addData(double s)
	{
		savings += s;
	}

	public void showData()
	{
		System.out.println("Savings: " + savings);
	}
}
