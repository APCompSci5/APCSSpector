// Java0908.java
// This program solves the problem of Java0907.java.  The Java keyword <super> is
// used to indicate that the getData method of the superclass is intended.


public class Java0908
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0908\n");
		Student tom = new Student(12,17);
		tom.showData();
		System.out.println();
	}
}


class Person
{
	protected int age;

	public Person(int a)
	{
		System.out.println("Person Parameter Constructor");
		age = a;
	}

	public int getData()
	{
		return age;
	}
}

class Student extends Person
{
	protected int grade;

	public Student(int g, int a)
	{
		super(a);
		grade = g;
		System.out.println("Student Parameter Constructor");
	}

	public int getData()
	{
		return grade;
	}

	public void showData()
	{
		System.out.println("Student's Grade is " + getData());
		System.out.println("Student's Age is   " + super.getData());
	}
}



