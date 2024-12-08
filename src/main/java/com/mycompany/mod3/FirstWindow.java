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
    private JTextField inputField;

    public FirstWindow() {
        setTitle("User Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
 
        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Create the menu
        JMenu fileMenu = new JMenu("Menu");
        JMenuItem dateTimeMenuItem = new JMenuItem("Date & Time");
        JMenuItem textFileMenuItem = new JMenuItem("Write to Text File");
        JMenuItem greenFileMenuItem = new JMenuItem("Green");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(dateTimeMenuItem);
        fileMenu.add(textFileMenuItem);
        fileMenu.add(greenFileMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        
        // Add menus to the menu bar
        menuBar.add(fileMenu);

        dateTimeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SecondWindow(inputField.getText());
                //new SecondWindow();
                
            }
        });
        
        textFileMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (FileWriter writer = new FileWriter("log.txt")) {
                    writer.write(inputField.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        greenFileMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.GREEN);
            }
        });
  // Create input field
  // Create the panel
        JPanel panel = new JPanel();
        //panel.setBackground(Color.LIGHT_GRAY);
        add(panel);
        panel.add(inputPanel(), BorderLayout.NORTH);

        // Make the frame visible
        setVisible(true);

    }
        
        private JPanel inputPanel(){
        JPanel panel = new JPanel();

        inputField = new JTextField(5);
        inputField.setEditable(true);
        inputField.setText("0");
        
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Write to text file:"));
        inputPanel.add(inputField);
        
 /*       dateTimeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SecondWindow(inputField.getText());
                //new SecondWindow();
                
            }
        });
 */
        panel.add(inputPanel, BorderLayout.NORTH);

        return panel;
        }
}

 /*       
        dateTimeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newWindow = new JFrame("Date & Time");
//only prints one of these
                newWindow.add(new JLabel("Today's Date:"));
                newWindow.add(new JLabel("Today's Time:"));
                newWindow.setSize(300, 200);
                newWindow.setVisible(true);
            }
        });
 */       

