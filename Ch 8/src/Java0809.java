// Java0809.java
// This program accesses the object variables only with
// methods of the same object.  The program is divided into
// <private> and <public> members.


public class Java0809
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0809.JAVA\n");
		Piggy tom = new Piggy("Tom",2000);
		System.out.println("Name:    " + tom.getName());
		System.out.println("Savings: " + tom.getSavings());
		System.out.println();
	}      
}


class Piggy
{

	private double savings;
	private String name;

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

	public double getSavings()
	{
		return savings;
	}

	public String getName()
	{
		return name;
	}

}
