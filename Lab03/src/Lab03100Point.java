
public class Lab03100Point {
	public static void main(String args[]){
		
		System.out.println("TextLab03, 100 Point Version");
		int x=10000123;
		System.out.println("Starting milli-seconds:   " + x);
		x=10000123/3600000;//converts milli-seconds to hours
		System.out.println("Hours:  " + x);
		x=10000123%3600000/60123;//converts hours to minutes
		System.out.println("Minutes:  "  +x);
		x=10000123%3600000%600000/10000;//converts minutes to seconds
		System.out.println("Seconds:"  + x);
		x=10000123%3600000%600000%10000;//converts seconds to milli-seconds
		System.out.println(" Milli Seconds: " + x);
	}

}
