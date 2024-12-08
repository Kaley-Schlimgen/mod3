/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mod3;

/**
 *
 * @author kaleyschlimgen
 */

import javax.swing.*;
public class Mod3 extends JFrame {

    public Mod3() {
        setTitle("User Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the "File" menu
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

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Mod3();
        });
    }
}
