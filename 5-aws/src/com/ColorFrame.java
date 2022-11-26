package com;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ColorFrame  extends Frame{
    public ColorFrame() {
        setTitle("Color Frame");
        setBounds(100, 50, 400, 200);

        Choice choice = new Choice();
        choice.add("Red");
        choice.add("Green");
        choice.add("Blue");
        choice.add("Random");

        setBackground(Color.RED);

        choice.setBounds(10, 10, 150, 50);

        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String in = choice.getItem(choice.getSelectedIndex());
                if(in == "Red") {
                    setBackground(Color.RED);
                } else if(in == "Green"){
                    setBackground(Color.GREEN);
                }else if(in == "Blue") {
                    setBackground(Color.BLUE);
                } else {
                    Random rand = new Random();
                    setBackground(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
                }
            }
        });

        add(choice);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                dispose();
            }
        });

        setVisible(true);
    }
}
