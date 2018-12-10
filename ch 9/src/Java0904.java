// Java0904.java
// This program changes private member data to "protected" data.
// The Student class can now access data from the Person class.


public class Java0904
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0904\n");
		Student tom = new Student();
		tom.showData();
		System.out.println();
	}
}


class Person
{
	protected int age;

	public Person()
	{
		System.out.println("Person Constructor");
		age = 17;
	}
}


class Student extends Person
{
	protected int grade;

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


