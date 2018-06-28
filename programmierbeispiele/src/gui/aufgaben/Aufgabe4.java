package gui.aufgaben;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe4 {

    public static void main(String[] args) {
        // Create and set up the window.
        JFrame frame = new JFrame("Button 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2));

        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JEditorPane pane1 = new JEditorPane();
        pane1.setPreferredSize(new Dimension(400, 400));
        JEditorPane pane2 = new JEditorPane();
        pane2.setPreferredSize(new Dimension(400, 400));
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String line = "\r\n" + Long.toString(e.getWhen()) + ": " + e.getActionCommand();
                Aufgabe4.appendLine(pane1, line);
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String line = "\r\n" + Long.toString(e.getWhen()) + ": " + e.getActionCommand();
                Aufgabe4.appendLine(pane1, line);
                Aufgabe4.appendLine(pane2, line);
            }
        });

        frame.add(btn1);
        frame.add(btn2);
        frame.add(pane1);
        frame.add(pane2);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void appendLine(JTextComponent comp, String line) {
        Document doc = comp.getDocument();
        try {
            doc.insertString(doc.getLength(), line, null);
        } catch (BadLocationException ex) {
            //swallow
        }
    }
}