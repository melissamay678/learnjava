import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;

class DrawingArt extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // draw a light blue sky
        g2d.setColor(Color.cyan);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        
        // draw green grass
        g2d.setColor(Color.green);
        g2d.fillRect(0, 300, getWidth(), getHeight()-300);

        // draw the red wall
        g2d.setColor(Color.red);
        g2d.fillRect(100, 200, 150, 150);
        
        // draw the window
        g2d.setColor(Color.black);
        g2d.fillRect(120, 220, 35, 35);
        
        // draw the door
        g2d.setColor(Color.blue);
        g2d.fillRect(175, 275, 50, 75);

        // draw the sun
        g2d.setColor(Color.yellow);
        g2d.fillOval(275, 50, 75, 75);

        // draw the doorknob
        g2d.setColor(Color.yellow);
        g2d.fillOval(180, 310, 5, 5);
        
        // draw the roof
        Polygon p = new Polygon();
        p.addPoint(75,200);
        p.addPoint(175,125);
        p.addPoint(275,200);
        g2d.setColor(new Color(145,97,13));
        g2d.fillPolygon(p);
    }
}