import java.awt.*;
import javax.swing.*;

/**
 * DrawingWindow is the top level of three that produce a window with
 * a house and a setting and rising sun.
 * 
 * @author Merrill Hall 
 * @version 1
 */

public class DrawingWindow extends JFrame {
    private static final Dimension SIZE = new Dimension(400,400);

    public DrawingWindow() {
        setTitle("Setting/Rising Sun");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new SunriseSunset(SIZE));

        setSize(SIZE);
        setLocationRelativeTo(null); // centers window in display screen
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    DrawingWindow dw = new DrawingWindow();
                    dw.setVisible(true);
                }
            });
    }
}