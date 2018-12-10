// Java0902.java
// This program adds constructors to the <Person> and <Student> classes.
// Note how the <Person> constructor is called, even though there does
// not appear to be a <Person> object instantiated.


public class Java0902
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0902\n");
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

	public int getAge()
	{
		return age;
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

	public int getGrade()
	{
		return grade;
	}

	public void showData()
	{
		System.out.println("Age:   " + getAge());
		System.out.println("Grade: " + getGrade());
	}

}



