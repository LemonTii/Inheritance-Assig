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
public class UserInput {
    String value, choice, shape;
    Boolean check;
    Scanner reader = new Scanner(System.in);
    
//    public UserInput(){
//        base = 0;
//        base2 = 0;
//        height = 0;
//        side = 0;
//        side2 = 0;
//        shape = null;
//    }
//    
//    public UserInput(double b, double b2, double h, double s, double s2, String shp){
//        base = b;
//        base2 = b2;
//        height = h;
//        side = s;
//        side2 = s2;
//        shape = shp;
//    }
    
    public void Callup(){
        UserInput in = new UserInput();
        in.AskUser();
        do {
            System.out.print("Type \"1\" to Choose different shape. Type in anything else to quit: ");
            choice = reader.next();
            if (choice.equalsIgnoreCase("1")){
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
        check = true;
        
        while (check == true){
            System.out.println("What would you like (type the corresponding number) \n 1. Area \n 2. Perimeter");
            value = reader.next();
            switch (value) {
                case "1":
                    System.out.println("The area of this triangle is: " + tri.getArea());
                    check = false;
                    break;
                case "2":
                    System.out.println("The perimeter of this triangle is: " + tri.getPerimeter());
                    check = false;
                    break;
                default:
                    System.out.println("Invalid input please try again");
            }
        }
    }
    
    public void Input2(){
        System.out.print("Type in the length: ");
        double h = reader.nextDouble();
        System.out.print("Type in the width: ");
        double b = reader.nextDouble();
        Rectangle rect = new Rectangle(h, b);
        check = true;
        while (check == true){
            System.out.println("What would you like (type the corresponding number) \n 1. Area \n 2. Perimeter");
            value = reader.next();
            switch (value) {
                case "1":
                    System.out.println("The area of this rectangle is: " + rect.getArea());
                    check = false;
                    break;
                case "2":
                    System.out.println("The perimeter of this rectangle is: " + rect.getPerimeter());
                    check = false;
                    break;
                default:
                    System.out.println("Invalid input please try again");
            }
        }
    }
    
    public void Input3(){
        System.out.print("Type in the radius: ");
        double h = reader.nextDouble();
        Circle crcl = new Circle(h);
        check = true;
        while (check == true){
            System.out.println("What would you like (type the corresponding number) \n 1. Area \n 2. Circumference");
            value = reader.next();
            switch (value) {
                case "1":
                    System.out.println("The area of this circle is: " + crcl.getArea());
                    check = false;
                    break;
                case "2":
                    System.out.println("The perimeter of this circle is: " + crcl.getPerimeter());
                    check = false;
                    break;
                default:
                    System.out.println("Invalid input please try again");
            }
        }
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
        check = true;
        
        while (check == true){
            System.out.println("What would you like (type the corresponding number) \n 1. Area \n 2. Perimeter");
            value = reader.next();
            switch (value) {
                case "1":
                    System.out.println("The area of this trapezoid is: " + trap.getArea());
                    check = false;
                    break;
                case "2":
                    System.out.println("The perimeter of this trapezoid is: " + trap.getPerimeter());
                    check = false;
                    break;
                default:
                    System.out.println("Invalid input please try again");
            }
        }
    }

}

