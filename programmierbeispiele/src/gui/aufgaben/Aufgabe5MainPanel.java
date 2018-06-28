package gui.aufgaben;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Aufgabe5MainPanel extends JPanel {

    protected JButton selectAllButton;
    protected JButton copyButton;
    protected JButton cutButton;
    protected JButton pasteButton;

    protected JTextArea mainTextArea;

    protected JLabel infoLabel;
    protected JLabel characterCountLabel;
    protected JLabel characterCount;

    public Aufgabe5MainPanel() {
        this.setPreferredSize(new Dimension(1280, 720));
        this.setLayout(new BorderLayout());

        this.buildButtonBar();
        this.buildMainArea();
        this.buildInfoBar();
    }

    public void emptyTextArea() {
        mainTextArea.setText("");
    }

    public void createDummyText() {
        mainTextArea.setText("Lorem Ipsum Dolor Sit Amet");
    }

    public void displayEventInfo(String s) {
        infoLabel.setText(s);
    }

    private void buildButtonBar() {
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setPreferredSize(new Dimension(1280, 50));
        buttonPanel.setBackground(new Color(0xcccccc));
        buttonPanel.setOpaque(true);
        selectAllButton = new JButton("Select All");
        copyButton = new JButton("Copy");
        cutButton = new JButton("Cut");
        pasteButton = new JButton("Paste");
        buttonPanel.add(selectAllButton);
        buttonPanel.add(copyButton);
        buttonPanel.add(cutButton);
        buttonPanel.add(pasteButton);

        selectAllButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayEventInfo(e.getActionCommand());
                mainTextArea.grabFocus();
                mainTextArea.selectAll();
            }
        });

        copyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayEventInfo(e.getActionCommand());
                mainTextArea.copy();
            }
        });

        cutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayEventInfo(e.getActionCommand());
                mainTextArea.cut();
            }
        });

        pasteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayEventInfo(e.getActionCommand());
                mainTextArea.paste();
            }
        });

        this.add(buttonPanel, BorderLayout.PAGE_START);
    }

    private void buildMainArea() {
        mainTextArea = new JTextArea();

        mainTextArea.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                characterCount.setText(Long.toString(mainTextArea.getDocument().getLength()));
            }

            public void removeUpdate(DocumentEvent e) {
                characterCount.setText(Long.toString(mainTextArea.getDocument().getLength()));
            }

            public void changedUpdate(DocumentEvent e) {
                characterCount.setText(Long.toString(mainTextArea.getDocument().getLength()));
            }
        });

        this.add(mainTextArea);
    }

    private void buildInfoBar() {
        JPanel infoPanel = new JPanel(new GridLayout(1, 3));
        infoPanel.setPreferredSize(new Dimension(1280, 50));
        infoPanel.setBackground(new Color(0xcccccc));
        infoPanel.setOpaque(true);

        infoLabel = new JLabel("Welcome.");
        infoPanel.add(infoLabel);

        characterCountLabel = new JLabel("Anzahl Zeichen: ", SwingConstants.RIGHT);
        infoPanel.add(characterCountLabel);

        characterCount = new JLabel("0");
        infoPanel.add(characterCount);

        this.add(infoPanel, BorderLayout.PAGE_END);
    }
}