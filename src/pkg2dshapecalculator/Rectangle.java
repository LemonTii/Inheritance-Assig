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
public class Rectangle extends UserInput {
    public Rectangle(){
        
    }

    @Override
    public double getArea() {
        return getB()*getH();
    }

    @Override
    public double getPerimeter() {
        return (getB()*2) + (getH()*2);
    }
    
}
