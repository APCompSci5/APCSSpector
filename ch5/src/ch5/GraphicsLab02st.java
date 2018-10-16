package ch5;
import java.awt.*;
import java.applet.*;


public class GraphicsLab02st extends Applet{
	public void paint(Graphics g)
	{

		int width = 980;
		int height = 630;
		g.drawRect(10,10,width,height);
		int q1 =10;
		int q2 =640;
		int q3 =990;
		int q4 =20;
		int q5 =12;
		// Draw bottom-right corner
						for(int i=0; i<=49; i++){
							g.drawLine(q1+(i*q4),q2,q3, q2-(i*q5));
						}

			}
	}
		
	
		
			