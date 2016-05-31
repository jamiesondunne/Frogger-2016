import java.awt.Color;
import java.awt.Graphics;
public class Frogger_DP
{
	public static final int X = 0;
	public static final int Y = 65;
	public static final int WIDTH = 400;
	public static final int HEIGHT = 600;
	public static final int START = 1;
	public static final int END = 5;
	public static void main(String[] args) 
	{
		DrawingPanel panel = new DrawingPanel(WIDTH, HEIGHT);
		Graphics g = panel.getGraphics();
		gameboard(panel, g);
		cars(panel, g);
	}
	//This method creates the frogger gameboard
	public static void gameboard(DrawingPanel panel, Graphics g) 
	{
		panel.setBackground(Color.BLACK);
		g.setColor(Color.BLUE);
		g.drawLine(X, HEIGHT - HEIGHT/10, WIDTH, HEIGHT - 60);
		g.setColor(Color.YELLOW);
		for (int i = 0; i <= 16; i+=2) 
		{
			g.fillRect(WIDTH/10*i, WIDTH + HEIGHT/40, WIDTH/8, HEIGHT/12);
		}
		g.setColor(Color.GREEN);
		//this is wrong
		g.drawRect(X, Y * 3, WIDTH, HEIGHT/10);
		g.setColor(Color.YELLOW);
		for (int i = 0; i <= 16; i+=2) 
		{
			g.fillRect(WIDTH/10*i, Y * 2, WIDTH/8, HEIGHT/12);
		}
		g.setColor(Color.GREEN);
		g.drawLine(X, Y, WIDTH, Y);
	}
	//This method creates and controls the movement of the cars on the gameboard
	public static void cars(DrawingPanel panel, Graphics g) 
	{
	
		g.setColor(Color.RED);
		for (int i = START; i <=END; i+=2) 
		{
			g.drawRect(50 * i, 500, 50, 25);
		}
		for (int i = START; i <=END; i+=2) 
		{
			g.drawRect(50 * i, 250, 50, 25);
		}
		for (int i = START; i <=END; i+=2) 
		{
			g.drawRect(50 * i, 50, 50, 25);
		}
		
	}
}
