package arrayTest;
import java.awt.*;

import javax.swing.*;
public class Shape extends JPanel {
     Shape[] shapes;
     DisplayBackground displayBackground;
     
     public class DisplayBackground extends JPanel{
     public void paintComponant(Graphics g){
 		super.paintComponent(g);
 		
 		
 	}
     }
     public Shape(){
    	 displayBackground = new DisplayBackground();
    	 displayBackground.setBackground(Color.black);
    	 setLayout(new BorderLayout());
    	 add(displayBackground,BorderLayout.CENTER);
     }
}
