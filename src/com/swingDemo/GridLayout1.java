package com.swingDemo;

import javax.swing.*;
import java.awt.*;

import static com.net.mindview.util.SwingConsole.run;

/**
 * Created by kaustavc on 3/17/2015.
 * Demonstrates GridLayout
 */
public class GridLayout1 extends JFrame {
    public GridLayout1() {
        setLayout(new GridLayout(7, 3));
        for (int i = 0; i < 20; i++) {
            add(new JButton("Button " + i));
        }
    }

    public static void main(String[] args) {
        run(new GridLayout1(), 300, 300);
    }
}
