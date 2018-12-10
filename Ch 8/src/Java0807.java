// Java0807.java
// In this program "main" accesses the variables of the <tom> object.
// Object variables should only be accessed by member object methods.


public class Java0807
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0807.JAVA\n");
		Piggy tom = new Piggy("Tom",2000);
		tom.showData();
		tom.name = "George";
		tom.savings = 2500000;
		tom.showData();
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
