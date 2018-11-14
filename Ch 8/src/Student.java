
public class Student extends Person{ // I'm a person object that will inherit all the properties of a Person

	int id;
	double gpa;
	
	public Student(String first, String last, int age){
		super(first, last,age);
		id =00000;
		gpa=0.0;
	}
	public Student(String first, String last, int age, int i,double g){
		super(first,last,age);
		id= i;
		gpa=g;
	}
}
