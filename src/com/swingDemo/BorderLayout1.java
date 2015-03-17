package com.swingDemo;

import javax.swing.*;
import java.awt.*;

import static com.net.mindview.util.SwingConsole.run;

/**
 * Created by kaustavc on 3/17/2015.
 * Create Borders in different ends
 */
public class BorderLayout1 extends JFrame {
    public BorderLayout1() {
        add(BorderLayout.NORTH, new JButton("NORTH"));
        add(BorderLayout.SOUTH, new JButton("SOUTH"));
        add(BorderLayout.EAST, new JButton("EAST"));
        add(BorderLayout.WEST, new JButton("WEST"));
        add(BorderLayout.CENTER, new JButton("CENTER"));
    }

    public static void main(String[] args) {
        run(new BorderLayout1(), 300, 250);
    }
}
