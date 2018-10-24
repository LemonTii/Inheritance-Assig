/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dshapecalculator;

import java.util.Scanner;

/**
 *
 * @author EricaSojeong
 */
public abstract class UserInput {
    public String shape;
    private double h;
    private double b;
    private double b2;
    private double sl;
    private double sl2;
    
    public double getH(){return h;}
    public double getB(){return b;}
    public double getB2(){return b2;}
    public double getSl(){return sl;}
    public double getSl2(){return sl2;}
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
    public void getshape() {
        Scanner reader = new Scanner(System. in); 
        
        while (true) {
            System.out.println("Pick the shape you would like (by their corresponding number) \n "
                + "1. Triangle \n 2. Rectangle \n 3. Circles \n 4. Trapezoids");
            shape = reader.next();
            switch (shape) {
                case "1": System.out.print("Type in the height:");
                          h = reader.nextDouble();
                          System.out.print("Type in the base:");
                          b = reader.nextDouble();
                          System.out.print("Type in the first slant height:");
                          sl = reader.nextDouble();
                          System.out.print("Type in the second slant height:");
                          sl2 = reader.nextDouble();
                          break;
                case "2": System.out.print("Type in the length:");
                          h = reader.nextDouble();
                          System.out.print("Type in the width:");
                          b = reader.nextDouble();
                          break;
                case "3": System.out.print("Type in the radius:");
                          h = reader.nextDouble();
                          break;
                case "4": System.out.print("Type in the height:");
                          h = reader.nextDouble();
                          System.out.print("Type in the bottom length:");
                          b = reader.nextDouble();
                          System.out.print("Type in the top length:");
                          b2 = reader.nextDouble();
                          System.out.print("Type in the first slant height:");
                          sl = reader.nextDouble();
                          System.out.print("Type in the second slant height:");
                          sl2 = reader.nextDouble();
                          break;
                default: System.out.print("Please type in a valid input");
            }
        }
}
}
