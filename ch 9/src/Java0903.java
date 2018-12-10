// Java0903.java
// This program shows that the subclass does not have access to the private data
// of the superclass.  This program will not compile.


public class Java0903
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0903\n");
		Student tom = new Student();
		tom.showData();
		System.out.println();
	}
}


class Person
{
	private int age;

	public Person()
	{
		System.out.println("Person Constructor");
		age = 17;
	}
}


class Student extends Person
{
	private int grade;

	public Student()
	{
		System.out.println("Student Constructor");
		grade = 12;
	}

	public void showData()
	{
		System.out.println("Student's Grade is " + grade);
		System.out.println("Student's Age is " + age);
	}
}


