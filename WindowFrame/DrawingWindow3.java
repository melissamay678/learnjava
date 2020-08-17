import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DrawingWindow3 extends JFrame {

    public DrawingWindow3() {
        setTitle("Drawing Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new DrawingArt());

        setSize(400, 300);
        setLocationRelativeTo(null); // centers window in display screen
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    DrawingWindow3 dw3 = new DrawingWindow3();
                    dw3.setVisible(true);
                }
            });
    }
}