package HomeWork_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java1_HomeWork8 extends JFrame {
    private int value;
    private int memoryValue;

    public Java1_HomeWork8(int initialValue) {
        setBounds(500, 500, 300, 240);
        setTitle("Java 1 Homework 8 Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);

        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;

                counterValueView.setText(String.valueOf(value));
            }
        });

        incrementButton.addActionListener(e -> {
            value++;

            counterValueView.setText(String.valueOf(value));
        });

        JButton resetButton = new JButton("C");
        resetButton.setFont(font);
        add(resetButton, BorderLayout.SOUTH);

        JButton memoryButton = new JButton("M");
        memoryButton.setFont(font);
        add(memoryButton, BorderLayout.NORTH);

        resetButton.addActionListener(e -> {
            value = 0;

            counterValueView.setText(String.valueOf(value));
        });

        memoryButton.addActionListener(new ActionListener() {
            boolean fToMemory = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!fToMemory)
                    value = memoryValue;
                else
                    memoryValue = value;

                fToMemory = !fToMemory;

                counterValueView.setText(String.valueOf(value));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Java1_HomeWork8(0);
    }
}
