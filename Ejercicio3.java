/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supuesto_Examen;

import java.util.Scanner;

/**
 *
 * @author Nauzet
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String inputNumber;
        int money1;
        int money10;
        int money100;
        int money50;
        int money500;
        boolean error = false;
        do {
            try {
                System.out.println(" Introduce una cantidad en número entero para devolverte el cambio:");
                inputNumber = keyboard.nextLine();
                if(inputNumber.contains(".") || inputNumber.contains(",")) {
                    throw (new Exception("Ha introducido un número con decimales"));
                }
                int number_parse = Integer.parseInt(inputNumber);
                
                if (number_parse<0){
                    throw (new Exception("Ha introducido un número negativo"));
                }
                
                money500 = (number_parse - number_parse%500)/500;
                number_parse = number_parse%500;
                money50 = (number_parse - number_parse%50)/50;
                number_parse = number_parse%50;
                money100 = (number_parse - number_parse%100)/100;
                number_parse = number_parse%100;
                money10 = (number_parse - number_parse%10)/10;
                number_parse = number_parse%10;
                money1 = (number_parse - number_parse%1)/1;
                number_parse = number_parse%1;
                
                
                System.out.println(money500+" Moneda de 500 ");
                System.out.println(money50+" Moneda de 50 ");
                System.out.println(money100+" Moneda de 100 ");
                System.out.println(money10+" Moneda de 10 ");
                System.out.println(money1+" Moneda de 1 ");
                
            } catch(NumberFormatException e){
                // Muestra error producido
                System.out.println("No es un número");
                //Mostramso el tipo de error
                System.out.println("Se ha generado un error de este tipo" +e.getClass().getName());
                error = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                error = true;
            }
            
        } while(error);  
    }
}
