
public class Fibonnaci {

public static void main (String args[])
{
	long fibo[] = new long[100];// prints 100 numbers in the sequence
	fibo[0] = 0; //declares first number in the sequence
	fibo[1] = 1; // declares second number in the sequence
	System.out.print(fibo[0] + "\n" + fibo[1]);//prints the first two numbers in the sequence
	for(int i = 2; i<fibo.length; i++)//for loop to print all the numbers in the sequence starting with the third number in the sequence to the array limit
	{
		System.out.println(computeFibo(fibo,i));
	}
	
}
public static long computeFibo(long[] list, int n){
	int i = n; // takes number of fibonacci code
	list[i] = list[i-1]+ list[i-2]; // computes fibonnacci "current = previous - previous of previous"
	return list[i];// returns fibonacci#
}
}



