import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
public class Inventory {
	
	ArrayList<Item>products;
	
		public Inventory(){
		
		products = new ArrayList<Item>();
		}
		
		public void addItem(Item i){
			products.add(i);
		}
		
		public void removeItem(int t){
			products.remove(t);
		}
		
		public int findIndexByName(String itemName){
			for(int i = 0; i<=products.size(); i++){ //iterating through all the items in the array list
				if((products.get(i).getName()).equals(itemName) )
					return i;
			}
			return -1; //nothing is found
		}
		public String getItemName(int index){
			return products.get(index).getName();
		}
		public double getPrice(int index) {
			return products.get(index).getPrice();
		}
		public int getSize(int index){
			return products.get(index).getSize();
		}
		public String getMaterial(int index){
			return products.get(index).getMaterial();
		}
		public String getColor(int index){
			return products.get(index).getColor();
		}
		public String getFlower(int index){
			return products.get(index).getFlower();
		}
		public String getShape(int index){
			return products.get(index).getShape();
		}
		public void writeData() {
			
			try {
				FileWriter f = new FileWriter("out.txt");
				//--Each line will have Arraylist data
				for(Item it: products){
					f.write(it.getName()+" "+it.getPrice() +" "+ it.getSize() +" "+ it.getMaterial() +" "+ it.getColor() +" "+ it.getFlower() + " "+it.getShape() + "\n");
				}
				f.close();
			}catch(Exception failure){
				System.out.println(failure);
			}
		}
			public void readFile(){
				try{
					FileReader fr = new FileReader("out.txt");
					BufferedReader br = new BufferedReader(fr);
					//reading in the data from the file
					String line;
					while((line = br.readLine())!=null){
						String[] parts = line.split(" ");
						//item object
						//store it into your array list of items.
						String name = parts[0];
						double price = Double.parseDouble(parts[1]);System.out.println(price);
						int quantity = Integer.parseInt(parts[2]);//string into an int 
						String material = parts[3]; 
						String color = parts[4];
						String petal = parts[5];
						String shape = parts[6];
						Item u1 = new Item(name,price,quantity,material,color,petal,shape);
						products.add(u1);
					}
					fr.close(); //close file.
					System.out.println(products.size());
					}catch(Exception failure){
						System.out.println(failure);
				}
			}
		}
		


