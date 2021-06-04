package guiProgram;
import javax.swing.*;
import java.awt.*;
public class TestAssignment1 extends JFrame {
public static void main (String[] args){
	
	Assignment1 ass1 = new Assignment1();
	JFrame j = new JFrame("Assignment1");
	j.setSize(500, 300);
	j.setLocation(25, 25);
	j.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	j.setVisible(true);
	RepaintOnClick listner = new RepaintOnClick();
	
	//for(int i = 0; i<=25 ; i++){}	
		
	
	ass1.addMouseListener(listner);
	j.setContentPane(ass1);
	

}
	
	
}
