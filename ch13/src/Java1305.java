// Java1305.java
// This program demonstrates the <add> method of the <Collection> interface.
// The <add> method is implemented in each one of the four <Collection>
// classes.  This program may give the impression that the <add> method
// is identical in each one of the four classes.


import java.util.*;


public class Java1305
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA1305.JAVA\n");
		Collection object1 = new ArrayList();
		Collection object2 = new LinkedList();
		Collection object3 = new HashSet();
		Collection object4 = new TreeSet();

		for (int k = 1; k <= 10; k++)
		{
			Integer intObj = new Integer(k);
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


