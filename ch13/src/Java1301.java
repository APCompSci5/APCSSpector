// Java1301.java
// This program demonstrates that you cannot work with an abstract interface
// directly.  The <Collection> interface is the root interface of the Java built-in
// collections hierarchy.


import java.util.*;


public class Java1301
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA1301.JAVA\n");
		Collection collect = new Collection();
		System.out.println("Collection contains: " + collect);
	}
}


