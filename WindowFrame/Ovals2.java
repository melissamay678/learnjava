import java.awt.*;
import java.applet.*;
/*
<applet code="Ovals2" width=300 height=200>
</applet>
*/
public class Ovals2 extends Applet 
{
	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.green);
	}

	public void paint(Graphics g) 
	{
		g.drawOval(10, 10, 50, 50);
		g.fillOval(100, 10, 75, 50);
		g.drawOval(190, 10, 90, 30);
		g.fillOval(70, 90, 140, 100);
	}
}
