package guiProgram;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * Requirement of Programe: 1. Need to display 25 messages of string Java!
 * 2. 	They should be at Random Position
 * 3.	They should be having different size.
 * 4.	They should be having different fonts
 * 5.	The message should get cropped at some position
 * @author Yashwant.Lande
 *
 */

public class Assignment1 extends JPanel {

	MessageDisplay displayMessage;
	
	public class MessageDisplay extends JPanel{
		public void paintComponent (Graphics g){
			 super.paintComponents(g);
			
			
			 int width = getWidth();
		     int height = getHeight();
			 System.out.println(width + "And " +height);
			 Font font1 = new Font("Serif", Font.BOLD, 14);
			 Font font2 = new Font("SansSerif", Font.BOLD + Font.ITALIC, 24);
			 Font font3 = new Font("Monospaced", Font.PLAIN, 30);
			 Font font4 = new Font("Dialog", Font.PLAIN, 36);
			 Font font5 = new Font("Serif", Font.ITALIC, 48);
		//	for(int i = 0; i<=25 ; i++){	
		    
            int setFont;
		    setFont = (1 + (int)(Math.random()*5));
			switch(setFont){
				 case 1:
					 g.setFont(font1);
					 break;
				 case 2:
					 g.setFont(font2);
					 break;
				 case 3:
					 g.setFont(font3);
					 break;
				 case 4:
					 g.setFont(font4);
					 break;
				 case 5:
					 g.setFont(font5);
					 break;
				 }
				 
			float hue = (float)Math.random();
	        g.setColor( Color.getHSBColor(hue, 1.0F, 1.0F) );
            int x,y;
		    x = -50 + (int)(Math.random()*(width+40));
		    y = (int)(Math.random()*(height+20));
		 
		    g.drawString("Java!", x,y);
		    
		//	}                 				
			
			
		}
		
}
	
	
	public Assignment1(){
		displayMessage = new MessageDisplay();
		setLayout(new BorderLayout());
		add(displayMessage,BorderLayout.CENTER);
		
	}

}
