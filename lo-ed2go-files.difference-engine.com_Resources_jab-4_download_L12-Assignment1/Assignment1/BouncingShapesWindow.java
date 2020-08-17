import javax.swing.*;
/**
 * BouncingBallsWindow is the top level of three that produce a window with
 * ten animated bouncing balls in it.
 * 
 * @author Merrill Hall 
 * @version 1
 */
public class BouncingShapesWindow extends JFrame {
    public BouncingShapesWindow() { // Create window
        setTitle("Ten Bouncing Balls");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new BouncingShapes()); // Add bouncing balls panel

        pack();
        setLocationRelativeTo(null); // Center window in display screen
    }

    public static void main(String[] args) {
        // Run GUI in the Event Dispatcher Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    // Set up main window (using Swing's Jframe)
                    BouncingShapesWindow bbw = new BouncingShapesWindow();
                    bbw.setVisible(true);
                }
            });
    }
}