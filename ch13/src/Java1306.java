// Java1306.java
// This program demonstrates that <List> classes can store duplicate
// elements, but <set> classes do not store duplicate elements.


import java.util.*;


public class Java1306
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA1306.JAVA\n");
		Collection object1 = new ArrayList();
		Collection object2 = new LinkedList();
		Collection object3 = new HashSet();
		Collection object4 = new TreeSet();

		Random rand = new Random(500);
		for (int k = 1; k <= 10; k++)
		{
			int rndInt = rand.nextInt(10) + 100;
			Integer intObj = new Integer(rndInt);
			object1.add(intObj);
			object2.add(intObj);
			object3.add(intObj);
			object4.add(intObj);
		}

		System.out.println("object1 contains  " + object1);
		System.out.println("object2 contains  " + object2);
		System.out.println("object3 contains  " + object3);
		System.out.println("object4 contains  " + object4);
		System.out.println();
	}
}




