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
public class Figure {
    
    public double area;
    
    public double perimeter;
   
    
    public void calculateArea() {
        System.out.println("EL ÁREA DE LA FIGURA ES: " + area);
    }
    
    public void calculatePerimeter() {
         System.out.println("EL PERÍMETRO DE LA FIGURA ES : " + perimeter);
    }
    
    public void printAreaAndPerimeter() {
        System.out.println(area + perimeter);
    }
}
