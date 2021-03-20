/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasgeometricas;

import java.util.ArrayList;
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
    
    ArrayList<IResultsHistory> historyRes;

    public Main() {
        this.historyRes = new ArrayList<IResultsHistory>();
        mainHome();
    }

    public static void main(String[] args) {
        Main init = new Main();
    }

    public void mainHome() {

        Scanner entry = new Scanner(System.in);
        String answer;

        do {

            System.out.println("Digite una opción");
            this.figureType = entry.nextInt();

            switch (figureType) {
                case 1:
                    // Circulo
                    System.out.println("Digite el radio del Círculo");
                    int radio = entry.nextInt();
                    IResultsHistory cir = new Circle(radio);
                    ((Circle)cir).printAreaAndPerimeter();                  
                    historyRes.add(cir);
                    break;
                case 2:
                    // Rectángulo
                    System.out.println("Digite la base del Rectángulo");
                    int base = entry.nextInt();
                    System.out.println("Digite la altura del Rectángulo");
                    int heigth = entry.nextInt();

                    IResultsHistory rect = new Rectangle(base, heigth);
                    ((Rectangle)rect).printAreaAndPerimeter();
                    historyRes.add(rect);
                    break;
                case 3:
                    // Cuadrado
                    System.out.println("Digite el lado del Cuadrado");
                    int side = entry.nextInt();

                    IResultsHistory squa = new Square(side);
                    ((Square)squa).printAreaAndPerimeter();
                    historyRes.add(squa);
                    break;
                case 4:
                    // Triángulo
                    System.out.println("Tipo de triangulo");
                    this.figureTriangle = entry.nextInt();
                    mainTriangleType(figureTriangle);
                    break;
                default:
                    System.out.println("No existen resultados para esa opción!!");
            }

            System.out.println("Desea continuar?:");
            answer = entry.next();
            entry.skip("\n");

        } while (!answer.equalsIgnoreCase("no"));
        
        System.out.println("HISTORIAL DE CÁLCULOS REALIZADOS");
        
        historyRes.forEach(i -> {
            i.printResultsHistory();
        });

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

                IResultsHistory isoseles = new Triangle(base, heigth, sideEqual, sideEqual, side);
                ((Triangle)isoseles).printAreaAndPerimeter();
                historyRes.add(isoseles);
                break;
            case 2:
                // Equilatero
                System.out.println("Digite uno de los lados del Triángulo Equilatero");
                int sideEquil = entry.nextInt();
                IResultsHistory equilater = new Triangle(base, heigth, sideEquil, sideEquil, sideEquil);
                ((Triangle)equilater).printAreaAndPerimeter();
                historyRes.add(equilater);
                break;
            case 3:
                // Escaleno
                System.out.println("Digite el primer lado del Triángulo Escaleno");
                int sideA = entry.nextInt();
                System.out.println("Digite el segundo lado del Triángulo Escaleno");
                int sideB = entry.nextInt();
                System.out.println("Digite el tercer lado del Triángulo Escaleno");
                int sideC = entry.nextInt();
                IResultsHistory escalene = new Triangle(base, heigth, sideA, sideB, sideC);
                ((Triangle)escalene).printAreaAndPerimeter();
                historyRes.add(escalene);
                break;
            default:
                System.out.println("No existen resultados para esa opción!!");
        }
    }
}
