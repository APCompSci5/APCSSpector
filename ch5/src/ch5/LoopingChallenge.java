package ch5;

public class LoopingChallenge {
	public static void main(String[] args){
		//1. Create a program that prints the sum from 1 to 1000.
		int sum =0;
		for(int k=0;k<=10000;k++)
			sum= sum + k;
			System.out.println(sum);
		
		//2.Create a program that prints all the even numbers from 1 to 100.
		System.out.println();
		for(int x=2;x<=100;x=x+2)
			
		System.out.println(x + " ");
		
		
		
		//Challenge: print out the first 20 numbers of the fibonacci sequence 
		int current = 1;
		int last = 0;
		for(int i=1; i<= 20; i++){
			System.out.println("\n" + last);
			int fib = last + current; 
			last = current; 
			current=fib;
		}
			
		}
		
	}