package gui.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample2 {

    public static void main(String[] args) {
        // Create and set up the window.
        JFrame frame = new JFrame("Button 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("Hallo Welt!");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Welche Tasten wurden zusätzlich gedrückt? z.B. ALT+Klick
                System.out.println(e.getModifiers());
                // Wann ist das Event passiert?
                System.out.println(e.getWhen());
                // Zusätzliche Informationen als String - hier z.B. Button-Text
                System.out.println(e.getActionCommand());
                // Welches Objekt hat das Event ausgelöst?
                JButton trigger = (JButton) e.getSource();
            }
        });
        frame.add(btn);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}