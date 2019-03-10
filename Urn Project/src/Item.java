
public class Item {
	private String ID;
	private double price;
	private int Size;
	private String Material;
	private String ColorPattern;
	private String Flowers;
	private String Shape;

	public Item(String Name,double dollars,int quantity,String type, String Color,String Petals, String Geom){
		 ID = Name;
		price = dollars;
		Material = type;
		Size = quantity;
		ColorPattern = Color;
		Flowers = Petals;
		Shape = Geom;
		
	}
	public String getName(){
		return ID;
	}
	public double getPrice(){
		return price;
	}
	public int getSize(){
		return Size;
	}
	public String getMaterial(){
		return Material;
		
	}
	public String getColor(){
		return ColorPattern;
	}
	public String getFlower(){
		return Flowers;
	}
	public String getShape(){
		return Shape;
	}
}