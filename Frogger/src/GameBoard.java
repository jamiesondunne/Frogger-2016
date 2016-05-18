import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameBoard extends JFrame {
	
	
		public static void main(String s[]) {
			JFrame frame = new JFrame("JFrame Source Demo");
			// Add a window listner for close button
			frame.addWindowListener(new WindowAdapter() {

				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			// This is an empty content area in the frame
			JLabel jlbempty = new JLabel("");
			jlbempty.setPreferredSize(new Dimension(500, 500));
			frame.getContentPane().setBackground(Color.BLACK);
			frame.getContentPane().add(jlbempty, BorderLayout.CENTER);
			frame.pack();
			frame.setVisible(true);
		}
}
