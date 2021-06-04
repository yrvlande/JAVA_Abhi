package guiProgram;

import java.awt.BorderLayout;

import javax.swing.*;

/**
 * A trivial GUI program that says "Hello World" to the user,
 * using the built-in JOptionPane class.
 */
public class HelloWorldGUI1 {

   public static void main(String[] args) {
         
       JButton OkButton = new JButton("OKKK");
      JPanel content = new JPanel();
      content.setLayout(new BorderLayout());
      content.add(OkButton, BorderLayout.SOUTH);
	   JFrame window = new JFrame("Retail Market");
          
          window.setContentPane(content);
          window.setSize(1241, 948);
          window.setLocation(2, 2);
          window.setVisible(true);

        //  JOptionPane.showMessageDialog( null, "Hello World!");
   }
   
}
