package Chapter11_JavaApplications;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class RegistrationForm {
    /**
     * This is a simple registration form application using Java Swing.
     * It collects user information such as name, address
     **/
    public static void main(String[] args) {
        String[] dates = { "1", "2", "3", "4", "5",
                "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30",
                "31" };
        String[] months
                = { "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec" };

        String[] years
                = { "1995", "1996", "1997", "1998",
                "1999", "2000", "2001", "2002",
                "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010",
                "2011", "2012", "2013", "2014",
                "2015", "2016", "2017", "2018",
                "2019" };

        JFrame jf = new JFrame();
        jf.setTitle("Registration Form");
        jf.setSize(400, 400);
        jf.setLayout(new BorderLayout());

        JPanel jp = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        jp.add(new JLabel("Name: "), gbc);
        gbc.gridx = 1;
        JTextField nameField = new JTextField(15);
        jp.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        jp.add(new JLabel("Address: "), gbc);
        gbc.gridx = 1;
        JTextField addressField = new JTextField(15);
        jp.add(addressField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        jp.add(new JLabel("Gender: "), gbc);
        gbc.gridx = 1;
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JRadioButton Male = new JRadioButton("Male");
        JRadioButton Female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(Male);
        genderGroup.add(Female);
        genderPanel.add(Male);
        genderPanel.add(Female);
        jp.add(genderPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        jp.add(new JLabel("DOB: "), gbc);
        gbc.gridx = 1;
        JPanel dobPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JComboBox<String> dateBox = new JComboBox<>(dates);
        JComboBox<String> monthBox = new JComboBox<>(months);
        JComboBox<String> yearBox = new JComboBox<>(years);
        dobPanel.add(dateBox);
        dobPanel.add(monthBox);
        dobPanel.add(yearBox);
        jp.add(dobPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        JCheckBox check = new JCheckBox("Please accept the terms and policy");
        jp.add(check, gbc);

        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton button = new JButton("SUBMIT");
        jp.add(button, gbc);

        jf.add(jp, BorderLayout.CENTER);

        // Action Listener for SUBMIT button
        button.addActionListener(_ -> {
            if (!check.isSelected()) {
                JOptionPane.showMessageDialog(jf, "You must accept the terms and policy to proceed.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String name = nameField.getText();
            String address = addressField.getText();
            String gender = Male.isSelected() ? "Male" : (Female.isSelected() ? "Female" : "Not specified");
            String dob = dateBox.getSelectedItem() + "-" + monthBox.getSelectedItem() + "-" + yearBox.getSelectedItem();

            String output = "Name: " + name + "\nAddress: " + address + "\nGender: " + gender + "\nDOB: " + dob + "\n";

            // Write to file
            try {
                String filePath = "C:\\Users\\kumar\\IdeaProjects\\OOP in Java\\src\\Chapter11_JavaApplications\\registration_output.txt";
                try (FileWriter fw = new FileWriter(filePath, true)) {
                    fw.write(output + "---------------------\n");
                    JOptionPane.showMessageDialog(jf, "Registration Successful!\nData saved to file.");
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(jf, "Error saving to file: " + ex.getMessage());
            }
        });

        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}