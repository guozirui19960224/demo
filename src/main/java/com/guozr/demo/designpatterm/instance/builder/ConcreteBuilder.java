package com.guozr.demo.designpatterm.instance.builder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @ClassName ConcreteBuilder
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/23 11:01
 **/
public class ConcreteBuilder extends Builder implements ActionListener {

    private JFrame jFrame = new JFrame();
    private Box box = new Box(BoxLayout.Y_AXIS);

    @Override
    public void buildTitle(String title) {
        jFrame.setTitle(title);
    }

    @Override
    public void buildString(String string) {
        box.add(new JLabel(string));
    }

    @Override
    public void buildItems(String[] items) {
        Box innerBox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < items.length; i++) {
            JButton button = new JButton(items[i]);
            button.addActionListener(this);
            innerBox.add(button);
        }
        box.add(innerBox);
    }

    @Override
    public void buildDone() {
        jFrame.getContentPane().add(box);
        jFrame.pack();
        jFrame.addWindowFocusListener(new WindowAdapter() {
            /**
             * Invoked when a window is in the process of being closed.
             * The close operation can be overridden at this point.
             *
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }

    public JFrame getResult(){
        return jFrame;
    }
}
