import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;

class MyBasicArt extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(new Color(13,40,145));
        g2d.fillRect(0, 0, getWidth(), getHeight());
        
        // draw mountain 1
        Polygon p = new Polygon();
        p.addPoint(140,100);
        p.addPoint(25,425);
        p.addPoint(375,425);
        g2d.setColor(new Color(42,87,3));
        g2d.fillPolygon(p);
        
        // draw mountain 2
        Polygon p2 = new Polygon();
        p2.addPoint(375,75);
        p2.addPoint(225,425);
        p2.addPoint(600,425);
        g2d.setColor(new Color(31,77,5));
        g2d.fillPolygon(p2);
        
        // draw mountain 3
        Polygon p3 = new Polygon();
        p3.addPoint(575,30);
        p3.addPoint(350,425);
        p3.addPoint(775,425);
        g2d.setColor(new Color(42,87,3));
        g2d.fillPolygon(p3);
        
        // draw the moon
        g2d.setColor(new Color(249,250,245));
        g2d.fillOval(210, 40, 120, 120);
        
        // draw ground
        g2d.setColor(new Color(56,52,54));
        g2d.fillRect(0, 400, getWidth(), getHeight()-400);
    }
}