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
public class Trapezoid extends UserInput{
    public Trapezoid(){
    
}

    @Override
    public double getArea() {
        return ((getB()+getB2())*getH())/2;
    }

    @Override
    public double getPerimeter() {
        return getB() + getB2() + getSl() + getSl2();
    }
    
}
