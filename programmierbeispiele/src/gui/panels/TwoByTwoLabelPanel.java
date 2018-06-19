package gui.panels;

import javax.swing.*;
import java.awt.*;

public class TwoByTwoLabelPanel extends JPanel {
    public TwoByTwoLabelPanel(String text1, String text2, String text3, String text4){
        super(new GridLayout(2,2));
        this.add(new JLabel(text1));
        this.add(new JLabel(text2));
        this.add(new JLabel(text3));
        this.add(new JLabel(text4));
    }
}
