/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unicundi.figurasgeometricas;

import java.util.Scanner;

/**
 * 
 * @author Tatiana Ramos Villanueva
 * @author Nicolás Nieto Cárdenas
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main {

    int figureType;
    
    int figureTriangle;
    
    public Main() {
        
        Rectangle rect = new Rectangle(13, 6);
        rect.printAreaAndPerimeter();
    }
    
    public static void main(String[] args) {
        Main init = new Main();
    }  
    
    public void mainHome() {
        
        Scanner entry = new Scanner(System.in);
        
        switch (figureType){
            case 1: 
                // Circulo
                System.out.println("Digite el radio del Círculo");
                int radio = entry.nextInt();
                Circle cir = new Circle(radio);
                cir.printAreaAndPerimeter();
                break;
            case 2:
                // Rectángulo
                System.out.println("Digite la base del Rectángulo");
                int base = entry.nextInt();
                System.out.println("Digite la altura del Rectángulo");
                int heigth = entry.nextInt();
                
                Rectangle rect = new Rectangle(base, heigth);
                rect.printAreaAndPerimeter();
                break;
            case 3:
                // Cuadrado
                System.out.println("Digite el lado del Cuadrado");
                int side = entry.nextInt();
                
                Square squa = new Square(side);
                squa.printAreaAndPerimeter();
                break;
            case 4:
                // Triágulo
                System.out.println("Tipo de triangulo");
                int typeTri = entry.nextInt();
                mainTriangleType(typeTri);
                break;
            default:
                System.out.println("No existen resultados para esa opción!!");
        }
    }
    
    public void mainTriangleType(int triangleType) {
        
        Scanner entry = new Scanner(System.in);
        System.out.println("Digite la base del Triángulo");
        int base = entry.nextInt();
        System.out.println("Digite la altura del Triángulo");
        int heigth = entry.nextInt();
        
        
        switch (triangleType) {
            case 1:
                // Isoseles
                System.out.println("Digite el valor de los dos lados iguales del Triángulo Isoseles");
                int sideEqual = entry.nextInt();
                System.out.println("Digite el valor del lado diferente del Triángulo Isoseles");
                int side = entry.nextInt();
                
                Triangle isoseles = new Triangle(base, heigth, sideEqual, sideEqual, side);
                isoseles.printAreaAndPerimeter();
                break;
            case 2:
                // Equilatero
                System.out.println("Digite uno de los lados del Triángulo Equilatero");
                int sideEquil = entry.nextInt();
                Triangle equilater = new Triangle(base, heigth, sideEquil, sideEquil, sideEquil);
                equilater.printAreaAndPerimeter();
                break;
            case 3:
                // Escaleno
                System.out.println("Digite el primer lado del Triángulo Escaleno");
                int sideA = entry.nextInt();
                System.out.println("Digite el segundo lado del Triángulo Escaleno");
                int sideB = entry.nextInt();
                System.out.println("Digite el tercer lado del Triángulo Escaleno");
                int sideC = entry.nextInt();
                Triangle escalene = new Triangle(base, heigth, sideA, sideB, sideC);
                escalene.printAreaAndPerimeter();
                break;
            default:
                System.out.println("No existen resultados para esa opción!!");
        }
    }
}
