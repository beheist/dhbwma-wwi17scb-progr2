package gui.layouts;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Grid Layout!");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 2*2 Gitter
        frame.setLayout(new GridLayout(2,2));

        frame.add(new JLabel("Hello World"));
        frame.add(new JLabel("Grid 2"));
        frame.add(new JLabel("Nochn Grid-Item"));
        frame.add(new JLabel("Weiteres Grid"));

        // Zeige das Fenster an.
        frame.pack();
        frame.setVisible(true);
    }
}

