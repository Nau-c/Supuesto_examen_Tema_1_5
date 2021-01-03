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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String text;
        int count = 0;
        System.out.println("Introduce un texto para contar las vocales");
        //Método por el cual recogemos el texto introducido por el usuario
        text = entry.nextLine();
        //Realizamos un bucle for usando length para poder contar las palabras
        for (int a = 0; a<text.length();a++){
            if ((text.charAt(a)=='a') || (text.charAt(a)=='e') || (text.charAt(a)=='i') || (text.charAt(a)=='o') ||
                    (text.charAt(a)=='u')){
                count++;//Usamos el método charAt en esta iteración nos devolvera el carácter de la posicición que estamos recorriendo
                //Así que comprobaremos que dicho carácter e suna vocal
            }
        }
        //Mostramos la vocales al usuario
        System.out.println("El texto tiene este número de vocales: " +count);   
    }   
}
