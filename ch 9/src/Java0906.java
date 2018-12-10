// Java0906.java
// This program demonstrates how to pass information to the
// superclass by using the <super> Java keyword.


public class Java0906
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0906\n");
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

	public int getAge()
	{
		return age;
	}
}


class Student extends Person
{
	protected int grade;

	public Student(int g, int a)
	{
		super(a);   // this must be the first call
		grade = g;
		System.out.println("Student Parameter Constructor");
	}

	public int getGrade()
	{
		return grade;
	}

	public void showData()
	{
		System.out.println("Student's Grade is " + getGrade());
		System.out.println("Student's Age is " + getAge());
	}
}


