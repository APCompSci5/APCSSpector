
public class Lab0380Point {
	public static void main(String args[]){
		System.out.println("TextLab03, 80 Point Version\n");
		int x = 10000;
		System.out.println("Starting seconds:   " + x);
		x=10000/3600;//converts seconds to hours
		System.out.println("Hours:    " +  x); 
		x=10000%3600/60;//converts hours to minutes
		System.out.println("Minutes:   " + x);
		x=2800%60;//converts minutes to seconds
		System.out.println("Seconds:   " + x);
		
		
		
		
	}

}
