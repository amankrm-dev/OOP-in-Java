package Chapter11_JavaApplications;

import javax.swing.*;
import java.awt.*;

public class Prac {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("GUI Practice");
        ImageIcon image=new ImageIcon("src/Chapter11_JavaApplications/logo.png");
        frame.setIconImage(image.getImage());
        frame.setSize(420,420);
        frame.getContentPane().setBackground(Color.GREEN);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
