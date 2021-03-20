/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasgeometricas;

/**
 * Clase hija de Figure que calcular el área y el perímetro de un cuadrado
 * @author Tatiana Ramos Villanueva
 * @author Nicolás Nieto Cárdenas
 * @version 1.1.0
 * @since 1.0.0
 */
public class Square extends Figure{
    
    /**
     * Variable entera que almacena el valor de los lados de un cuadrado
     */
    private int side;

    /**
     * Constructor sobrecargado de la Square
     * @param side 
     */
    public Square(int side) {
        this.side = side;
    }

    /**
     * Método sobre escrito que calcula el área del cuadrado
     * El área calculada se envía a la clase padre por medio del método Set
     */
    @Override
    public void calculateArea() {
        super.setArea(Math.pow(side, 2));
    }

    /**
     * Método sobre escrito que calcula el perímetro del cuadrado
     * El perímetro calculado se envía a la clase padre por medio del método Set
     */
    @Override
    public void calculatePerimeter() {
        super.setPerimeter(4 * side);
    }

    /**
     * Método sobrescrito que activa los métodos que calculan el área y el perímetro
     * En este método también se imprimen en consola los valores calculados
     */
    @Override
    public void printAreaAndPerimeter() {
        calculateArea();
        calculatePerimeter();
        System.out.println("EL ÁREA DEL CUADRADO ES: " + super.getArea());
        System.out.println("EL PERÍMETRO DEL CUADRADO ES: " + super.getPerimeter());
    }

    /**
     * Método implententado de la Interface que todos los atributos del objeto cuadrado
     */
    @Override
    public void printResultsHistory() {
       System.out.println("RESUMEN DATOS: CUADRADO \n " + "Lado: " + side +
                "\n Área: " + super.getArea() + "\n Perímetro: " + super.getPerimeter());
    }

    /**
     * Método encapsulado que obtiene el valor de los lados de un objeto cuadrado
     * @return valor de la variable lado
     */
    public int getSide() {
        return side;
    }

    /**
     * Metodo que asigna un valor a los lados de un objeto cuadrado
     * @param side 
     */
    public void setSide(int side) {
        this.side = side;
    }

}   
