package Chapter11_JavaApplications;

import javax.swing.*;

public class GUITest{
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //creating
        JPanel jp = new JPanel();
        JLabel label = new JLabel("Enter two numbers");
        JTextField field1 = new JTextField(10);
        JTextField field2 = new JTextField(10);
        JCheckBox checkboxM= new JCheckBox("Male");
        JCheckBox checkboxF = new JCheckBox("Female");
        JButton button = new JButton("Submit");
        button.addActionListener(e -> {
            if(checkboxM.isSelected()){
                checkboxF.setSelected(false);
            }
           else if(checkboxF.isSelected()){
                checkboxM.setSelected(false);
            }
           try{
               Double num1= Double.parseDouble(field1.getText());
               Double num2= Double.parseDouble(field2.getText());
               Double sum= num1+num2;
               String gender=checkboxM.isSelected()?"Male":checkboxF.isSelected()?"Female":"Other";
                JOptionPane.showMessageDialog(jf,"Sum is: "+sum+"\nGender: "+gender);
           }
           catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(jf,"Please enter valid numbers");
           }

        });

        //adding all
        jp.add(label);
        jp.add(field1);
        jp.add(field2);
        jp.add(checkboxM);
        jp.add(checkboxF);
        jp.add(button);
        jf.add(jp);
        jf.setSize(400, 400);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
