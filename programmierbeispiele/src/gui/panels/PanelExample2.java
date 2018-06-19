package gui.panels;

import javax.swing.*;
import java.awt.*;

public class PanelExample2 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Using two panels");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.add(new JLabel("links"));
        panel2.add(new JLabel("rechts"));

        frame.add(panel1, BorderLayout.LINE_START);
        frame.add(panel2, BorderLayout.LINE_END);

        // Zeige das Fenster an.
        frame.pack();
        frame.setVisible(true);
    }
}

