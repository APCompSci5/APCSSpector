import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class BoxHoles extends Box{
	private int x;
	private Color hColor;
	public BoxHoles(Graphics g, Color cc, int x1) {
		super(g, cc, x1);
		x = x1;
		drawShape(g);
		
	}
	public void drawShape(Graphics g){
		int[] coordinates= {270,270,570,385,500};
		g.setColor(Color.red);
		Polygon hole = new Polygon();
		hole.addPoint(x+30,coordinates[0]);
		hole.addPoint(x+290,coordinates[1]);
		hole.addPoint(x+100,coordinates[2]);
		hole.addPoint(x+30,coordinates[3]);
		hole.addPoint(x+300,coordinates[4]);
		g.setColor(Color.green);
		g.fillPolygon(hole);
	}
}
