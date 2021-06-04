package guiProgram;
import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

public class Assignment2 extends JPanel {
	private displayShape shapeDisplay;
	private static int x;
	private static int y;
	public RepaintOnClickAss2 repaint = new RepaintOnClickAss2();
	
	
	/*
	 * Let draw componant
	 */
	public class displayShape extends JPanel{
	
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			setBackground(Color.BLACK);   
			//g.setColor(Color.red); 
		  //g.fillRect(x,y, 70, 40);
		   
		}
		}
	
	
	public static class RepaintOnClickAss2  implements MouseListener {
		
		public void  mousePressed(MouseEvent evt) {
			Component source = (Component)evt.getSource();
			Graphics g1 =  source.getGraphics();
			if (evt.getButton()== evt.BUTTON1){
		     x = evt.getX();
		     y= evt.getY();
		     
		     g1.setColor(Color.red);
		     g1.fillRect(x,y, 70, 40);
			}
			else if (evt.getButton()== evt.BUTTON3){
				x = evt.getX();
			     y= evt.getY();
			     
			     g1.setColor(Color.blue);
			     g1.fillOval(x,y, 70, 40);
			}
			else if (evt.getButton()== evt.BUTTON2){
			    g1.dispose();
			}
		     //source.getGraphics().
			//source.repaint();  // Call repaint() on the Component that was clicked.
		      
		   }

		   public void mouseClicked(MouseEvent evt) {
			   Component source1 = (Component)evt.getSource();
			   Graphics g2 =  source1.getGraphics();
			   x = evt.getX();
			     y= evt.getY();
			     if (evt.getButton()== evt.BUTTON1){
			   g2.drawString("Rectangle", (x+10), (y+10));
			     }
			     else {
			    	 g2.drawString("Oval", (x+18), (y+18));
			     }
			   
		   }
		   public void mouseReleased(MouseEvent evt) { }
		   public void mouseEntered(MouseEvent evt) { }
		   public void mouseExited(MouseEvent evt) { }
		   
			   }

        //Constructor 		
		public Assignment2(){
		shapeDisplay = new displayShape();
		setLayout(new BorderLayout());
	    add(shapeDisplay, BorderLayout.CENTER);
	}
	
	
}
