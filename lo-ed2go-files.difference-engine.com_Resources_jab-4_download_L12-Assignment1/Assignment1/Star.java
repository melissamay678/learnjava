import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Graphics2D;

public class Star {
    private Dimension screenSize;
    private Color color;
    private Point location;
    private int radius;
    private int diameter;
    private Point speed;
    private Polygon basePolygon;
    private Polygon movablePolygon;
    /*
     * int N = 5
     * float angle = 72;  // 360/N
     * int[5][2] vertices;
     * 
     * for (int i = 0; i < 5; i++) {
     *     vertices[i][0] = cos( toRadians( angle * i )) * radius;
     *     vertices[i][1] = sin( toRadians( angle * i )) * radius;
     * }
     */

    public Star(Dimension screenSize) {
        this.screenSize = screenSize;
        radius = ((int)(Math.random()*15))+15;
        diameter = radius * 2;
        location = new Point(screenSize.width/2,screenSize.height/2);
        color = new Color((float)Math.random(),(float)Math.random(),(float)Math.random());
        speed = new Point(1 + ((int)(Math.random()*10)), 1 + ((int)(Math.random()*10)));
        basePolygon = new Polygon();
        movablePolygon = new Polygon();

        // build a star
        double[] x = {0.0,0.0,0.0,0.0,0.0};
        double[] y = {0.0,0.0,0.0,0.0,0.0};
        double angle = 72.0;
        int i = 0;
        while (i < 5) {
            x[i] = Math.cos( Math.toRadians( angle * i )) * radius;
            y[i] = Math.sin( Math.toRadians( angle * i )) * radius;
            i++;
        }
        basePolygon.addPoint((int)x[0],(int)y[0]);
        basePolygon.addPoint((int)x[2],(int)y[2]);
        basePolygon.addPoint((int)x[4],(int)y[4]);
        basePolygon.addPoint((int)x[1],(int)y[1]);
        basePolygon.addPoint((int)x[3],(int)y[3]);
        movablePolygon.addPoint(0,0);
        movablePolygon.addPoint(0,0);
        movablePolygon.addPoint(0,0);
        movablePolygon.addPoint(0,0);
        movablePolygon.addPoint(0,0);
    }

    public int getRadius() {
        return radius;
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
        int i = 0;
        while (i < 5) {
            movablePolygon.xpoints[i] = basePolygon.xpoints[i] + location.x;
            movablePolygon.ypoints[i] = basePolygon.ypoints[i] + location.y;
            i++;
        }
        if ( (location.x < radius) || (location.x > screenSize.width-radius) )
            speed.x = -speed.x;
        if ( (location.y < radius) || (location.y > screenSize.height-radius) )
            speed.y = -speed.y;
    }

    public void paint(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fillPolygon(movablePolygon);
    }
}