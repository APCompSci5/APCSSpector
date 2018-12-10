// Java0808.java
// Java keyword <private> is placed in front of the <Piggy> instance variables.
// <Piggy> variables are no longer accessible from outside the <Piggy> class.
// This program will not compile.


public class Java0808
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0808.JAVA\n");
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

	public void showData()
	{
		System.out.println("Name:    " + name);
		System.out.println("Savings: " + savings);
	}

}

