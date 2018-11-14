
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.print(evenfib());
	}
	public static int evenfib(){
		int last=0;
		int current=1; 
		int fib=0;
		int sum=0;
		for(int i=1; i<4000000; i++){
			last=current;
		     current=fib;
		    fib=last+current;
		if(i % 2==0)
			sum= sum+i;
			
		}
		return sum;
	}
}
