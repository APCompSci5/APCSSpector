// Java0919.java
// Train case study, Stage #5
// This program adds the <Caboose> class.
// A caboose is a red train car with windows and a raised roof.


import java.awt.*;
import java.applet.*;


public class Java0919 extends Applet
{
	public void paint(Graphics g)
	{
		Caboose cab = new Caboose(g,580);
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

	

class Caboose extends TrainCar
{
	private int x;

	public Caboose(Graphics g, int x1)
	{
		super(g,Color.red,x1);
		x = x1;
		drawWindows(g);
		drawTop(g);
	}

	public void drawWindows(Graphics g)
	{
	    g.setColor(Color.white);
	    g.fillRect(x+30,280,30,30);
	    g.fillRect(x+90,280,30,30);
	}

	public void drawTop(Graphics g)
	{
	    g.setColor(Color.red);
	    g.fillRect(x+30,235,90,15);
	    g.setColor(Color.black);
	    g.fillRect(x+25,235,100,5);
	}
}

