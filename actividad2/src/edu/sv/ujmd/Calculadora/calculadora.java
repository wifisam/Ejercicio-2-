// medio funciona el programa busque info en intermet  
package edu.sv.ujmd.calculadora;

import edu.sv.ujmd.Calculadora.avanzada.CalculadoraAvanzada;
import edu.sv.ujmd.Calculadora.basica.CalculadoraBasica;
import java.util.Scanner;

public class calculadora {

    public static int menuprincipal() {
        Scanner teclado;
        teclado = new Scanner(System.in);
        int op;
        System.out.print("""
                         -----  MENU -----
                         ingrese una opcion:
                         1. Calculadora Basica
                         2. Calculadora avanzada
                         3. Salir 
                         """);

        op = teclado.nextInt();
        return op;
    }

    public static void main(String[] args) {
        boolean salir = false;
        int opc;
        opc = menuprincipal();
        do {
            switch (opc) {
                case 1:
                    CalculadoraBasica.principal(null);
                    break;

                case 2:
                    CalculadoraAvanzada.principal(null);
                    break;

                case 3:
                    System.out.println("Cerrando el programa...");
                    System.exit(0);
                    break;
            }
        } while (!salir);
    }

}