import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class ImageTest
{
	

	public static void main(String[] args) throws IOException
	{
	JFrame f = new JFrame("Test");
    f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("dbcity.jpg")))));
	f.setSize(400,400);
	f.setTitle("Frogger");
	f.setLocation(300,300);
	f.setVisible(true);

	}
}

