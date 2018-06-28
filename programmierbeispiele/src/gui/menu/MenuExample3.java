package gui.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample3 {

    public static void main(String[] args) {
        // Create and set up the window.
        JFrame frame = new JFrame("Button 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2));

        // Put something in the main window
        JLabel someLabel = new JLabel("foo");
        someLabel.setPreferredSize(new Dimension(200, 400));
        frame.add(someLabel);

        // Build the menu bar
        JMenuBar menuBar = new JMenuBar();

        //Build the first menu.
        JMenu menu = new JMenu("A Menu");
        menuBar.add(menu);

        //an item with an action listener
        JMenuItem item1 = new JMenuItem("A text-only menu item");
        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                someLabel.setText(Long.toString(e.getWhen()));
            }
        });
        menu.add(item1);

        // Set it on the frame
        frame.setJMenuBar(menuBar);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}