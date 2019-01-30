
public class Q2 {
	public static void main(String[] args) {
		System.out.println(new Q2().fib());
	}

	public String fib() {
		int sum = 0;
		int x = 1;  // Represents the current Fibonacci number being processed
		int y = 2;  // Represents the next Fibonacci number in the sequence
		while (x <= 4000000) {
			if (x % 2 == 0)
				sum += x;
			int z = x + y;
			x = y;
			y = z;
		}
		return Integer.toString(sum);
	}
	
}
