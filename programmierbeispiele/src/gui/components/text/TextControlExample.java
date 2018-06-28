package gui.components.text;

import javax.swing.*;
import java.awt.*;

public class TextControlExample {

	public static void main(String[] args) {
		// Create and set up the window.
		JFrame frame = new JFrame("Example1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2,2));

		frame.add(new JLabel("Benutzername", SwingConstants.RIGHT));
		frame.add(new JTextField());

		frame.add(new JLabel("Passwort", SwingConstants.RIGHT));
		frame.add(new JPasswordField());

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
}