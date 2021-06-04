package arrayTest;
import java.awt.*;
import javax.swing.*;
public class Rectangle extends Shape{

	public void paintComponant(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(100, 100, 50, 30);
	}
	
	
}
