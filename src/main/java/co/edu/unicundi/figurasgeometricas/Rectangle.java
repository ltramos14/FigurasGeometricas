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
 * @version 1.0.0
 * @since 1.0.0
 */
public class Rectangle extends Figure{

    private int base;
    
    private int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        super.setArea(base * height);
    }

    @Override
    public void calculatePerimeter() {
       super.setPerimeter(2 * (base + height));      
    }

    @Override
    public void printAreaAndPerimeter() {
        calculateArea();
        calculatePerimeter();
        System.out.println("EL ÁREA DEL RECTÁNGULO ES: " + super.getArea());
        System.out.println("EL PERÍMETRO DEL RECTÁNGULO ES: " + super.getPerimeter());
    }

    @Override
    public void printResultsHistory() {
         System.out.println("RESUMEN DATOS: RECTÁNGULO \n " + "Base: " + base +
                 "\nAltura: " + height + "\n Área: " + super.getArea() + 
                 "\n Perímetro: "  + super.getPerimeter());      
    }

    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
}
