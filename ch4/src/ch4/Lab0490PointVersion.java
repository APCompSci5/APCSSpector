package ch4;
import java.awt.*;
import java.applet.*;
public class Lab0490PointVersion extends Applet{

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
		g.drawOval(1010,100,300,300);
		g.drawOval(1135,100,50,300);
		g.drawOval(1085,100,150,300);
		g.drawOval(1050,100,220,300);
		g.drawOval(1010, 225, 300,50);
		g.drawOval(1010, 175, 300,150);
		g.drawOval(1010, 138, 300,220);
		

	}

}