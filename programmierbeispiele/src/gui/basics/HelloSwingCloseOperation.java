package gui.basics;

import javax.swing.*;

public class HelloSwingCloseOperation {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello World 2 mit Swing!");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Füge ein "Hello World" zum ContentPane hinzu
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        // Zeige das Fenster an.
        frame.pack();
        frame.setVisible(true);
    }
}

