package gui.layouts;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Grid Layout!");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Füge ein "Hello World" zum ContentPane hinzu
        frame.add(new JLabel("Oben"), BorderLayout.PAGE_START);
        frame.add(new JLabel("Unten"), BorderLayout.PAGE_END);
        frame.add(new JLabel("Links"), BorderLayout.LINE_START);
        frame.add(new JLabel("Rechts"), BorderLayout.LINE_END);
        frame.add(new JLabel("Ich bin das tolle Element in der Mitte!"), BorderLayout.CENTER);

        // Zeige das Fenster an.
        frame.pack();
        frame.setVisible(true);
    }
}

