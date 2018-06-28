package gui.components.images;

import java.net.URL;

import javax.swing.*;

public class ImageExample3 {

	public static void main(String[] args) {
		// Create and set up the window.
		JFrame frame = new JFrame("ImageExample3");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// URL zum Bild vom Classloader laden lassen
		URL imgURL = ImageExample3.class.getResource("koala.png");
		ImageIcon icon = new ImageIcon(imgURL, "Koala!");
		
		// We cannot add an ImageIcon directly to a Frame, so we need a JLabel as proxy.
		frame.add(new JLabel(icon, SwingConstants.CENTER));

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
}