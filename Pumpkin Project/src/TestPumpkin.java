
public class TestPumpkin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Pumpkin small = new Pumpkin(5);
		Pumpkin medium = new Pumpkin(10);
		Pumpkin large = new Pumpkin(15);
		
		
		
		System.out.println("first Pumpkin's weight is " + small.getWeight());
		System.out.println("second Pumpkin's weight is " + medium.getWeight());
		System.out.println("third Pumpkin;s weight is " + large.getWeight());
		
		System.out.println("first Pumpkin's price is " + small.Price());
		System.out.println("second Pumpkin's price is " + medium.Price());
		System.out.println("third Pumpkin's price is " + large.Price());
		
		
		for(int i = 0; i < 5; i++){
		small.grow();
		medium.grow(); 
		large.grow();
		}
		
		System.out.println("The new weight for Pumpkin 1 is " + small.getWeight());
		System.out.println("The new weight for Pumpkin 2 is " + medium.getWeight());
		System.out.println("The new weight Pumpkin 3 is " + large.getWeight());
		System.out.println("The total weight is " + (small.getWeight() + medium.getWeight() + large.getWeight()));
		
		
		System.out.println("The new price for Pumpkin 1 is " + small.Price());
		System.out.println("The new price for Pumpkin 2 is " + medium.Price());
		System.out.println("The new price for Pumpkin 3 is " + large.Price());
		System.out.println("The total price is " + (small.Price() + medium.Price() + large.Price()));
		
		
		
		
		
		
}
}