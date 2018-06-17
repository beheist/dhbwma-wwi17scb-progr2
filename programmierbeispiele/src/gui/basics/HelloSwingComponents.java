package gui.basics;

import javax.swing.*;

public class HelloSwingComponents {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Komponenten hinzufügen");

        JLabel label = new JLabel("Hello World");
        // JFrame.add leitet an ContentPane weiter
        // frame.getContentPane().add(label);
        frame.add(label);

        // Zweites Label hinzufügen
        frame.add(new JLabel("Zweites Label!"));

        // Erstes Label wieder entfernen
        frame.remove(label);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Zeige das Fenster an.
        frame.pack();
        frame.setVisible(true);
    }
}

