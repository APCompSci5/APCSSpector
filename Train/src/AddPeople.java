import java.awt.Color;
import java.awt.Graphics;

class AddPeople extends TrainCar{
	 private int x;
	 
public AddPeople(Graphics g, Color cc,int x3) {
		super(g, Color.yellow, x3);
		x = x3;
		drawWindow(g);
		drawPeople(g);
		
		 }	

		 public void drawWindow(Graphics g){
		     g.setColor(Color.white);
		     g.fillRect(x+30,280,90,30);
		   
		 }
		 public void drawPeople(Graphics g){
			 g.setColor(Color.black);
			 g.drawOval(x+30, 280, 30, 30);
			 g.fillOval(x+30, 280, 30, 30);
			 g.setColor(Color.pink);
			 g.drawOval(x+60, 280, 30, 30);
			 g.fillOval(x+60, 280, 30, 30);
			 g.setColor(Color.green);
			 g.drawOval(x+90, 280, 30 ,30);
			 g.fillOval(x+90, 280, 30 ,30);
			 

	}
}

		
		 
	 
	 