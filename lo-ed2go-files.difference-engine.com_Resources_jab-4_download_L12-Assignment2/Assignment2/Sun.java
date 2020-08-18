import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Graphics2D;

public class Sun {
    private int startingHeight;
    private int horizonHeight;
    private Color color;
    private Point location;
    private int radius;
    private int diameter;
    private Point speed;

    public Sun(int startingHeight, int horizonHeight) {
        this.startingHeight = startingHeight;
        this.horizonHeight = horizonHeight;
        radius = 38;
        diameter = radius * 2;
        location = new Point(275,startingHeight);
        color = Color.yellow;
        speed = new Point(0, 1);
    }

    public int getDiameter() {
        return diameter;
    }

    public Color getColor() {
        return color;
    }

    public Point getLocation() {
        return location;
    }

    public Point getSpeed() {
        return speed;
    }
    
    public void move() {
        location.setLocation(location.x+speed.x,location.y+speed.y);
        if ( (location.y < 0) || (location.y > horizonHeight) )
            speed.y = -speed.y;
    }

    public void paint(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fillOval(location.x, location.y, diameter, diameter);
    }
}