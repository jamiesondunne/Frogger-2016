import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class Frogger_DP
{
	public static void main(String[] args) 
	{
		DrawingPanel panel = new DrawingPanel(400, 600);
		Graphics g = panel.getGraphics();
		Color black = new Color(0, 0, 0);
		panel.setBackground(black);
		Color blue = new Color(0, 0, 255);
		g.setColor(blue);
		g.drawLine(0, 540, 400, 540);
		Color green = new Color(0, 255, 0);
		Color yellow = new Color(255, 255, 0);
		g.setColor(yellow);
		for (int i = 0; i <= 16; i+=2) 
		{
			g.fillRect(20 * 2*i, 415, 50, 50);
		}
		g.setColor(green);
		g.drawRect(0, 290, 400, 60);
		g.setColor(yellow);
		for (int i = 0; i <= 16; i+=2) 
		{
			g.fillRect(20 * 2*i, 150, 50, 50);
		}
		g.setColor(green);
		g.drawLine(0, 65, 400, 65);
	}
}
