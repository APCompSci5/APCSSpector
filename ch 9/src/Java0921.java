// Java0921.java
// This program demonstrates inheritance of three sub classes with
// the same <Animal> superclass.


public class Java0921
{
	public static void main(String args[])
	{
		Cat tiger = new Cat("Tiger");
		System.out.println(tiger.getType());

		Bird eagle = new Bird("Eagle");
		System.out.println(eagle.getType());

		Fish shark = new Fish("Shark");
		System.out.println(shark.getType());
	}
}


class Animal
{
	public Animal()
	{
		System.out.println("Animal constructor called");
	}

}


class Cat extends Animal
{
	protected String catType;

	public Cat(String ct)
	{
		catType = ct;
	}

	public String getType()
	{
		return catType;
	}
}

class Bird extends Animal
{
	protected String birdType;

	public Bird(String bt)
	{
		birdType = bt;
	}

	public String getType()
	{
		return birdType;
	}
}

class Fish extends Animal
{
	protected String fishType;

	public Fish(String ft)
	{
		fishType = ft;
	}

	public String getType()
	{
		return fishType;
	}
}