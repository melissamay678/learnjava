import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DrawingWindow2 extends JFrame {

    public DrawingWindow2() {
        setTitle("Drawing Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new DrawingSurface2());

        setSize(400, 300);
        setLocationRelativeTo(null); // centers window in display screen
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    DrawingWindow2 dw2 = new DrawingWindow2();
                    dw2.setVisible(true);
                }
            });
    }
}