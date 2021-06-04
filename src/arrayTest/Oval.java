package arrayTest;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends Shape {

	public void paintComponant(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.fillOval(200, 200, 50, 30);
	}
}
