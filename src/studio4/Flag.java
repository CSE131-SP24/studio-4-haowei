package studio4;

import java.awt.Color;


import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;

public class Flag extends JPanel {

    public static void main(String[] args) {
        
    	StdDraw.setPenColor(Color.blue);
    	StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
    	
    	double angle = Math.PI / 7; // 180/7 degrees for star points
    	double[] xPoints = new double[14];
    	double[] yPoints = new double[14];
    	
    	double centerX = 0.5;
    	double centerY = 0.5;
    	double outerRadius = 0.2;
    	double innerRadius = 0.1;
    	
        for (int i = 0; i < 14; i++) {
            if (i % 2 == 0) { // Outer points
                xPoints[i] = (centerX + Math.cos(i * angle) * outerRadius);
                yPoints[i] = (centerY + Math.sin(i * angle) * outerRadius);
            } else { // Inner points
                xPoints[i] = (centerX + Math.cos(i * angle) * innerRadius);
                yPoints[i] = (centerY + Math.sin(i * angle) * innerRadius);
            }
        }
        
        StdDraw.setPenColor(Color.yellow);
        StdDraw.filledPolygon(xPoints, yPoints);
        
        
        
    	
    }
}
