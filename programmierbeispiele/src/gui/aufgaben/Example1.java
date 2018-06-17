package gui.aufgaben;

import javax.swing.*;
import java.awt.*;

public class Example1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Multiple Labels!");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Füge ein "Hello World" zum ContentPane hinzu
        JLabel label = new JLabel("This one is green!");
        label.setForeground(new Color(0x00ff00));
        label.setBackground(new Color(0x000000));
        label.setOpaque(true);
        frame.add(label);

        // Zeige das Fenster an.
        frame.pack();
        frame.setVisible(true);
    }
}

