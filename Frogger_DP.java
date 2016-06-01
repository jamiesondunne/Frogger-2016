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
	public static final int SIZE = 50;
	public static void main(String[] args) 
	{
		DrawingPanel panel = new DrawingPanel(WIDTH, HEIGHT);
		Graphics g = panel.getGraphics();
		gameboard(panel, g);
		cars(panel, g);
		frog(panel, g);
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
		g.drawRect(X, Y * 4, WIDTH, HEIGHT/10);
		g.setColor(Color.YELLOW);
		for (int i = 0; i <= 16; i+=2) 
		{
			g.fillRect(WIDTH/10*i, Y * 2, WIDTH/8, HEIGHT/12);
		}
		g.setColor(Color.GREEN);
		g.drawLine(X, Y, WIDTH, Y);
	}
	//This method creates the cars on the gameboard
	public static void cars(DrawingPanel panel, Graphics g) 
	{
	
		g.setColor(Color.RED);
		for (int i = START; i <=END; i+=2) 
		{
			g.drawRect(SIZE * i, SIZE * 10, SIZE, SIZE/2);
		}
		for (int i = START; i <=END; i+=2) 
		{
			g.drawRect(SIZE * i, SIZE * 7, SIZE, SIZE/2);
		}
		for (int i = START; i <=END; i+=2) 
		{
			g.drawRect(SIZE * i, SIZE * 4, SIZE, SIZE/2);
		}
		for (int i = START; i <=END; i+=2) 
		{
			g.drawRect(SIZE * i, SIZE * 2, SIZE, SIZE/2);
		}
	}
	//This method creates the frog
	public static void frog(DrawingPanel panel, Graphics g) 
	{
		g.setColor(Color.GREEN);
		g.drawOval(150, 550, SIZE, SIZE);
	}
}
