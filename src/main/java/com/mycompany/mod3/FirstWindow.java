/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mod3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author kaleyschlimgen
 */
public class FirstWindow extends JFrame {
    private JTextField timeDateField;

    public FirstWindow() {
        JFrame frame = new JFrame("User Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setLayout(new BorderLayout());
 
        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Create the menu
        JMenu fileMenu = new JMenu("Menu");
        
        JMenuItem dateTimeMenuItem = new JMenuItem("Date & Time");
        fileMenu.add(dateTimeMenuItem);
        
        JMenuItem textFileMenuItem = new JMenuItem("Write to Text File");
        fileMenu.add(textFileMenuItem);
        
        JMenuItem greenFileMenuItem = new JMenuItem("Green");
        fileMenu.add(greenFileMenuItem);
        
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);
        
        // Add menus to the menu bar
        menuBar.add(fileMenu);
        

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        //JLabel label = new JLabel(formattedDateTime);

 
        
        dateTimeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeDateField.setText(formattedDateTime);
                timeDateField.setVisible(true);
            }
        });
    
        textFileMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (FileWriter writer = new FileWriter("log.txt")) {
                    writer.write(timeDateField.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        
        greenFileMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //panel.setBackground(Color.GREEN);
                //getContentPane().setBackground(Color.GREEN);
                getContentPane().setBackground(SecondWindow.getRandomGreenHue());
            }
        });
        
        timeDateField = new JTextField(20);
        timeDateField.setVisible(false);
        add(timeDateField, BorderLayout.NORTH);
        
        setVisible(true);
           

    }

}


