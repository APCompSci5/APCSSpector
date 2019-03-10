// Java1313.java
// This program demonstrates that <int> values stored into an <ArrayList> object
// must first be converted to <Integer> objects.
// <ArrayList> can only store objects members, not primitive data types.
// Initially, this program compiles, and executes.  If you remove the comments
// from the program an attempt is made to added the values of the <numbers>
// object, which is not possible.


import java.util.ArrayList;
import java.util.Random;


public class Java1313
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("Java1313.java\n");
			Random rand = new Random(12345);
		ArrayList numbers = new ArrayList();

		for (int k = 1; k <= 48; k++)
		{
			int rndInt = (rand.nextInt(900) + 100);
			numbers.add(new Integer(rndInt));
		}

//		int sum = 0;
//		for (int k = 0; k < numbers.size(); k++)
//		{
//			sum += numbers.get(k);
//		}
//		System.out.println("Sum: " + sum);
		System.out.println();
	}
}

