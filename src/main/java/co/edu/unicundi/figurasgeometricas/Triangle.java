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
public class Triangle extends Figure {
    
    int base;
    
    int heigth;
    
    int sideA;
    
    int sideB;
    
    int sideC;

    public Triangle(int base, int heigth, int sideA, int sideB, int sideC) {
        this.base = base;
        this.heigth = heigth;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void calculateArea() {
        area = (base * heigth) / 2;
    }

    @Override
    public void calculatePerimeter() {
        
    }
    
    
}
