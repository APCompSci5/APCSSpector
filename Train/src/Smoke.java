import java.awt.Color;
import java.awt.Graphics;

class Smoke extends TrainCar{
	private int x;
	public Smoke(Graphics g,Color cc, int x2) {
		super(g,cc ,x2);
		x= x2;
		
		drawBalloons(g);
		drawWindows(g);
	
	}
	public void drawBalloons(Graphics g) {
		g.setColor(Color.red);
		g.drawOval(x+5,200,50,50);
		g.fillOval(x+5, 200, 50, 50);
		g.setColor(Color.green);
		g.drawOval(x+50, 200, 50, 50);
		g.fillOval(x+50, 200, 50, 50);
		g.setColor(Color.orange);
		g.drawOval(x+90, 200, 50, 50);
		g.fillOval(x+90, 200, 50, 50);
		
	}
	public void drawWindows(Graphics g){
	    g.setColor(Color.white);
	    g.fillRect(x+30,280,30,30);
	    g.fillRect(x+90,280,30,30);
	
}
}