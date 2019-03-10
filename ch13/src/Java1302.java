// Java1302.java
// This program generates the same compile error message as the previous program.
// <List> and <Set> are interfaces and cannot be instantiated.
// <List> and <Set> are sometimes called "subinterfaces."


import java.util.*;


public class Java1302
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA1302.JAVA\n");
		List list = new List();
		Set set = new Set();
		System.out.println("list contains: " + list);
		System.out.println("set  contains: " + set);
	}
}


