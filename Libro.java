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
//Creamos la clase que es el formulario en blanco el cual presenta los campos que luego rellenaremos
public class Libro {
    private String título;
    private String autor;
    private double precio;
    private int stock;
    private String editorial;
    private int año;

    //Creamos el constructor el cual rellenara nuestro formulario clase
    public Libro (String título, String autor, double precio, int stock, String editorial, int año){
       this.autor = autor;
       this.precio = precio;
       this.stock = stock;
       this.título = título;
       this.editorial = editorial;
       this.año = año;
    }
    //Creamos el 2 constructor el cual ya tiene parámetros y hereda los campos del 1Constructoro pero rellena
    //con parámetros
    public Libro (){
       this.autor = "";
       this.precio = 0;
       this.stock = 0;
       this.título = "";
       this.editorial = "";
       this.año = 0;
    }
    //Método que nos muestra la información del libro
    public String muestra_libro(){
        return ("Libro: " + this.autor + " Precio: " + this.precio + " Stock: " + this.stock + " Título: " + 
               this.título + " Editorial: " + this.editorial + " Año: " +this.año);
    }    
    //Método que solo nos muestra el título y el autor
    public void muestra_autor_titulo(){
        System.out.println("Título: " +this.título);
        System.out.println("Libro: " +this.autor);
    }
    //Creamos un metodo get para obtener el precio 
    public double getPrecio() {
        return precio;
    }
    //Método por el cual obtenemos
    public int getStock(){
        return stock;
    }
    
    //Creamos un método set para modificar el precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //Creo un metrodo el cual nos indicara mediante un booleano si se ha editado 
    public boolean editadorial_libro_igual(String editorial){
        if (this.editorial != editorial){
              return false;
        }
        return true;
    }
    // Método que nos actualiza el stock de los libros
    public void modificar_stock(int stock){
        this.stock -= stock;
        
        if (this.stock<0){
            System.out.println("Venta de libro realizado, stock actualizado es: -1 ");  
        }else{
            System.out.println("Venta de libro realizado, stock actual es: " +this.stock);
        }
            
    }   
}
