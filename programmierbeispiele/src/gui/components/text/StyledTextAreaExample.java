package gui.components.text;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class StyledTextAreaExample {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// Create and set up the window.
		JFrame frame = new JFrame("Example1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JEditorPane jep = new JEditorPane(new URL("http://www.dhbw-mannheim.de/"));
		jep.setPreferredSize(new Dimension(1280, 720));
		frame.add(jep);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
}