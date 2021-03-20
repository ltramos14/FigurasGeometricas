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
public class Triangle extends Figure {

    private int base;

    private int heigth;

    private int sideA;

    private int sideB;

    private int sideC;

    public Triangle(int base, int heigth, int sideA, int sideB, int sideC) {
        this.base = base;
        this.heigth = heigth;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void calculateArea() {
        super.setArea((base * heigth) / 2);
    }

    @Override
    public void calculatePerimeter() {
        super.setPerimeter(sideA + sideB + sideC);
    }

    @Override
    public void printAreaAndPerimeter() {
        calculateArea();
        calculatePerimeter();

        if (sideA == sideB && sideA == sideC) {

            System.out.println("EL ÁREA DEL TRIÁNGULO EQUILÁTERO ES: " + super.getArea());
            System.out.println("EL PERÍMETRO DEL TRIÁNGULO EQUILÁTERO  ES: " + super.getPerimeter());
            
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {

            System.out.println("EL ÁREA DEL TRIÁNGULO ISÓSCELES ES: " + super.getArea());
            System.out.println("EL PERÍMETRO DEL TRIÁNGULO ISÓSCELES  ES: " + super.getPerimeter());
            
        } else {

            System.out.println("EL ÁREA DEL TRIÁNGULO ESCALENO ES: " + super.getArea());
            System.out.println("EL PERÍMETRO DEL TRIÁNGULO ESCALENO  ES: " + super.getPerimeter());
        
        }
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

}
