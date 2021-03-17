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
public class Circle extends Figure{
    
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void calculatePerimeter() {
       perimeter = 2 * Math.PI * radius;      
    }

    @Override
    public void printAreaAndPerimeter() {
        calculateArea();
        calculatePerimeter();
        System.out.println("EL ÁREA DEL CÍRCULO ES: " + area);
        System.out.println("EL PERÍMETRO DEL CÍRCULO ES: " + perimeter);
    }
    
}
