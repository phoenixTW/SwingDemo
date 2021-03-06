package com.swingDemo;
import static com.net.mindview.util.SwingConsole.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kaustavc on 3/17/2015.
 * Event Listner for buttons
 */
public class Button2 extends JFrame {
    private JButton
            b1 = new JButton("Button 1"),
            b2 = new JButton("Button 2");
    private JTextField txt = new JTextField(10);

    class ButtonListener implements ActionListener {
      public void actionPerformed (ActionEvent e) {
          String name = ((JButton)e.getSource()).getText();
          txt.setText(name);
      }
    }

    private ButtonListener bl = new ButtonListener();
    public Button2() {
        b1.addActionListener(bl);
        b2.addActionListener(bl);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(txt);
    }

    public static void main(String[] args) {
        run(new Button2(), 200, 150);
    }
}
