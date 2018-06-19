package gui.layouts;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Flow Layout!");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Füge ein "Hello World" zum ContentPane hinzu
        JLabel label = new JLabel("Hello World");
        frame.add(label);
        JLabel label2 = new JLabel("Hello World 2");
        frame.add(label2);

        // Zeige das Fenster an.
        frame.pack();
        frame.setVisible(true);
    }
}

