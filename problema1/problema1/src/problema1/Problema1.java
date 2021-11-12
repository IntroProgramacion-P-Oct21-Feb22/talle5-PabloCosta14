/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALAA
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costokilovatiohora;
        double kilovatiosconsumidosmes;
        int edad;
        double porcentaje = 10;
        double descuento;
        double valortotal;
        double valortotal2;

        System.out.println("Ingrese el costo por kilovatio hora");
        costokilovatiohora = entrada.nextDouble();

        System.out.println
        ("ingtese el numero de kilovatios consumidos en el mes");
       kilovatiosconsumidosmes = entrada.nextDouble();
       
       System.out.println("Ingrese la edad de la persona");
       edad = entrada.nextInt();
       
       valortotal = costokilovatiohora * kilovatiosconsumidosmes;
       
       if(edad >=65){
           descuento = (porcentaje * valortotal)/100;
           valortotal = (valortotal - descuento);
           System.out.printf( "valor total a pagar es + %.2f\n" , valortotal);
    } else { 
           valortotal = costokilovatiohora * kilovatiosconsumidosmes;
       }
    

          System.out.printf( "valor total a pagar es + %.2f\n" , valortotal);
    }

}


