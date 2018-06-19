package gui.panels;

import javax.swing.*;
import java.awt.*;

public class PanelExample3 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Combined Layouts");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Füge ein "Hello World" zum ContentPane hinzu
        frame.add(new JLabel("Oben", SwingConstants.CENTER), BorderLayout.PAGE_START);
        frame.add(new JLabel("Unten", SwingConstants.CENTER), BorderLayout.PAGE_END);
        frame.add(new TwoByTwoLabelPanel("Eins", "Zwei", "Drei", "Vier"), BorderLayout.CENTER);

        // Zeige das Fenster an.
        frame.pack();
        frame.setVisible(true);
    }
}

