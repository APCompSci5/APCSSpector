package ch12;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	boolean ans = isEven(10);
		System.out.println(" 10 is even:" + ans);
		
		ans = isEven(7);
		System.out.println(ans);
		*/
		fizzBuzz();
		while(true){
		Scanner in = new Scanner(System.in);
		System.out.println("type num here: ");
		int number = in.nextInt();
	    System.out.print(cntEven(number));
		System.out.println(number + " is even: " + isEven(number));
		
		}
		

	}
	// a number is even or not.
public static boolean isEven(int num){
	boolean even = false;
	
	if(num % 2 ==0)
		even = true;
	else 
		even = false;
	return even;
}
//count the number of even numbers between 1 and user input.
public static int cntEven(int number){
	int increment=0;
	for(int i = 1; i<=number; i++){
		if(i % 2==0)
			increment++;
	}
	return increment;
	}
	

/* Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz"
 * instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three
 * and five print "FizzBuzz"
 * */
public static void fizzBuzz(){
for(int i=1;i<=100;i++){
	if(i% 3==0 && i%5!=0)
		System.out.println("Fizz" + i);
	else if(i % 5==0 && i%3!=0)
		System.out.println("Buzz" + i);
	else if(i % 3==0 && i % 5 ==0)
		System.out.println("FizzBuzz" + i);
	else 
		System.out.print(i);
}
}
}