package gui.basics;

import javax.swing.*;

public class HelloSwingBounds {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Dieses Fenster ist 500*300 Pixel groß!");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Lege die Fenstergröße fest.
        frame.setBounds(100, 100, 1000, 500);
        frame.setSize(500, 300);

        // Füge ein "Hello World" zum ContentPane hinzu
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
        frame.getLayeredPane();
        frame.getRootPane();
        frame.getGlassPane();
        frame.getJMenuBar();

        // Zeige das Fenster an.
//        frame.pack();
        frame.setVisible(true);
    }
}

