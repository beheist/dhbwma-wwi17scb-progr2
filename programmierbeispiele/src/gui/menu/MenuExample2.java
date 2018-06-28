package gui.menu;

import javax.swing.*;
import java.awt.*;

public class MenuExample2 {

    public static void main(String[] args) {
        // Create and set up the window.
        JFrame frame = new JFrame("Button 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2));

        // Put something in the main window
        JLabel text = new JLabel("foo");
        text.setPreferredSize(new Dimension(400, 200));
        frame.add(text);

        // Build the menu bar
        JMenuBar menuBar = new JMenuBar();

        //Build the first menu.
        JMenu menu = new JMenu("A Menu");
        menuBar.add(menu);

        //a group of JMenuItems
        menu.add(new JMenuItem("A text-only menu item"));
        menu.addSeparator();

        // Submenu
        JMenu submenu = new JMenu("Submenu");
        submenu.add(new JMenuItem("Submenu Item 1"));
        submenu.add(new JMenuItem("Sub-Item 2"));
        menu.add(submenu);

        // Set it on the frame
        frame.setJMenuBar(menuBar);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}