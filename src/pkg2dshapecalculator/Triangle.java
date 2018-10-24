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
public class Triangle extends UserInput {
    public Triangle(){
        
    }

    @Override
    public double getArea() {
        return (getB()*getH())/2;
    }

    @Override
    public double getPerimeter() {
        return getB()+getSl()+getSl2();
    }

}
