// Java0917.java
// Train case study, Stage #3
// This program further improves the <TrainCar> class by
// allowing train cars to be drawn in different locations.


import java.awt.*;
import java.applet.*;


public class Java0917 extends Applet
{
	public void paint(Graphics g)
	{
		TrainCar tc1 = new TrainCar(g,Color.blue,70);
		TrainCar tc2 = new TrainCar(g,Color.green,240);
		TrainCar tc3 = new TrainCar(g,Color.yellow,410);
		TrainCar tc4 = new TrainCar(g,Color.magenta,580);
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
