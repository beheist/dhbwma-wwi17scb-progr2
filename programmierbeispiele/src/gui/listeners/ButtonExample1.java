package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonExample1 {

	public static void main(String[] args) {
		// Create and set up the window.
		JFrame frame = new JFrame("Button 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("Hallo Welt!");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Klick!");
			}
		});
		frame.add(btn);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
}