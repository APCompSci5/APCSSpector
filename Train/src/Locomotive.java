import java.awt.Color;
 
import java.awt.Graphics;
import java.awt.Polygon;

class Locomotive extends TrainCar
{
	private int x;

	public Locomotive(Graphics g, Color cc, int x1)
	{
		super(g,cc,x1);
		x = x1;
		drawScoop(g);
		drawFunnel(g);
		drawSmoke(g);
		drawConductor(g);
	}

	private void drawConductor(Graphics g) {
		 g.setColor(Color.white);
		    g.fillRect(x+30,280,30,30);
		    g.setColor(Color.black);
		    g.drawOval(x+30, 280, 30, 30);
		    g.fillOval(x+30, 280, 30, 30);
	}

	public void drawScoop(Graphics g)
	{
		Polygon scoop = new Polygon();
		scoop.addPoint(x,300);
		scoop.addPoint(x,350);
		scoop.addPoint(x-50,350);
	    g.setColor(Color.black);
	    g.fillPolygon(scoop);
	}

	public void drawFunnel(Graphics g)
	{
		Polygon funnel = new Polygon();
		funnel.addPoint(x+20,250);
		funnel.addPoint(x+20,220);
		funnel.addPoint(x,200);
		funnel.addPoint(x,190);
		funnel.addPoint(x+60,190);
		funnel.addPoint(x+60,200);
		funnel.addPoint(x+40,220);
		funnel.addPoint(x+40,250);
	    g.setColor(Color.black);
	    g.fillPolygon(funnel);
	}
	public void drawSmoke(Graphics g) {
		g.setColor(Color.gray);
		g.drawOval(x+5, 140, 50, 50);
		g.fillOval(x+5, 140, 50, 50);
		for(int i=2;i<13 ; i++){
			
			g.fillOval((i*100),140 , 50, 50);
		}
		
			
		
		
		
	}
}
