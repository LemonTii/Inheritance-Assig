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
public abstract class Calculation {
    public double height, base, base2, side, side2;
    
    public abstract double getArea();
    public abstract double getPerimeter();
}
