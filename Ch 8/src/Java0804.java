// Java0804.java
// This program constructs multiple objects of the <Piggy> class.
// Using objects allows storing information in multiple instances
// of the <Piggy> class.  This is not possible with <static> methods.


public class Java0804
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0804.JAVA\n");
		Piggy tom = new Piggy();
		tom.initData();
		tom.addData(1200);
		tom.showData();
		Piggy sue = new Piggy();
		sue.initData();
		sue.addData(2500);
		sue.showData();
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

