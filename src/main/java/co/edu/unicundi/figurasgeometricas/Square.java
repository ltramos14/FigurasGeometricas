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
public class Square extends Figure{
    
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        super.setArea(Math.pow(side, 2));
    }

    @Override
    public void calculatePerimeter() {
        super.setPerimeter(4 * side);
    }

    @Override
    public void printAreaAndPerimeter() {
        calculateArea();
        calculatePerimeter();
        System.out.println("EL ÁREA DEL CUADRADO ES: " + super.getArea());
        System.out.println("EL PERÍMETRO DEL CUADRADO ES: " + super.getPerimeter());
    }

    
    @Override
    public void printResultsHistory() {
       System.out.println("RESUMEN DATOS: CUADRADO \n " + "Lado: " + side +
                "\n Área: " + super.getArea() + "\n Perímetro: " + super.getPerimeter());
        
    }
    
    
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

}
