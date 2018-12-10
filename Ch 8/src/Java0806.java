// Java0806.java
// This program demonstrates that constructors can be overloaded.
// It is possible to supply information, using parameters, to the 
// new object at the instance that it is constructed.


public class Java0806
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0806.JAVA\n");
		Piggy tom = new Piggy();
		tom.showData();
		Piggy sue = new Piggy("Sue",1800);
		sue.showData(); 
		System.out.println();
	}      
}


class Piggy
{
	
	double savings;
	String name;

	public Piggy()
	{
		System.out.println("No parameter constructor");
		savings = 0;
		name = "";
	}

	public Piggy(String n,double s)
	{
		System.out.println("Parameter constructor");
		name = n;
		savings = s;
	}

	public void showData()
	{
		System.out.println("Name:    " + name);
		System.out.println("Savings: " + savings);
	}

}
