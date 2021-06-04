package arrayTest;
import java.awt.*;
import javax.swing.*;
public class TestShape extends JFrame {

	public static void main (String[] args){
		JFrame window = new JFrame("SHAPES");
		Shape drawshape = new Shape();
		window.setLocation(25,25 );
		window.setSize(1000, 800);
		window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		window.setVisible(true);
		window.setContentPane(drawshape);
		
	}
	
}
