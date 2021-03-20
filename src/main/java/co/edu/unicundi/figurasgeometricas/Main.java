/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasgeometricas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que inicia el programa de las figuras geométricas
 *
 * @author Tatiana Ramos Villanueva
 * @author Nicolás Nieto Cárdenas
 * @version 1.1.0
 * @since 1.0.0
 */
public class Main {

    /**
     * Variable entera que almacena el tipo de figura elegida por el usuario en
     * consola
     */
    private int figureType;

    /**
     * Variable entera que almacena el tipo de triángulo elegido por el usuario
     * en consola
     */
    private int figureTriangle;

    /**
     * ArrayList que va almacenando el historial de resultados a lo largo de la
     * ejecución del programa
     */
    private ArrayList<IResultsHistory> historyRes;

    /**
     * Constructor que incializa la ejecución del programa
     */
    public Main() {
        this.historyRes = new ArrayList<IResultsHistory>();
        mainHome();
    }

    /**
     * Método que incia la ejecución del programa
     *
     * @param args
     */
    public static void main(String[] args) {
        //Instancia de la clase Main
        Main init = new Main();
    }

    /**
     * Método que contiene el menú de opciones presentado a lo largo de la
     * ejecución programa
     */
    public void mainHome() {
        Scanner entry = new Scanner(System.in);
        String answer;

        do {
            System.out.println("***** MENÚ DE OPCIONES [PROGRAMA FIGURAS GEOMÉTRICAS] *****");
            System.out.println("1. Círculo \n2. Rectángulo \n3. Cuadrado \n4. Triángulo");
            System.out.println("- Digite una opción:");
            this.figureType = entry.nextInt();

            switch (figureType) {
                case 1:
                    // Circulo
                    System.out.println("---- *HA SELECCIONADO CÍRCULO* ---- \nDigite su radio: ");
                    int radio = entry.nextInt();
                    IResultsHistory cir = new Circle(radio);
                    ((Circle) cir).printAreaAndPerimeter();
                    historyRes.add(cir);
                    break;
                case 2:
                    // Rectángulo
                    System.out.println("---- *HA SELECCIONADO RECTÁNGULO* ---- \nDigite su base y altura: ");
                    int base = entry.nextInt();
                    int heigth = entry.nextInt();
                    IResultsHistory rect = new Rectangle(base, heigth);
                    ((Rectangle) rect).printAreaAndPerimeter();
                    historyRes.add(rect);
                    break;
                case 3:
                    // Cuadrado
                    System.out.println("---- *HA SELECCIONADO CUADRADO* ---- \nDigite uno de sus lados: ");
                    int side = entry.nextInt();
                    IResultsHistory squa = new Square(side);
                    ((Square) squa).printAreaAndPerimeter();
                    historyRes.add(squa);
                    break;
                case 4:
                    // Triángulo
                    System.out.println("---- *HA SELECCIONADO TRIÁNGULO* ----");
                    System.out.println("1.Isósceles \n2.Equilátero \n3.Escaleno \nDigite una opción: ");
                    this.figureTriangle = entry.nextInt();
                    mainTriangleType(figureTriangle);
                    break;
                default:
                    System.out.println("¡¡No existen resultados para la opción digitada!!");
            }
            System.out.println("¿Desea continuar?: ");
            answer = entry.next();
            entry.skip("\n");
        } while (!answer.equalsIgnoreCase("no"));
        showResultsHistory();
    }

    public void mainTriangleType(int triangleType) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Digite la base y altura del Triángulo");
        int base = entry.nextInt();
        int heigth = entry.nextInt();

        switch (triangleType) {
            case 1:
                // Isosceles
                System.out.println("---- *HA SELECCIONADO Triángulo Isósceles* ----");
                System.out.println("Digite el valor de sus dos lados iguales: ");
                int sideEqual = entry.nextInt();
                System.out.println("Digite el valor de su lado diferente: ");
                int side = entry.nextInt();

                IResultsHistory isoseles = new Triangle(base, heigth, sideEqual, sideEqual, side);
                ((Triangle) isoseles).printAreaAndPerimeter();
                historyRes.add(isoseles);
                break;
            case 2:
                // Equilatero
                System.out.println("---- *HA SELECCIONADO Triángulo Equilátero* ----\nDigite uno de sus lados: ");
                int sideEquil = entry.nextInt();
                IResultsHistory equilater = new Triangle(base, heigth, sideEquil, sideEquil, sideEquil);
                ((Triangle) equilater).printAreaAndPerimeter();
                historyRes.add(equilater);
                break;
            case 3:
                // Escaleno
                System.out.println("---- *HA SELECCIONADO Triángulo Escaleno* ----\nDigite el primer lado: ");
                int sideA = entry.nextInt();
                System.out.println("Digite el segundo lado: ");
                int sideB = entry.nextInt();
                System.out.println("Digite el tercer lado: ");
                int sideC = entry.nextInt();
                IResultsHistory escalene = new Triangle(base, heigth, sideA, sideB, sideC);
                ((Triangle) escalene).printAreaAndPerimeter();
                historyRes.add(escalene);
                break;
            default:
                System.out.println("¡¡No existen resultados para la opción digitada!!");
        }
    }

    /**
     * Método que utiliza un forEach para imprimir en consola los resultados
     */
    public void showResultsHistory() {

        System.out.println("***** HISTORIAL DE  CÁLCULOS REALIZADOS *****");
        this.historyRes.forEach(i -> {
            i.printResultsHistory();
        });

    }
}