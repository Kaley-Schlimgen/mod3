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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SecondWindow {


    public static Color getRandomGreenHue() {
        Random random = new Random();

        int red = 0;
        int green = random.nextInt(256);
        int blue = 0;

        return new Color(red, green, blue);
    }
    
 
    
}