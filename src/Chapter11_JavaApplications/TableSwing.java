package Chapter11_JavaApplications;

import javax.swing.*;
import java.awt.*;

public class TableSwing {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);

        // Data and Column Names
        String[] columnNames = {"ID", "Name", "Age", "Gender"};
        Object[][] data = {
                {"1", "Ram", 24, "M"},
                {"2", "Hari", 30, "M"},
                {"3", "Sita", 28, "F"},
                {"4", "Ankit", 22, "M"}
        };

        // Create table
        JTable table = new JTable(data, columnNames);

        // Put the table inside a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Show frame
        frame.setVisible(true);

    }

}