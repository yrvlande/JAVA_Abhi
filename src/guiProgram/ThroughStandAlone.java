package guiProgram;

import javax.swing.*;

public class ThroughStandAlone extends JFrame{
	
	public static void main (String[] args){
		
		JFrame standAloneApp = new JFrame("Stand Alone App");
		CommonHelloWorld  content1 = new CommonHelloWorld();
		standAloneApp.setContentPane(content1);
		
		standAloneApp.setSize(1000, 800);
		standAloneApp.setLocation(25, 25);
		standAloneApp.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		standAloneApp.setVisible(true);

	}
	
}
