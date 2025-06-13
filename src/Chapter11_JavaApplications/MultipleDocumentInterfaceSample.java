package Chapter11_JavaApplications;

import javax.swing.*;

public class MultipleDocumentInterfaceSample {
    public static void main(String[] args) {

        // Main frame
        JFrame frame = new JFrame("MDI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Desktop pane to hold internal frames
        JDesktopPane desktopPane = new JDesktopPane();

        // Create internal frame 1
        JInternalFrame internalFrame1 = new JInternalFrame("Document 1", true, true, true, true);
        internalFrame1.setSize(300, 200);
        internalFrame1.setVisible(true);
        desktopPane.add(internalFrame1);

        // Create internal frame 2
        JInternalFrame internalFrame2 = new JInternalFrame("Document 2", true, true, true, true);
        internalFrame2.setSize(300, 200);
        internalFrame2.setLocation(50, 50);
        internalFrame2.setVisible(true);
        desktopPane.add(internalFrame2);

        // Add desktop pane to frame
        frame.add(desktopPane);

        // Show main frame
        frame.setVisible(true);
    }

}