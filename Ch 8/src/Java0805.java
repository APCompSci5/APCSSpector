// Java0805.java
// This program exchanges the <initData> method with the <Piggy> constructor.
// Constructors add reliability to programs because they are called
// automatically during the instantiation of a new object.


public class Java0805
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0805.JAVA\n");
		Piggy tom = new Piggy();
		tom.showData();
		tom.addData(1200);
		tom.showData();
		System.out.println(); 
	}      

}


class Piggy
{

	double savings;

	public Piggy()
	{
		System.out.println("Constructing a Piggy object");
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

