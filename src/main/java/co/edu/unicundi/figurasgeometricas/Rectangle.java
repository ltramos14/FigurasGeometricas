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
public class Rectangle extends Figure{

    int base;
    int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = base * height;
    }

    @Override
    public void calculatePerimeter() {
       perimeter = 2 * (base + height);      
    }

    @Override
    public void printAreaAndPerimeter() {
        calculateArea();
        calculatePerimeter();
        System.out.println("EL ÁREA DEL RECTÁNGULO ES: " + area);
        System.out.println("EL PERÍMETRO DEL RECTÁNGULO ES: " + perimeter);
    }
    
    
    
}
