package gui.components.text;

import javax.swing.*;
import java.awt.*;

public class TextAreaExample {

	public static void main(String[] args) {
		// Create and set up the window.
		JFrame frame = new JFrame("Example1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		frame.add(new JLabel("Ihre Nachricht:"), BorderLayout.PAGE_START);
		JTextArea ta = new JTextArea("Schreiben Sie uns...");
		ta.setPreferredSize(new Dimension(800, 400));
		frame.add(ta, BorderLayout.CENTER);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
}