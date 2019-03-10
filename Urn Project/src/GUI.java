import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
	//Item(double dollars,int quantity,String type, String Color,String Petals, String Geom)
	// add all attributes 
	JFrame myFrame = new JFrame("Evan's Urns"); 
	JPanel myPanel = new JPanel(); 
	private JLabel Name;
	private JLabel Cash;
	private JLabel Fabric;
	private JLabel Magnitude;
	private JLabel Color;
	private JLabel Flower;
	private JLabel Geom;
	private JTextField ID;
	private JTextField Dough;
	private JTextField Material;
	private JTextField Surface;
	private JTextField Paint;
	private JTextField Petals;
	private JTextField Shape;
	private JTextField Information;
	private JLabel Product;
	private JButton Save;
	private JButton Add;
	private JButton Search;
	private JTextField SearchBar;
	private Inventory stock = new Inventory();
	
	
	


//3 buttons + textfield 
public GUI(){
	
	stock.readFile();
	Name = new JLabel("Name:");
	ID = new JTextField(6);
	Cash = new JLabel("Price:");
	Dough = new JTextField(6);
	Fabric = new JLabel("Material:");
	Material = new JTextField(6);
	Magnitude = new JLabel("Size:");
	Surface = new JTextField(6);
	Color = new JLabel("Color:");
	Paint = new JTextField(6);
	Flower = new JLabel("Flowers:");
	Petals = new JTextField(6);
	Geom = new JLabel("Shape:");
	Shape = new JTextField(6);
	Add = new JButton("Apply");
	Save = new JButton("Save");
	Information = new JTextField(17);
	Product = new JLabel("Information:");
	Search = new JButton("Search");
	SearchBar = new JTextField(6);
	
	Save.addActionListener(this);
	Add.addActionListener(this);
	Search.addActionListener(this);
	ID.addActionListener(this);
	Dough.addActionListener(this);
	Material.addActionListener(this);
	Surface.addActionListener(this);
	Paint.addActionListener(this);
	Petals.addActionListener(this);
	Shape.addActionListener(this);
	Information.addActionListener(this);
	SearchBar.addActionListener(this);

	
	myFrame.setLayout(new GridLayout(8,2));
	myPanel.add(Save);
	myPanel.add(Add);
	myPanel.add(Search);
	myPanel.add(SearchBar);
	myPanel.add(Name);
	myPanel.add(ID);
	myPanel.add(Cash);
	myPanel.add(Dough);
	myPanel.add(Magnitude);
	myPanel.add(Surface);
	myPanel.add(Fabric);
	myPanel.add(Material);
	myPanel.add(Color);
	myPanel.add(Paint);
	myPanel.add(Flower);
	myPanel.add(Petals);
	myPanel.add(Geom);
	myPanel.add(Shape);
	myPanel.add(Product);
	myPanel.add(Information);
	
	myFrame.add(myPanel);
	myFrame.setTitle("Evan's Urns");
	myFrame.setSize(40, 40);
	myFrame.setVisible(true);
	
	
	
}


@Override
public void actionPerformed(ActionEvent e) {
	String str = e.getActionCommand();
	if(str.equals("Save")){
		stock.writeData();
	}
	if(str.equals("Apply")){
		String n = ID.getText();
		double d = Double.parseDouble(Dough.getText());
		int q = Integer.parseInt(Surface.getText());
		String t = Material.getText();
		String c = Paint.getText();
		String f = Petals.getText();
		String g = Shape.getText();
		
		
		Item i = new Item(n,d,q,t,c,f,g);
		
		
		stock.addItem(i);
	}
		if(str.equals("Search")){
		int index =	stock.findIndexByName(SearchBar.getText());
		Information.setText(stock.getItemName(index) +"\n" +
		String.valueOf(stock.getPrice(index) +"\n" +
		String.valueOf(stock.getSize(index) +"\n" +
		stock.getMaterial(index) +"\n" + stock.getFlower(index) +"\n"+
				stock.getColor(index) +"\n"+stock.getShape(index))));
			
	}
}
		public static void main(String[] args){
			GUI g = new GUI();
		}

	
	}
	// TODO Auto-generated method stub
	




