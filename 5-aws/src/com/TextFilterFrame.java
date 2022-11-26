package com;

import java.awt.*;
import java.awt.event.*;

public class TextFilterFrame extends Frame implements ActionListener {
    TextField text1 = new TextField();
    Button btn = new Button("Filter");
    TextArea textA = new TextArea("Egy ketto harom egy ketto egy negy ot hat het nyolc");
    Panel p1 = new Panel();

    public TextFilterFrame() {
        super();

        setTitle("Text Filter Frame");
        setBounds(100, 270, 400, 300);
        setLayout(new FlowLayout());

        //p1.setLayout(new GridLayout(1,2));

        text1.setColumns(40);
        textA.setColumns(40);
        textA.setRows(10);

        btn.addActionListener(this);

        add(text1);
        add(btn);
        add(textA);

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
        if(obj == btn){
            String text = textA.getSelectedText();
            String filter = text1.getText();

            textA.replaceRange(text, 0, textA.getText().length());


            int s = textA.getText().indexOf(filter);
            while(s>=0) {
                if (filter.length() > 0) {
                    textA.replaceRange("", s, s + filter.length());
                }
                s = textA.getText().indexOf(filter);
            }

            System.out.println("Done");
        }
    }
}