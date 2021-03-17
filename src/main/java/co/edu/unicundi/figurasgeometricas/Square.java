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
public class Square extends Figure{
    
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        area = Math.pow(side, 2);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 4 * side;
    }

    @Override
    public void printAreaAndPerimeter() {
        calculateArea();
        calculatePerimeter();
        System.out.println("EL ÁREA DEL CUADRADO ES: " + area);
        System.out.println("EL PERÍMETRO DEL CUADRADO ES: " + perimeter);
    }
    
}
