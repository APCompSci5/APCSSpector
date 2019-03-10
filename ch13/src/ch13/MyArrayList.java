package ch13;
import java.awt.Color;
import java.util.ArrayList;
public class MyArrayList {
	
	
	
	
	

	public static void main(String[] args) {
	
		
		Candy tootsieRoll = new Candy("chocolate", new Color(130,53,15), .25);
		Candy kitkat = new Candy("white chocolate", Color.white,1.00);
		
		
		ArrayList<Candy> list = new ArrayList<Candy>();
		list.add(tootsieRoll);
		list.add(kitkat);
		
		System.out.println(list);
		
		//enhanced for loop
		for(Candy c: list){
			System.out.println(c.getPrice());
			System.out.println(c.getFlavor());

	}

	}
}
