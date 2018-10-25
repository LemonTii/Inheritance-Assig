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
public class Circle extends Calculation {
    public Circle(){
    height = 0;
}
    
    public Circle(double h){
        height = h;
    }

    @Override
    public double getArea() {
        return Math.PI * height * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * height;
    }
    
}
