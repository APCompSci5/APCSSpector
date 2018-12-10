// Java0801.java
// This program introduces the <Piggy> - short for PiggyBank - class, which will 
// be used to demonstrate a variety of Object Oriented Programming features.
// This program uses <static> class variables and static class methods.
// Every <Piggy> method is accessed using the <Piggy> class identifier.


public class Java0801
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0801.JAVA\n");
		Piggy.initData();
		Piggy.showData();
		Piggy.addData(1200);
		Piggy.showData();
		System.out.println();
	}      
}


class Piggy
{
	
	static double savings;

	public static void initData()
	{
		savings = 0;
	}

	public static void addData(double s)
	{
		savings += s;
	}

	public static void showData()
	{
		System.out.println("Savings: " + savings);
	}
}
