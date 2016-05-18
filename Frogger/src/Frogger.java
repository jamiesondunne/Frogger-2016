import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class Frogger extends GameBoard
{
	public static void main(String s[])
	{
			JFrame frame = new JFrame("Frogger - use wasd to move");
			// Add a window listner for close button
			frame.addWindowListener(new WindowAdapter() {

				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			// This is an empty content area in the frame
			Graphics g = frame.getGraphics();
			JLabel jlbempty = new JLabel("");
			jlbempty.setPreferredSize(new Dimension(500, 500));
			frame.getContentPane().add(jlbempty, BorderLayout.CENTER);
			frame.pack();
			frame.setVisible(true);	
	}
}
