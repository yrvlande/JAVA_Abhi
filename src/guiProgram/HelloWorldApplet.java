package guiProgram;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A simple applet that can display the messages "Hello World"
 * and "Goodbye World".  The applet contains a button, and it
 * switches from one message to the other when the button is
 * clicked.
 */
public class HelloWorldApplet extends JApplet {
   
   private String currentMessage = "Hello World!"; // Currently displayed message.
   private MessageDisplay displayPanel;  // The panel where the message is displayed.
   
   private class MessageDisplay extends JPanel {   // Defines the display panel.
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         g.drawString(currentMessage, 100, 50);
      }
   }
   
   private class ButtonHandler implements ActionListener {  // The event listener.
      public void actionPerformed(ActionEvent e) {
         if (currentMessage.equals("Hello World!"))
            currentMessage = "Goodbye World!";
         else
            currentMessage = "Hello World!";
         displayPanel.repaint(); // Paint display panel with new message.
      }
   }
   
   /**
    * The applet's init() method creates the button and display panel and
    * adds them to the applet, and it sets up a listener to respond to
    * clicks on the button.
    */
   public void init() {
      
      displayPanel = new MessageDisplay();
      JButton changeMessageButton = new JButton("Change Message");
      ButtonHandler listener = new ButtonHandler();
      changeMessageButton.addActionListener(listener);

      JPanel content = new JPanel();
      content.setLayout(new BorderLayout());
      content.add(displayPanel, BorderLayout.CENTER);
      content.add(changeMessageButton, BorderLayout.SOUTH);

      setContentPane(content);
   }
   
}
