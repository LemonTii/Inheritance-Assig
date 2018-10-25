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
public class Trapezoid extends Calculation{
    public Trapezoid(){
    base = 0;
    base2 = 0;
    height = 0;
    side = 0;
    side2 = 0;
}

    public Trapezoid(double b, double b2, double h, double s, double s2){
        base = b;
        base2 = b2;
        height = h;
        side = s;
        side2 = s2;
    }
    
    @Override
    public double getArea() {
        return ((base+base2)*height)/2;
    }

    @Override
    public double getPerimeter() {
        return base + base2 + side + side2;
    }
    
}
