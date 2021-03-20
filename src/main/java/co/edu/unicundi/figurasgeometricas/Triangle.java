/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasgeometricas;

/**
 * Clase hija de Figure que calcular el área y el perímetro de un triángulo
 *
 * @author Tatiana Ramos Villanueva
 * @author Nicolás Nieto Cárdenas
 * @version 1.1.0
 * @since 1.0.0
 */
public class Triangle extends Figure {

    /**
     * Variable entera que almacena la base de un triángulo
     */
    private int base;

    /**
     * Variable entera que almacena la altura de un triángulo
     */
    private int height;

    /**
     * Variable entera que almacena el lado A de un triángulo
     */
    private int sideA;

    /**
     * Variable entera que almacena el lado B de un triángulo
     */
    private int sideB;

    /**
     * Variable entera que almacena el lado C de un triángulo
     */
    private int sideC;

    /**
     * Constructor sobrecargado de la clase Triangle
     *
     * @param base
     * @param heigth
     * @param sideA
     * @param sideB
     * @param sideC
     */
    public Triangle(int base, int heigth, int sideA, int sideB, int sideC) {
        this.base = base;
        this.height = heigth;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Método sobre escrito que calcula el área del triangulo El área calculada
     * se envía a la clase padre por medio del método Set
     */
    @Override
    public void calculateArea() {
        double area = (base * height) / 2;

        if (Double.isInfinite(area)) {
            System.out.println("Area indeterminada");
        } else {
            super.setArea(area);
        }
    }

    /**
     * Método sobre escrito que calcula el perímetro del triangulo El perímetro
     * calculado se envía a la clase padre por medio del método Set
     */
    @Override
    public void calculatePerimeter() {
        super.setPerimeter(sideA + sideB + sideC);
    }

    /**
     * Método sobrescrito que activa los métodos que calculan el área y el
     * perímetro En este método también se imprimen en consola los valores
     * calculados Se valida el tipo de triángulo y según eso lo imprime el tipo
     * en consola
     */
    @Override
    public void printAreaAndPerimeter() {
        calculateArea();
        calculatePerimeter();

        if (sideA == sideB && sideA == sideC) {
            // Equilátro
            System.out.println("EL ÁREA DEL TRIÁNGULO EQUILÁTERO ES: " + super.getArea());
            System.out.println("EL PERÍMETRO DEL TRIÁNGULO EQUILÁTERO  ES: " + super.getPerimeter());

        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            // Isóseles
            System.out.println("EL ÁREA DEL TRIÁNGULO ISÓSCELES ES: " + super.getArea());
            System.out.println("EL PERÍMETRO DEL TRIÁNGULO ISÓSCELES  ES: " + super.getPerimeter());

        } else {
            // Escaleno
            System.out.println("EL ÁREA DEL TRIÁNGULO ESCALENO ES: " + super.getArea());
            System.out.println("EL PERÍMETRO DEL TRIÁNGULO ESCALENO  ES: " + super.getPerimeter());

        }
    }

    /**
     * Método implententado de la Interface que todos los atributos del objeto
     * triángulo
     */
    @Override
    public void printResultsHistory() {
        System.out.println("RESUMEN DATOS: TRIÁNGULO \n " + "Base: " + base
                + "\n Altura: " + height + "\n Área: " + super.getArea() + "\n Lado A: "
                + sideA + "\n Lado B: " + sideB + "\n Lado C: " + sideC
                + "\n Perímetro: " + super.getPerimeter());
    }

    /**
     * Método encapsulado que obtiene el valor de la base de un objeto triángulo
     *
     * @return valor de la variable base
     */
    public int getBase() {
        return base;
    }

    /**
     * Metodo que asigna un valor a la base de un objeto triángulo
     *
     * @param base
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * Metodo que asigna un valor a la altura de un objeto triángulo
     *
     * @return valor de la variable altura
     */
    public int getHeight() {
        return height;
    }

    /**
     * Metodo que asigna un valor a la altura de un objeto triángulo
     *
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Metodo que asigna un valor al lado A de un objeto triángulo
     *
     * @return valor de la variable lado A
     */
    public int getSideA() {
        return sideA;
    }

    /**
     * Metodo que asigna un valor al lado A de un objeto triángulo
     *
     * @param sideA
     */
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    /**
     * Metodo que asigna un valor al lado B de un objeto triángulo
     *
     * @return valor de la variable altura
     */
    public int getSideB() {
        return sideB;
    }

    /**
     * Metodo que asigna un valor al lado B de un objeto triángulo
     *
     * @param sideB
     */
    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    /**
     * Metodo que asigna un valor al lado C de un objeto triángulo
     *
     * @return valor de la variable altura
     */
    public int getSideC() {
        return sideC;
    }

    /**
     * Metodo que asigna un valor al lado C de un objeto triángulo
     *
     * @param sideC
     */
    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

}
