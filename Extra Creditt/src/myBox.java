import java.awt.*;

import java.applet.*;
public class myBox extends Applet {
	
	public void paint(Graphics g){
		
		Box b = new Box(g,Color.black,70);
		BoxHoles c = new BoxHoles(g,Color.red,500);
	}


}
