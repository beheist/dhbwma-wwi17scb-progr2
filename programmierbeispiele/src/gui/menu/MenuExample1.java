package gui.menu;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample1 {

    public static void main(String[] args) {
        // Create and set up the window.
        JFrame frame = new JFrame("Button 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2));

        // Put something in the main window
        JLabel text = new JLabel("foo");
        text.setPreferredSize(new Dimension(400, 200));
        frame.add(text);

        // Build the menu
        JMenuBar menuBar = new JMenuBar();

        //Build the first menu.
        JMenu menu = new JMenu("A Menu");
        menuBar.add(menu);

        //a group of JMenuItems
        menu.add(new JMenuItem("A text-only menu item"));
        menu.add(new JMenuItem("Another Menu Item"));
        menu.addSeparator();
        menu.add(new JMenuItem("Third Menu Item"));

        frame.setJMenuBar(menuBar);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}