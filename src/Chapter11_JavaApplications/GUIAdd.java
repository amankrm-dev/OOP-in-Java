package Chapter11_JavaApplications;

import javax.swing.*;

public class GUIAdd {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //creating
        JPanel jp = new JPanel();
        JLabel label = new JLabel("Enter your name:");
        JTextField field = new JTextField(10);
        JButton button = new JButton("Submit");
        button.addActionListener(e -> {
            String name = field.getText();
            JOptionPane.showMessageDialog(jf, "Hello " + name+" ");
        });

        //adding all
        jp.add(label);
        jp.add(field);
        jp.add(button);
        jf.add(jp);
        jf.setSize(300, 200);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
