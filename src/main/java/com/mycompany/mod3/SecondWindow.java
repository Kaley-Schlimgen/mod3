/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mod3;

/**
 *
 * @author kaleyschlimgen
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SecondWindow extends JDialog {
 //   private JTextField num1Field, num2Field;
      
        
        public SecondWindow (String text) {


 //input from other class
 //           balanceLabel = new JLabel(text);

        setTitle("SECOND WINDOW");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(300, 100);
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        mainPanel.add(dateTimePanel(), BorderLayout.NORTH);

        add(mainPanel);

        setVisible(true);
    }
        private JPanel dateTimePanel() {
            
        JPanel panel = new JPanel();


        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        JLabel label = new JLabel(formattedDateTime);
        
        panel.add(label);
        

        
        return panel;       
    }
}
