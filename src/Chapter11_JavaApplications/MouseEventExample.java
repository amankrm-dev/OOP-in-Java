package Chapter11_JavaApplications;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event Example");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel("Move or click the mouse here");
        frame.add(label);

        // Add mouse listener
        frame.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mousePressed(MouseEvent e) {
                label.setText("Mouse Pressed");
            }

            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Released");
            }

            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered the Frame");
            }

            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited the Frame");
            }
        });

        // Add mouse motion listener
        frame.addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {
                label.setText("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mouseMoved(MouseEvent e) {
                label.setText("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        frame.setVisible(true);
    }
}