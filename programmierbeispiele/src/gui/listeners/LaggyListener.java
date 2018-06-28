package gui.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaggyListener {

    public static void main(String[] args) {
        // Create and set up the window.
        JFrame frame = new JFrame("Button 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("Hallo Welt!");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    // swallow
                }
                System.out.println("Foo");
            }
        });
        frame.add(btn);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}