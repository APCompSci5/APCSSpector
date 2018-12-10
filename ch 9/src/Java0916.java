// Java0916.java
// Train case study, Stage #2
// This program improves the TrainCar class by allowing a train car to be any color.


import java.awt.*;
import java.applet.*;


public class Java0916 extends Applet
{
	public void paint(Graphics g)
	{
		TrainCar tc = new TrainCar(g,Color.green);
	}
}


class TrainCar
{
	private Color carColor;

	public TrainCar(Graphics g, Color cc)
	{
		carColor = cc;
		g.setColor(carColor);
		g.fillRect(325,250,150,100);
		g.setColor(Color.black);
		g.fillOval(330,325,50,50);
		g.fillOval(420,325,50,50);
	}
}
