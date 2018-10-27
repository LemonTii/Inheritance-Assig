/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dshapecalculator;

import java.util.Scanner;
import java.text.DecimalFormat;


/**
 *
 * @author EricaSojeong
 */
public class UserInput {
    String shape;
    Boolean check;
    Scanner reader = new Scanner(System.in);
  
    public void Callup(){
        UserInput in = new UserInput();
        in.AskUser();
        do {
            System.out.print("Type \"1\" to Choose different shape. Type in anything else to quit: ");
            shape = reader.next();
            if (shape.equalsIgnoreCase("1")){
                in.AskUser();
            }
            else {
                break;
            }
        } while (true);
        System.out.println("Thank you!");
    }
    
    public void AskUser(){
        UserInput asker = new UserInput();
        check = true;
        while (check == true) {
            System.out.println("Pick the shape you would like (by their corresponding number) \n "
                + "1. Triangle \n 2. Rectangle \n 3. Circle \n 4. Trapezoid");
            shape = reader.next();
            switch (shape) {
                case "1": asker.Input1();
                          check = false;
                          break;
                case "2": asker.Input2();
                          check = false;
                          break;
                case "3": asker.Input3();
                          check = false;
                          break;
                case "4": asker.Input4();
                          check = false;
                          break;
                default: System.out.print("Please type in a valid input");
            }
        }
    }
    
    public void Input1(){
        System.out.print("Type in the height: ");
        double h = reader.nextDouble();
        System.out.print("Type in the base: ");
        double b = reader.nextDouble();
        System.out.print("Type in the first side length: ");
        double sl = reader.nextDouble();
        System.out.print("Type in the other side lenght: ");
        double sl2 = reader.nextDouble();
        
        Triangle tri = new Triangle(h, b, sl, sl2);
        DecimalFormat df = new DecimalFormat("#.##");

        
        System.out.println("The area of this triangle is: " + df.format(tri.getArea()));
        System.out.println("The perimeter of this triangle is: " + df.format(tri.getPerimeter()));
    }
    
    public void Input2(){
        System.out.print("Type in the length: ");
        double h = reader.nextDouble();
        System.out.print("Type in the width: ");
        double b = reader.nextDouble();
        
        Rectangle rect = new Rectangle(h, b);
        DecimalFormat df = new DecimalFormat("#.##");

        
        System.out.println("The area of this rectangle is: " + df.format(rect.getArea()));
        System.out.println("The perimeter of this rectangle is: " + df.format(rect.getPerimeter()));
    }
    
    public void Input3(){
        System.out.print("Type in the radius: ");
        double h = reader.nextDouble();
        
        Circle crcl = new Circle(h);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("The area of this circle is: " + df.format(crcl.getArea()));
        System.out.println("The circumference of this circle is: " + df.format(crcl.getPerimeter()));
    }
    
    public void Input4(){
        System.out.print("Type in the height: ");
        double h = reader.nextDouble();
        System.out.print("Type in the bottom length: ");
        double b = reader.nextDouble();
        System.out.print("Type in the top length: ");
        double b2 = reader.nextDouble();
        System.out.print("Type in the first side length: ");
        double sl = reader.nextDouble();
        System.out.print("Type in the other side lenght: ");
        double sl2 = reader.nextDouble();
        
        Trapezoid trap = new Trapezoid(h, b, b2, sl, sl2);
        DecimalFormat df = new DecimalFormat("#.##");

        
        System.out.println("The area of this trapezoid is: " + df.format(trap.getArea()));
        System.out.println("The perimeter of this trapezoid is: " + df.format(trap.getPerimeter()));
    }
}

