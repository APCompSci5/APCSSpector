package ch5;
import java.awt.*;
import java.applet.*;


public class GraphicsLab02110ptversion extends Applet{

	public void paint(Graphics g) {
		int width = 980;
		int height = 630;
		g.drawRect(10,10,width,height);
		g.drawRect(250,160, 500, 330);
		int q1 =10;
		int q2 =640;
		int q3 =990;
		int q4 =20;
		int q5 =12;
		int q6 = 250;
		int q7 =340;
		int q8 =510;
		int q9 =320;
		int q10 =252;
		
		
	
			// Draw top-right corner
			for(int i=0; i<=49; i++){
				g.drawLine(q1+(i*q4),q1,q3, q1+(i*q5));
			}	
		
			// Draw bottom-right corner
			for(int i=0; i<=49; i++){
				g.drawLine(q1+(i*q4),q2,q3, q2-(i*q5));
			}	
		
		
			// Draw bottom-left corner
			for(int i=0; i<=49; i++){
				g.drawLine(q1,q2-(i*q5),q3-(i*q4), q2);
			}
		
				
			// Draw top-left corner
			for(int i=0; i<=49; i++){
				g.drawLine(q1,q1+(i*q5),q3-(i*q4), q1);
			}
		}
	


	}
