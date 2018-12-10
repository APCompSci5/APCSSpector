// Java0915.java
// Train case study, Stage #1
// This program begins the <TrainCar> class.
// The train car is blue and it is always drawn in the same place.


import java.awt.*;
import java.applet.*;


public class Java0915 extends Applet
{
	public void paint(Graphics g)
	{
		TrainCar tc = new TrainCar(g);
	}
}


class TrainCar
{
	public TrainCar(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillRect(325,250,150,100);
		g.setColor(Color.black);
		g.fillOval(330,325,50,50);
		g.fillOval(420,325,50,50);
	}
}
