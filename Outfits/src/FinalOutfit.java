
import java.awt.*;

import java.applet.*;





public class FinalOutfit extends Applet{

	

	public void paint(Graphics g) {

		Person person = new Person(g, 70);
		Pants p = new Pants(g,Color.green, 70);
		Pockets r = new Pockets(g,70);
		Shirts s = new Shirts(g,Color.red,70);
		RippedJeans q = new RippedJeans(g,70);

		



	}



}