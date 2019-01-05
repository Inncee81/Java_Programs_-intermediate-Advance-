package DANISH_058;
import java.awt.*;
import java.applet.*;
public class applet_house extends Applet {
	public void paint(Graphics g) {
		g.drawLine(100,400,500,100);
		g.drawLine(500,100,900,400);
		g.drawLine(100,400,200,400);
		g.drawLine(800,400,900,400);
		g.drawLine(200,400,500,190);
		g.drawLine(500,190,800,400);
		
		g.drawLine(200,400,200,755);
		g.drawLine(200,755,800,755);
		g.drawLine(800,400,800,755);
		
		g.drawRect(500, 450, 200, 305);
		g.drawRect(520, 470, 160, 285);
		g.drawOval(633, 590, 40, 40);
		
		g.drawRect(300,400,120,200);
		g.drawRect(310,410,100,180);
	}

}
