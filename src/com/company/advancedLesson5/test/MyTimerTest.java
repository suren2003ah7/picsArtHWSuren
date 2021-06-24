package com.company.advancedLesson5.test;

import com.company.advancedLesson5.model.MyTimer;
import javax.swing.*;
import java.awt.*;

public class MyTimerTest {
    public static void timer(){
        JFrame frame = new JFrame("Timer");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Insert time in seconds");
        JTextField tf = new JTextField(10);
        JButton start = new JButton("start");
        JButton reset = new JButton("reset");
        panel.add(label);
        panel.add(tf);
        panel.add(start);
        panel.add(reset);

        JLabel time = new JLabel("0:00");
        time.setFont(label.getFont().deriveFont(64.0f));
        time.setHorizontalAlignment(SwingConstants.CENTER);

        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, time);

        reset.setEnabled(false);
        start.addActionListener((e) -> {
            int value = Integer.parseInt(tf.getText());
            start.setEnabled(false);
            SwingWorker worker = new SwingWorker() {
                @Override
                protected Object doInBackground() throws Exception {
                    reset.setEnabled(true);
                    MyTimer t = new MyTimer(value, time);
                    tf.setText("");
                    t.start();
                    reset.addActionListener((e) -> {
                        t.stop();
                        time.setText("0:00");
                    });
                    t.join();
                    return null;
                }
                @Override
                protected void done() {
                    start.setEnabled(true);
                    reset.setEnabled(false);
                }
            };
            worker.execute();
        });

        frame.setVisible(true);
    }
}
