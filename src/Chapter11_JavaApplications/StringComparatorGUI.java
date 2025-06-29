package Chapter11_JavaApplications;

import javax.swing.*;
import java.awt.event.*;

public class StringComparatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("String Length Comparator");

        JLabel label1 = new JLabel("Enter First String:");
        label1.setBounds(30, 30, 150, 20);
        JTextField text1 = new JTextField();
        text1.setBounds(180, 30, 150, 20);

        JLabel label2 = new JLabel("Enter Second String:");
        label2.setBounds(30, 60, 150, 20);
        JTextField text2 = new JTextField();
        text2.setBounds(180, 60, 150, 20);

        JCheckBox checkBox = new JCheckBox("Case-Sensitive");
        checkBox.setBounds(30, 90, 150, 20);

        JButton compareButton = new JButton("Compare");
        compareButton.setBounds(30, 120, 100, 30);

        JLabel result = new JLabel("Result:");
        result.setBounds(30, 160, 300, 20);

        compareButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1 = text1.getText();
                String s2 = text2.getText();

                if (!checkBox.isSelected()) {
                    s1 = s1.toLowerCase();
                    s2 = s2.toLowerCase();
                }

                if (s1.length() > s2.length())
                    result.setText("Result: First string is longer.");
                else if (s2.length() > s1.length())
                    result.setText("Result: Second string is longer.");
                else
                    result.setText("Result: Both strings are of equal length.");
            }
        });

        frame.add(label1); frame.add(text1);
        frame.add(label2); frame.add(text2);
        frame.add(checkBox); frame.add(compareButton);
        frame.add(result);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}