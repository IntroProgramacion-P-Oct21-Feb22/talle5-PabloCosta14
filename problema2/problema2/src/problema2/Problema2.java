/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PabloCosta14
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in); 
       entrada.useLocale(Locale.US);
   
    String nombreArticulo;   
    double precio_unitario;
    double cantidad_requerida;
    double porcentaje = 15;
    double descuento;
    double valortotal; 
    
    
    System.out.println("Ingrese el nombre del Articulo");
    nombreArticulo = entrada.nextLine();
    
    System.out.println("Ingrese el valor del precio unitario");
    precio_unitario = entrada.nextDouble();
    
    System.out.println("Ingrese la cantidad requerida");
    cantidad_requerida = entrada.nextDouble();
    
    valortotal = precio_unitario * cantidad_requerida;
    
    if (cantidad_requerida >50){
        descuento =(porcentaje * valortotal)/100;
        valortotal = valortotal - descuento;
    }
    System.out.printf("El valor total a pagar es %.2f de %s " , valortotal, 
             nombreArticulo);
  }
}    