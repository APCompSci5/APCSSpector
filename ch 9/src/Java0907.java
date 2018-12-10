// Java0907.java
// In this program both the <Person> class and the <Student> class each have a method
// with the same identifier.  The program returns the grade information twice and
// does not know that the <getData> method of the <Person> class should also be used.


public class Java0907
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0907\n");
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
		System.out.println("Student's Age is   " + getData());
	}
}


