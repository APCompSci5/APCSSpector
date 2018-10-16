package ch5;
import java.util.Scanner; //Use the Scanner Class library

public class TriangleCheck {
	public static void main(String args[]){
		System.out.println("\nJAVA0503.JAVA\n");
		Scanner input = new Scanner(System.in);//Creates a Scanner item
		System.out.print("Enter 1st Side  ===>>  ");										
		int side1 = input.nextInt(); //Grabs the first input from keyboard
		System.out.print("Enter 2nd Side  ===>>  ");										
		int side2 = input.nextInt();//Grabs the number from the second line
		System.out.print("Enter 3rd Side  ===>>  ");
		int side3 = input.nextInt(); //Grabs the number from the third line
		System.out.println("My numbers are " +  side1  + " " +  side2 + " " + side3);
		
		if(side1==side2&& side2==side3 && side1==side3){
			System.out.println("equilateral triangle");
		}
		else if(side1==side2||side2==side3||side1==side3){
			System.out.println("isosceles triangle");
		}
		else{
			System.out.println("scalene triangle");
		}
}
}