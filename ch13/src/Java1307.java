// Java1307.java
// This program demonstrates the <add> method of the <ArrayList> class.
// Note that each name is added to the end of the list.


import java.util.ArrayList;


public class Java1307
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("Java1307.java\n");

		ArrayList names = new ArrayList();
		names.add("Isolde");
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heidi");

		System.out.println("names contains " + names);
		System.out.println();
  	}
}

