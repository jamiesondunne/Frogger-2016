	import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.util.*;

public class test 
{
	public static void main(String[] args)
	{
		BufferedImage image = null;
		
	//1. Create the frame.
	JFrame frame = new JFrame("FrameDemo");

	//2. Optional: What happens when the frame closes?
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	//3. Create components and put them in the frame.
	//...create emptyLabel...

	//4. Size the frame.
	//frame.setSize(400,400);
	//frame.setTitle("Frogger");
	//frame.setLocation(300,300);
	Graphics g= frame.getGraphics();
	try {
	   image = ImageIO.read(new File("dbcity.jpg"));
	 
	} catch (IOException e) {
		
	}
	  g.drawImage(image,295,295,null);

	
	


	frame.setVisible(true);

	}

}
