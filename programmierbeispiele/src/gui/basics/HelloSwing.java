package gui.basics;

import javax.swing.*;
import java.awt.*;

public class HelloSwing {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello World mit Swing!");

        // Füge ein "Hello World" zum ContentPane hinzu
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        // Zeige das Fenster an.
        frame.pack();
        frame.setVisible(true);
    }
}

