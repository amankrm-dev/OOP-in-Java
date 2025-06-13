package Chapter11_JavaApplications;

import javax.swing.*;

public class MenuSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();

        // Menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("help");

        // Menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem About = new JMenuItem("About");
        JMenuItem exitItem = new JMenuItem("Exit");

        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        JMenuItem aboutItem = new JMenuItem("About");
        JMenuItem howItWorks = new JMenuItem("how it works");

        // Add action listener
        exitItem.addActionListener(_ -> System.exit(0));

        // Add items to menus
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(About);
        fileMenu.addSeparator(); // adds a separator line
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        helpMenu.add(aboutItem);
        helpMenu.add(howItWorks);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        About.addActionListener(_ -> JOptionPane.showMessageDialog(frame, "Hey this developer is Aman!!"));

        // Set the menu bar to the frame
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }

}