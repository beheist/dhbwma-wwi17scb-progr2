package gui.components.images;

import javax.swing.*;

public class ImageExample1 {

	public static void main(String[] args) {
		// Create and set up the window.
		JFrame frame = new JFrame("Example1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icon = new ImageIcon(
				"/Users/bastian/Pictures/sunglasses.png", 
				"Sonnenbrillen-Emoji");
		
		// We cannot add an ImageIcon directly to a Frame, so we need a JLabel as proxy.
		frame.add(new JLabel(icon, SwingConstants.CENTER));

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
}