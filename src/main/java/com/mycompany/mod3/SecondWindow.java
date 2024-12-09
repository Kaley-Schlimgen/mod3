/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mod3;

/**
 *
 * @author kaleyschlimgen
 */

import java.awt.Color;
import java.util.Random;

public class SecondWindow {

    public static Color getRandomGreenHue() {
        Random random = new Random();

        // Keep red and blue components low to ensure a green hue
        int red = random.nextInt(100); 
        int green = 150 + random.nextInt(106); // Green value between 150 and 255
        int blue = random.nextInt(100); 

        return new Color(red, green, blue);
    }
}
/*extends JDialog {
 //   private JTextField num1Field, num2Field;
      
        
        public JPanel SecondWindow() {
            JPanel panel = new JPanel();


        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        JLabel label = new JLabel(formattedDateTime);
        
        panel.add(label);
        

        
        return panel;


 //input from other class
 //           balanceLabel = new JLabel(text);
/*
        setTitle("SECOND WINDOW");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(300, 100);
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        mainPanel.add(dateTimePanel(), BorderLayout.NORTH);

        add(mainPanel);

        setVisible(true);
*/
    //}
/*        private JPanel dateTimePanel() {
            
        JPanel panel = new JPanel();


        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        JLabel label = new JLabel(formattedDateTime);
        
        panel.add(label);
        

        
        return panel;       
    }
        */
//}
