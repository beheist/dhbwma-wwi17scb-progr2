package gui.aufgaben;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe5 {

    private static Aufgabe5MainPanel mainPanel;

    public static void main(String[] args) {
        // Create and set up the window.
        JFrame frame = new JFrame("Text Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new Aufgabe5MainPanel();
        frame.add(mainPanel);

        buildMenu(frame);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    private static void buildMenu(JFrame frame) {
        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("Menü");
        JMenuItem item1 = new JMenuItem("Text leeren");
        menu.add(item1);
        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainPanel.displayEventInfo(e.getActionCommand());
                mainPanel.emptyTextArea();
            }
        });
        JMenuItem item2 = new JMenuItem("Dummytext setzen");
        menu.add(item2);
        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainPanel.displayEventInfo(e.getActionCommand());
                mainPanel.createDummyText();
            }
        });
        menu.addSeparator();
        JMenuItem item3 = new JMenuItem("Beenden");
        menu.add(item3);
        item3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
    }
}