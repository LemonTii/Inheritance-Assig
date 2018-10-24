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
public class Circle extends UserInput {
    public Circle(){
    
}
    
    @Override
    public double getArea() {
        return Math.PI * getH() * getH();
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getH();
    }
    
}
