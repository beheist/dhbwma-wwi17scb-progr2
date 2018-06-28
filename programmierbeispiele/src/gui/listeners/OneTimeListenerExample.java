package gui.listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OneTimeListenerExample {

    public static void main(String[] args) {
        // Create and set up the window.
        JFrame frame = new JFrame("Button 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton btn1 = new JButton("Dieser Button tut nur einmal was!");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("This only happens once.");
                JButton source = (JButton) e.getSource();
                source.removeActionListener(this);
            }
        });

        frame.add(btn1);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}