// Java1304.java
// This program is almost identical to the previous program.
// The same four objects are instantiated with each of the four
// <Collection> classes.  This time note that the class on the
// left side of the object actually is the <Collection> interface.
// This is not only allowed, but frequently very desirable for
// proper class interaction.


import java.util.*;


public class Java1304
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA1304.JAVA\n");
		Collection object1 = new ArrayList();
		Collection object2 = new LinkedList();
		Collection object3 = new HashSet();
		Collection object4 = new TreeSet();

		System.out.println("object1 contains  " + object1);
		System.out.println("object2 contains  " + object2);
		System.out.println("object3 contains  " + object3);
		System.out.println("object4 contains  " + object4);
		System.out.println();
	}
}


