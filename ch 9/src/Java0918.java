// Java0918.java
// Train case study, Stage #4
// This program adds the <Locomotive> class.
// A <Locomotive> is-a <TrainCar>


import java.awt.*;
import java.applet.*;


public class Java0918 extends Applet
{
	public void paint(Graphics g)
	{
		Locomotive loc = new Locomotive(g,Color.blue,70);
	}
}


class TrainCar
{
	private Color carColor;

	public TrainCar(Graphics g, Color cc, int x)
	{
		carColor = cc;
		g.setColor(carColor);
		g.fillRect(x,250,150,100);
		g.setColor(Color.black);
		g.fillOval(x+5,325,50,50);
		g.fillOval(x+95,325,50,50);
	}
}


class Locomotive extends TrainCar
{
	private int x;

	public Locomotive(Graphics g, Color cc, int x1)
	{
		super(g,cc,x1);
		x = x1;
		drawScoop(g);
		drawFunnel(g);
	}

	public void drawScoop(Graphics g)
	{
		Polygon scoop = new Polygon();
		scoop.addPoint(x,300);
		scoop.addPoint(x,350);
		scoop.addPoint(x-50,350);
	    g.setColor(Color.black);
	    g.fillPolygon(scoop);
	}

	public void drawFunnel(Graphics g)
	{
		Polygon funnel = new Polygon();
		funnel.addPoint(x+20,250);
		funnel.addPoint(x+20,220);
		funnel.addPoint(x,200);
		funnel.addPoint(x,190);
		funnel.addPoint(x+60,190);
		funnel.addPoint(x+60,200);
		funnel.addPoint(x+40,220);
		funnel.addPoint(x+40,250);
	    g.setColor(Color.black);
	    g.fillPolygon(funnel);
	}
}



