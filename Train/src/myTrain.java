import java.awt.*;

import java.applet.*;

public class myTrain extends Applet{
	
	public void paint(Graphics g)
	{
		TrainCar tc1 = new TrainCar(g,Color.blue,70);
		TrainCar tc2 = new TrainCar(g,Color.green,240);
		TrainCar tc3 = new TrainCar(g,Color.yellow,410);
		TrainCar tc4 = new TrainCar(g,Color.magenta,580);
		TrainCar tc5 = new TrainCar(g,Color.pink,750);
		WindowTrain cab = new WindowTrain(g,580);
		Locomotive car = new Locomotive(g,Color.blue,70);
		Caboose c1 = new Caboose(g,Color.black,580);
		Smoke l1 = new Smoke(g,Color.cyan ,930);
		AddPeople p2 = new AddPeople(g,Color.yellow,410);
	}
}


		
		