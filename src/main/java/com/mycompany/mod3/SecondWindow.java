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

    //Method for displaying random hue of green
    public static Color getRandomGreenHue() {
        Random random = new Random();

        int red = 0;
        int green = random.nextInt(256);
        int blue = 0;

        return new Color(red, green, blue);
    }
    
 
    
}