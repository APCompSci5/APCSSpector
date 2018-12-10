// Java0905.java
// This program uses a parameter constructor to pass information to the Student
// constructor.  Person still calls a default (no parameter) constructor.


public class Java0905
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0905\n");
		Student tom = new Student(12);
		tom.showData();
		System.out.println();
	}
}


class Person
{
	protected int age;

	public Person()
	{
		System.out.println("Person Default Constructor");
		age = 17;
	}

	public int getAge()
	{
		return age;
	}
}


class Student extends Person
{
	protected int grade;

	public Student(int g)
	{
		System.out.println("Student Parameter Constructor");
		grade = g;
	}

	public int getGrade()
	{
		return grade;
	}

	public void showData()
	{
		System.out.println("Student's Grade is " + grade);
		System.out.println("Student's Age is " + age);
	}
}




