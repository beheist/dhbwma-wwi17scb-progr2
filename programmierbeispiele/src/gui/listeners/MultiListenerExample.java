package gui.listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiListenerExample {

    public static void main(String[] args) {
        // Create and set up the window.
        JFrame frame = new JFrame("Button 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 gets: " + e.getActionCommand());
            }
        });

        ActionListener multiListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Multi gets: " + e.getActionCommand());
            }
        };
        btn1.addActionListener(multiListener);
        btn2.addActionListener(multiListener);

        frame.add(btn1);
        frame.add(btn2);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}