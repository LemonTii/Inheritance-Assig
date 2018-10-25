/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dshapecalculator;

/**
 *
 * @author EricaSojeong
 */
public class Rectangle extends Calculation {
    public Rectangle(){
        height = 0;
        base = 0;
    }

    public Rectangle(double h, double b){
        height = h;
        base = b;
    }
    @Override
    public double getArea() {
        return height * base;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + base);
    }
    
}
