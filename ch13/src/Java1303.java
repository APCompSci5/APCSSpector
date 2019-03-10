// Java1303.java
// This program demonstrates the four <Collection> classes.
// The contents of each object can be viewed using <println>.
// This program only displays a set of empty [ ] brackets,
// because no value have been added to any one of the objects.


import java.util.*;


public class Java1303
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA1303.JAVA\n");
		ArrayList object1  = new ArrayList();
		LinkedList object2 = new LinkedList();
		HashSet object3    = new HashSet();
		TreeSet object4    = new TreeSet();

		System.out.println("object1 contains  " + object1);
		System.out.println("object2 contains  " + object2);
		System.out.println("object3 contains  " + object3);
		System.out.println("object4 contains  " + object4);
		System.out.println();
	}
}


