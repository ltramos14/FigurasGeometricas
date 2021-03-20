/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasgeometricas;

/**
 * Clase hija de Figure que calcular el área y el perímetro de un rectágulo
 * @author Tatiana Ramos Villanueva
 * @author Nicolás Nieto Cárdenas
 * @version 1.1.0
 * @since 1.0.0
 */
public class Rectangle extends Figure{

    /**
     * Variable entera que almacena la base de un rectángulo
     */
    private int base;
    
    /**
     * Variable enter que almacena la altura de un rectángulo
     */
    private int height;

    /**
     * Constructor sobrecargado de la clase Rectangle
     * @param base
     * @param height 
     */
    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Método sobre escrito que calcula el área del rectángulo
     * El área calculada se envía a la clase padre por medio del método Set
     */
    @Override
    public void calculateArea() {
        super.setArea(base * height);
    }

    /**
     * Método sobre escrito que calcula el perímetro del rectángulo
     * El perímetro calculado se envía a la clase padre por medio del método Set
     */
    @Override
    public void calculatePerimeter() {
       super.setPerimeter(2 * (base + height));      
    }

    /**
     * Método sobrescrito que activa los métodos que calculan el área y el perímetro
     * En este método también se imprimen en consola los valores calculados
     */
    @Override
    public void printAreaAndPerimeter() {
        calculateArea();
        calculatePerimeter();
        System.out.println("EL ÁREA DEL RECTÁNGULO ES: " + super.getArea());
        System.out.println("EL PERÍMETRO DEL RECTÁNGULO ES: " + super.getPerimeter());
    }

    /**
     * Método implententado de la Interface que todos los atributos del objeto rectángulo
     */
    @Override
    public void printResultsHistory() {
         System.out.println("RESUMEN DATOS: RECTÁNGULO \n " + "Base: " + base +
                 "\n Altura: " + height + "\n Área: " + super.getArea() + 
                 "\n Perímetro: "  + super.getPerimeter());      
    }

    /**
     * Método encapsulado que obtiene el valor de la base de un objeto rectángulo
     * @return valor de la variable base
     */
    public int getBase() {
        return base;
    }

    /**
     * Metodo que asigna un valor a la base de un objeto rectángulo
     * @param base 
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * Metodo que asigna un valor a la altura de un objeto rectángulo
     * @return valor de la variable altura
     */
    public int getHeight() {
        return height;
    }

    /**
     * Metodo que asigna un valor a la altura de un objeto rectángulo
     * @param height 
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
}
