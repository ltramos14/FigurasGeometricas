/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasgeometricas;

/**
 *
 * @author nicon
 */
public abstract class Figure {
    
    public double area;
    
    public double perimeter;
   
    
    public abstract void calculateArea();
    
    public abstract void calculatePerimeter();
    
    public abstract void printAreaAndPerimeter();
}
