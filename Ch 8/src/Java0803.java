// Java0803.java
// In this program a <tom> object of the <Piggy> class is instantiated.
// The program compiles now because the methods of the <Piggy>
// class are treated like "object" methods.


public class Java0803
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0803.JAVA\n");
		Piggy tom = new Piggy();
		tom.initData();
		tom.showData();
		tom.addData(1200);
		tom.showData();
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

