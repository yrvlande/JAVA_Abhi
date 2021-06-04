package guiProgram;
import guiProgram.Assignment2;
import javax.swing.*;
import java.awt.*;
public class TestAssignment2 extends JFrame{
    public static void main (String [] args){ 
	JFrame frame = new JFrame("Assignment2");
	frame.setSize(1000, 800);
	frame.setLocation(25, 25);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    Assignment2 ass2 = new Assignment2();
    frame.setContentPane(ass2);
    
    ass2.addMouseListener(ass2.repaint);
    }
}
