package ch4;
import java.awt.*;
import java.applet.*;
public class Lab04EC extends Applet {

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawLine( 100,200,400,200);
		g.drawLine(400, 200,400,500);
		g.drawLine(400, 500, 100,500);
		g.drawLine(100, 500, 100,200);
		g.drawLine(200,400,500,400);
		g.drawLine(500,400,500,100);
		g.drawLine(500,100,200,100);
		g.drawLine(200,100,200,400);
		g.drawLine(100, 200,200,100);
		g.drawLine(400, 200, 500,100);
		g.drawLine(500, 400, 400, 500);
		g.drawLine(100, 500, 200, 400);
		g.drawOval(150,150,300,300);
		g.drawOval(275, 150, 50,300);
		g.drawOval(225, 150, 150,300);
		g.drawOval(190, 150, 220, 300);
		g.drawOval(150, 275, 300, 50);
		g.drawOval(150, 225, 300, 150);
		g.drawOval(150, 188, 300, 220);
		g.drawLine(400,650 ,1000, 650);
		g.drawLine(1000, 650, 700,350);
		g.drawLine(700,350, 400, 650);
		g.drawLine(900,800,1500,800);
		g.drawLine(1500,800,1200,500);
		g.drawLine(1200,500 ,900,800);
		g.drawLine(1200,500,700,350);
		g.drawLine(1000,650,1500,800);
		g.drawLine(400, 650, 900,800);
	
		

	}

}
