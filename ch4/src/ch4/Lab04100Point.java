package ch4;
import java.awt.*;
import java.applet.*;

public class Lab04100Point extends Applet{

	public  void paint(Graphics g) {
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
		g.drawOval(1010,100,275,275);
		g.drawOval(1125,100,50,275);
		g.drawOval(1075,100,150,275);
		g.drawOval(1040,100,220,275);
		g.drawOval(1010, 225, 275,50);
		g.drawOval(1010, 175, 275,150);
		g.drawOval(1010, 138, 275,220);
		g.drawLine(400,650 ,1000, 650);
		g.drawLine(1000, 650, 700,350);
		g.drawLine(700,350, 400, 650);
		g.drawLine(900,800,1500,800);
		g.drawLine(1500,800,1200,500);
		g.drawLine(1200,500 ,900,800);
		g.drawLine(1200,500,700,350);
		g.drawLine(1000,650,1500,800);
		g.drawLine(400, 650, 900,800);
		g.drawLine(700,350,700,650);
		g.drawLine(850, 500,400,650);
		g.drawLine(550,500,1000,650);
		g.drawLine(1200,500,1200,800);
		g.drawLine(1350,650, 900,800);
		g.drawLine(1050,650 ,1500,800);
	}

}