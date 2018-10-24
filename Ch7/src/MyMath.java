import java.util.Scanner;

public class MyMath {
public static void main(String args[])  {
	
	
	System.out.println(addNum(2, 5));
	System.out.println(addNum(10,1000)); 
	
	System.out.println(addNum(10.0,1000.100));
	System.out.println("Circumference of a circle is " + calcCircofCircle(5.5));
	
	System.out.println(AreaofCirc(2));
	System.out.println(AreaofCirc(4.5));
	
	System.out.println(Distance(20,50,10,100));
	System.out.println(Pythagorean(3,4,5));
	
	
	}
//Create a method that adds two numbers.Defines what the method does. 
public static int addNum(int num1, int num2){
	int sum = num1 + num2;
	return sum; 
}
public static double addNum(double num1, double num2){//overloading in java
	return (num1 + num2); 
}

public static double calcCircofCircle(double radius){
	return 2*radius*Math.PI; 
}
public static double AreaofCirc(double radius){
	return Math.PI*Math.pow(radius, 2); 
}
public static double Distance(double num1, double num2,double num3, double num4){
	return Math.sqrt(Math.pow(num3-num1, 2) + Math.pow(num4-num2,2)); 
}
public static double Pythagorean(int side1, int side2, int side3){
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Enter side1 ===>>  ");										
	int option  = keyboard.nextInt();
	System.out.print("Enter side2 ===>>  ");										
	int option  = keyboard.nextInt();
	System.out.print("Enter side3 ===>>  ");										
	int option  = keyboard.nextInt();
	if(side3==0)
		return(Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2))); 
	 if(side2==0)
		 return(Math.sqrt(Math.pow(side3,2)-Math.pow(side1,2)));
	 if(side1==0)
		 return(Math.sqrt(Math.pow(side3,2)-Math.pow(side1, 2)));
}

	

	
}

