/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mod3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author kaleyschlimgen
 */
public class FirstWindow extends JFrame {

    public FirstWindow() {
        JFrame frame = new JFrame("User Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
 /*
        JPanel panel = new JPanel();
        JTextArea textArea = new JTextArea(1, 10);
 */       
        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Create the "File" menu
        JMenu fileMenu = new JMenu("Menu");
        //JTextArea textArea = new JTextArea(10, 20);
        JMenuItem dateTimeMenuItem = new JMenuItem("Date & Time");
        JMenuItem textFileMenuItem = new JMenuItem("Write to Text File");
        JMenuItem greenFileMenuItem = new JMenuItem("Green");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(dateTimeMenuItem);
        fileMenu.add(textFileMenuItem);
        fileMenu.add(greenFileMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        
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
        
/*        textFileMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (FileWriter writer = new FileWriter("log.txt")) {
                    writer.write(textArea.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
*/        
        greenFileMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.GREEN);
            }
        });

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        
        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);
      
 //       panel.add(textArea);
 //       frame.add(panel);
  
        frame.setVisible(true);
    }
}