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
public class Main {
        private String shape;
    public void AskUser(){
        Scanner reader = new Scanner(System.in);
        UserInput asker = new UserInput();
        while (true) {
            System.out.println("Pick the shape you would like (by their corresponding number) \n "
                + "1. Triangle \n 2. Rectangle \n 3. Circles \n 4. Trapezoids");
            shape = reader.next();
            switch (shape) {
                case "1": asker.Input1();
                          break;
                case "2": asker.Input2();
                          break;
                case "3": asker.Input3();
                          break;
                case "4": asker.Input4();
                          break;
                default: System.out.print("Please type in a valid input");
            }
        }
    }
    public void Callup(){
   
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
    }
}
