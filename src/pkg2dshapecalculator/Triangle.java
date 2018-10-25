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
public class Triangle extends Calculation {
    
    public Triangle(){
        height = 0;
        base = 0;
        side = 0;
        side2 = 0;
    }

    public Triangle(double h, double b, double sl, double sl2){
        height = h;
        base = b;
        side = sl;
        side2 = sl2;
    }
    
    @Override
    public double getArea() {
        return (height*base)/2;
    }

    @Override
    public double getPerimeter() {
        return base + side + side2;
    }

}
