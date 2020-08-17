import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DrawingWindow4 extends JFrame {
    
    public DrawingWindow4() {
        setTitle("Drawing Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new MyBasicArt());
        
        setSize(800, 500); //width, height
        setLocationRelativeTo(null); //centers window in display screen
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DrawingWindow4 dw4 = new DrawingWindow4();
                dw4.setVisible(true);
            }
        });
    }
}