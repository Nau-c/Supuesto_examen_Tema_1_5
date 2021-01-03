/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supuesto_Examen;

/**
 *
 * @author Nauzet
 */
public class Menu {
     public static void main(String[] args) {
        Libro milibro = new Libro("pepe", "pene", 20, 10, "santa", 2020);
        
        System.out.println(milibro.muestra_libro());
        System.out.println("La editorial es santa?: " + milibro.editadorial_libro_igual("santa"));
        System.out.println("La editorial es otra?: " + milibro.editadorial_libro_igual("otra"));
        milibro.muestra_autor_titulo();
        System.out.println("El precio actual es este" + milibro.getPrecio());
        milibro.setPrecio(55);
        System.out.println("El precio actual después de modificarlo es este" + milibro.getPrecio());
          System.out.println("El stock actual es: " + milibro.getStock());
        milibro.modificar_stock(5);
        System.out.println("Se va a modificar el stock...");
        milibro.modificar_stock(6);
        
     }
}
