/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PabloCosta14
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
       
        double costo;

        double impuestoalemania;
        double impuestojapon;
        double impuestoitalia;
        double impuestousa;
        double porcentajealemania = 20;
        double porcentajejapon = 30;
        double porcentajeitalia = 15;
        double porcentajeusa = 8;

        double precioventa;

        System.out.println("Ingrese la marca del automovil");
        marca = entrada.nextLine();

        System.out.println("Ingrese el origen del automovil");
        origen = entrada.nextLine();

        System.out.println("Ingrese el costo del automovil");
        costo = entrada.nextDouble();

        if (costo < 0) {
            System.out.println("Valor fuera de rango");
        } else {
            if (origen.equals("Alemania")) {
                impuestoalemania = (costo * porcentajealemania)/100;
                precioventa = impuestoalemania + costo;
                System.out.printf("El impuesto por pagar es: %.2f\n"
                        + "El precio de venta total es: %.2f\n",
                        impuestoalemania, precioventa);
            } else {
                if (origen.equals("Japon")) {
                    impuestojapon = (costo * porcentajejapon)/100;
                    precioventa = impuestojapon + costo;
                    System.out.printf("El impuesto por pagar es: %.2f\n"
                            + "El precio de venta total es: %.2f\n", impuestojapon,
                            precioventa);
                } else {
                    if (origen.equals("Italia")) {
                        impuestoitalia = (costo * porcentajeitalia)/100;
                        precioventa = impuestoitalia + costo;
                        System.out.printf("El impuesto  por pagar es: %.2f\n"
                                + "El precio de venta total es: %.2f\n",
                                impuestoitalia,
                                precioventa);
                    } else {
                        if (origen.equals("USA")) {
                            impuestousa = (costo * porcentajeusa)/100;
                            precioventa = impuestousa + costo;
                            System.out.printf("El impuesto por pagar es: %.2f\n"
                                    + "El precio de venta total es: %.2f\n",
                                    impuestousa,
                                    precioventa);
                        } else {
                            System.out.printf("No requiere pagar impuesto\n"
                                    + "El precio de venta total es: %.2f\n", costo);
                        }
                    }
                }
            }
        }
    }

}
