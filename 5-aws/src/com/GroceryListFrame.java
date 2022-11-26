package com;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GroceryListFrame extends Frame implements ActionListener {
    List fruits = new List();
    List veggies = new List();
    Button left = new Button("<");
    Button right = new Button(">");

    Panel panel = new Panel();

    public GroceryListFrame(){
        setTitle("Grocery List Frame");
        setBounds(100, 600, 600, 200);

        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Kiwi");
        fruits.setMultipleMode(true);

        veggies.add("Onion");
        veggies.add("Carrot");
        veggies.add("Potato");
        veggies.add("Broccoli");
        veggies.setMultipleMode(true);

        left.addActionListener(this);
        right.addActionListener(this);

        panel.add(fruits);
        panel.add(left);
        panel.add(right);
        panel.add(veggies);

        add(panel);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                dispose();
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == left) {
            String[] getSelected = veggies.getSelectedItems();
            for(String tmp : getSelected) {
                fruits.add(tmp);
                veggies.remove(tmp);
            }
        }
        if(obj == right) {
            String[] getSelected = fruits.getSelectedItems();
            for(String tmp : getSelected) {
                veggies.add(tmp);
                fruits.remove(tmp);
            }
        }
    }
}
