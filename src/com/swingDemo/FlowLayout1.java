package com.swingDemo;

import javax.swing.*;
import java.awt.*;

import static com.net.mindview.util.SwingConsole.run;

/**
 * Created by kaustavc on 3/17/2015.
 * Multiple buttons
 */
public class FlowLayout1 extends JFrame {
    public FlowLayout1() {
        setLayout(new FlowLayout());
        for (int i = 0; i < 20; i++) {
            add(new JButton("Button " + i));
        }
    }

    public static void main(String[] args) {
        run(new FlowLayout1(), 300, 300);
    }
}
