/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mod3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author kaleyschlimgen
 */
public class FirstWindow extends JFrame {
    public JTextField timeDateField;

    public FirstWindow() {
        setTitle("User Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
    
        // Create the menu bar and menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("Menu");
        
        JMenuItem dateTimeMenuItem = new JMenuItem("Display Date & Time");
        fileMenu.add(dateTimeMenuItem);
        
        JMenuItem textFileMenuItem = new JMenuItem("Write to Text File");
        fileMenu.add(textFileMenuItem);
        
        JMenuItem greenFileMenuItem = new JMenuItem("Random Green");
        fileMenu.add(greenFileMenuItem);
        
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);
        
        // Add menus to the menu bar
        menuBar.add(fileMenu);
        
        //Get time and date
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        
        //Create field for date and time
        timeDateField = new JTextField(20);
        timeDateField.setVisible(false);
        add(timeDateField, BorderLayout.NORTH);
        
        
        //ActionListener for getting date and time for menu item no. 1
        dateTimeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeDateField.setText(formattedDateTime);
                timeDateField.setVisible(true);
            }
        });
    
        //ActionListener for saving text to log.txt with menu item no. 2
        textFileMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveToFile();
            }
        });
        
        //ActionListener for getting a random shade of green with menu item no. 3
        greenFileMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(SecondWindow.getRandomGreenHue());
            }
        });
        
        //ActionListener for exiting the program with menu item no. 4       
        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        setVisible(true);
           
    }
    
    //Method for saving text to file
    private void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {
            writer.write(timeDateField.getText());
            JOptionPane.showMessageDialog(this, "Text saved to log.txt");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage());
        }
    }


}


