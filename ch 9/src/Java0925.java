// Java0925.java
// This program demonstrates that it is possible to use the super class identifier
// <Object> to declare each sub class object.



public class Java0925
{
	public static void main(String args[])
	{
		Object tiger = new Cat("Tiger");

		Object eagle = new Bird("Eagle");

		Object shark = new Fish("Shark");
	}
}



class Cat extends Object
{
	protected String catType;

	public Cat(String ct)
	{
		System.out.println("Cat constructor called");
		catType = ct;
	}
}

class Bird extends Object
{
	protected String birdType;

	public Bird(String bt)
	{
		System.out.println("Bird constructor called");
		birdType = bt;
	}
}

class Fish extends Object
{
	protected String fishType;

	public Fish(String ft)
	{
		System.out.println("Fish constructor called");
		fishType = ft;
	}
}