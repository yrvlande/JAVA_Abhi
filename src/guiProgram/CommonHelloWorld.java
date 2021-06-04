package guiProgram;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
/**
 * This class is served as common class for applet and standalone application which
 * displayed very simple Message on frame or browser.
 * @author Yashwant.Lande
 *
 */


public class CommonHelloWorld extends JPanel {
  
	   String displayMessage = "Welcome"; 
	   MessageDisplay displayPanel;
	   
	
	/**
	 * Lets draw a panel which display the message
	 * This is panel and require to drew a string, So creating a subclass extending it to JPanel class and drawing it.
	 * 
	 */
	
	public class MessageDisplay extends JPanel{
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);  // Calling the JPanel class method, first overrides it from above step and now again calling it. because paintComponent will get initialize on crating the object of this type.
			Graphics2D g1;
			g1 = (Graphics2D)g;
			g1.setColor(Color.red);
			Font bigBoldFont = new Font("SansSerif", Font.BOLD, 24);
			g1.setFont(bigBoldFont);
			
			g1.drawString(displayMessage, 150, 100);
			//g1.draw3DRect(100, 100, 100, 100, true);
			//g.fillRect(0, 0, 100,100);
			System.out.println(getWidth());
			System.out.println(getHeight());
			System.out.println(g.getColor());
		}
		
	}
	
	/**
	 * Now as we have a button in our program, Then we must have write the event listner 
	 * to make the button functional. So we will write a sub class which extend the inbuild class which provides the 
	 * event listener
	 */
	
	  private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (displayMessage.equals("Welcome")){
				displayMessage = "Thank You";	
			}
			else 
				displayMessage = "Welcome";
			    displayPanel.repaint();
		}
		}
		
		/**
		 * Now write the constructor to get common things to be done and then different class for stand alone or Applet could initialize it use it further.
		 * 
		 */
		
		 public CommonHelloWorld(){
			displayPanel = new MessageDisplay();
			JButton button =  new JButton("Change the Message");
			ButtonHandler listner = new ButtonHandler();
			button.addActionListener(listner);
			//JPanel content = new JPanel();
			setLayout(new BorderLayout());
			add(displayPanel, BorderLayout.CENTER);
			add(button, BorderLayout.SOUTH);
			
			
			
		}
}
