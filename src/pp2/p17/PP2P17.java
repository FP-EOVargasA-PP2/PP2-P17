/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p17;

import java.util.Scanner;

/**
 *
 * @author osiri
 */
public class PP2P17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion
        int a;
        int b;
        //Proceso
        a = pedir ("primer");
        b = pedir ("segundo");
        mostrar (a,b);
        
    }
    public static int pedir (String a){
        int b;
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el "+a+" numero");
        b = teclado.nextInt();
        return b;
    }
    public static void mostrar (int a, int b){
        int c;
        //Se determina si son iguales
        if (a == b){
            System.out.println("El maximo comun denominador es "+a);
            System.exit(0);
        }else {
            System.out.println("El maximo comun denominador es "+a*b);
            System.exit(0);
        }
    }
}
