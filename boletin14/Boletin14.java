/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import java.util.Scanner;

/**
 *
 * @author rcarreraamoedo
 */
public class Boletin14 {
    
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        ConversorTemperatura obx = new ConversorTemperatura();
        System.out.print("Escribe en grados lo que quieres conversar: ");
        float grados = teclado.nextFloat();   
        try{
            obx.temperaturaFharenheit(grados);
            obx.CentigradosaReamur(grados);
        }catch(TemperaturaErradaExcepcion e1){
            System.out.println("Error: "+e1.getMessage());
        }
    }
    
}
