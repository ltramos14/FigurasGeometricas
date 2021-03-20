/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasgeometricas;

/**
 * 
 * @author Tatiana Ramos Villanueva
 * @author Nicolás Nieto Cárdenas
 * @version 1.1.0
 * @since 1.0.0
 */
public class Circle extends Figure {
    
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        super.setArea(Math.PI * Math.pow(radius, 2)); 
    }

    @Override
    public void calculatePerimeter() {
       super.setPerimeter(2 * Math.PI * radius);      
    }

    @Override
    public void printAreaAndPerimeter() {
        calculateArea();
        calculatePerimeter();
        System.out.println("EL ÁREA DEL CÍRCULO ES: " + super.getArea());
        System.out.println("EL PERÍMETRO DEL CÍRCULO ES: " + super.getPerimeter());
    }

    @Override
    public void printResultsHistory() {
        System.out.println("RESUMEN DATOS: CÍRCULO \n " + "Radio: " + radius +
                "\n Área: " + super.getArea() + "\n Perímetro: " + super.getPerimeter());     
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
   
}