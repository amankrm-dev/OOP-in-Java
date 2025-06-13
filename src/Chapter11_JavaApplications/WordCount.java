package Chapter11_JavaApplications;

import javax.swing.*;
import java.awt.*;

public class WordCount {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Word Counter");
        frame.setSize(500, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new BorderLayout(10, 10));

        JPanel topPanel = new JPanel(new BorderLayout(5, 5));
        JLabel textLabel = new JLabel("TEXT:");
        JTextArea textArea = new JTextArea(10, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton countButton = new JButton("count box");

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel resultLabel = new JLabel("word count: 0");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));

        countButton.addActionListener(_ -> {
            String text = textArea.getText();
            int wordCount = 0;

            if (!text.trim().isEmpty()) {
                String[] words = text.trim().split("\\s+");
                wordCount = words.length;
            }

            resultLabel.setText("word count: " + wordCount);
        });

        topPanel.add(textLabel, BorderLayout.NORTH);
        topPanel.add(scrollPane, BorderLayout.CENTER);

        centerPanel.add(countButton);

        bottomPanel.add(resultLabel);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        ((JPanel)frame.getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        frame.setVisible(true);
    }
}