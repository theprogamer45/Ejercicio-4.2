/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;


public class Vivienda extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroBaños;  

    

public Vivienda(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
       super(identificadorInmobiliario, area, direccion); 
       this.numeroHabitaciones = numeroHabitaciones;
       this.numeroBaños = numeroBaños;
    }
    void imprimir() {
        super.imprimir(); 
        System.out.println("Numero de habitaciones = " + numeroHabitaciones);
        System.out.println("Numero de baños = " + numeroBaños);
    }
}


