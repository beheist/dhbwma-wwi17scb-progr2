package gui.components;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/*
 * Example1.java needs one other file:
 *   gui.gui.gui/middle.gif
 */
public class LabelWithImages extends JPanel {
    public LabelWithImages() {
        super(new GridLayout(3, 1));  //3 rows, 1 column
        JLabel label1, label2, label3;

        ImageIcon icon = createImageIcon("sunglasses.png", "Sunglasses");

        //Create the first label.
        label1 = new JLabel("Image and Text",
                icon,
                JLabel.CENTER);
        //Set the position of its text, relative to its icon:
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label1.setHorizontalTextPosition(JLabel.CENTER);

        //Create the other labels.
        label2 = new JLabel("Text-Only Label");
        label3 = new JLabel(icon);

        //Create tool tips, for the heck of it.
        label1.setToolTipText("A label containing both image and text");
        label2.setToolTipText("A label containing only text");
        label3.setToolTipText("A label containing only an image");

        //Add the labels.
        add(label1);
        add(label2);
        add(label3);
    }

    /**
     * Returns an ImageIcon, or null if the path was invalid.
     */
    protected static ImageIcon createImageIcon(String path,
                                               String description) {
        URL imgURL = LabelWithImages.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    public static void main(String[] args) {
        //Create and set up the window.
        JFrame frame = new JFrame("Example1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add content to the window.
        frame.add(new LabelWithImages());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}