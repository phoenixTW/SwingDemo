package com.swingDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import static com.net.mindview.util.SwingConsole.run;

/**
 * Created by kaustavc on 3/17/2015.
 * Add and clear data from a text field.
 * Let to set user data also
 */
public class TextArea extends JFrame {
    private JButton
            b = new JButton("Add Data"),
            c = new JButton("Clear Data");
    private JTextArea t = new JTextArea(20, 40);
    private Map<String, String> m = new HashMap<String, String>();

    public TextArea() {
        //Use all the data
        m.putAll(Countries.capitals());
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(Map.Entry me : m.entrySet()) {
                    t.append(me.getKey() + ": " + me.getValue() + "\n");
                }
            }
        });

        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("");
            }
        });

        setLayout(new FlowLayout());
        add(new JScrollPane(t));
        add(b);
        add(c);
    }

    public static void main(String[] args) {
        run(new TextArea(), 475, 425);
    }

}
