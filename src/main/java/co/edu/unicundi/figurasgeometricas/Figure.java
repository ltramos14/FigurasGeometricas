/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasgeometricas;

/**
 * Clase abstracta Padre que representa las figuras geométricas Esta clase
 * implementa los métodos abstractos de la interface IResultsHistory
 *
 * @author Tatiana Ramos Villanueva
 * @author Nicolás Nieto Cárdenas
 * @version 1.1.0
 * @since 1.0.0
 */
public abstract class Figure implements IResultsHistory {

    /**
     * Variable double que almacena el área de las figuras geométricas
     */
    private double area;
    /**
     * Variable double que almacena el perímetro de las figuras geométricas
     */
    private double perimeter;

    /**
     * Método abstracto para calcular el área de una figura geómetrica
     */
    public abstract void calculateArea();

    /**
     * Método abstracto para calcular el perímetro de una figura geómetrica
     */
    public abstract void calculatePerimeter();

    /**
     * Método abstracto para imprimir en consola los valores de área y perímetro
     */
    public abstract void printAreaAndPerimeter();

    /**
     * Método encapsulado que obtiene el valor del área de una figura geométrica
     *
     * @return valor de la variable área
     */
    public double getArea() {
        return area;
    }

    /**
     * Método encapsulado que le asigna un valor a la variable área
     *
     * @param area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Método encapsulado que obtiene el valor del perímetro de una figura
     * geométrica
     *
     * @return valor de la variable perímetro
     */
    public double getPerimeter() {
        return perimeter;
    }

    /**
     * Método encapsulado que le asigna un valor a la variable perímetro
     *
     * @param perimeter
     */
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
