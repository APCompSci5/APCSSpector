import java.awt.Color;
import java.awt.Graphics;

public class Box {
	private Color boxColor;
	public Box(Graphics g ,Color cc, int x) {
		
		{
			boxColor = cc;
			g.setColor(boxColor);
			g.fillRect(x,250,300,400);
			
			
		}
		
	}

}
