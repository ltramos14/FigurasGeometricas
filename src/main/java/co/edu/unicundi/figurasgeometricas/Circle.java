/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasgeometricas;

/**
 * Clase Hija de Figura que calcula área y perímetro del círculo
 *
 * @author Tatiana Ramos Villanueva
 * @author Nicolás Nieto Cárdenas
 * @version 1.1.0
 * @since 1.0.0
 */
public class Circle extends Figure {

    /**
     * Variable entera que almacena el radio del círculo
     */
    private int radius;

    /**
     * Constructor sobrecargado de la clase Circle
     *
     * @param radius
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * Método sobrescrito que calcula el área del círculo El área calculada se
     * envia a la clase Padre por medio del método Set
     */
    @Override
    public void calculateArea() {
        super.setArea(Math.PI * Math.pow(radius, 2));
    }

    /**
     * Método sobrescrito que calcula el perímetro del círculo El perímetro
     * calculado se envia a la clase Padre por medio del método Set
     */
    @Override
    public void calculatePerimeter() {
        super.setPerimeter(2 * Math.PI * radius);
    }

    /**
     * Método sobrescrito que activa los métodos que calculan el área y el
     * perímetro En este método también se imprimen en consola los valores
     * calculados
     */
    @Override
    public void printAreaAndPerimeter() {
        calculateArea();
        calculatePerimeter();
        System.out.println("EL ÁREA DEL CÍRCULO ES: " + super.getArea());
        System.out.println("EL PERÍMETRO DEL CÍRCULO ES: " + super.getPerimeter());
    }

    /**
     * Método implementado de la Interface que imprime todos los atributos del
     * objeto círculo
     */
    @Override
    public void printResultsHistory() {
        System.out.println("RESUMEN DATOS: CÍRCULO \n " + "Radio: " + radius
                + "\n Área: " + super.getArea() + "\n Perímetro: " + super.getPerimeter());
    }

    /**
     * Método encapsulado que obtiene el valor del radio de un objeto círculo
     *
     * @return valor de la variable radio
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Método encapsulado que le asigna un valor a la variable que contiene el
     * radio de un objeto círculo
     *
     * @param radius
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

}
