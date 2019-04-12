/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Salas
 */
public class MiEjemplo2 {
    
    public static void main(String[] args) {
        // este método es el principal de mi clase
        String nombrePersona; // es la variable para almacenar un nombre
        String apellidoPersona; 
        int edad;
        nombrePersona = "Dennis Leonardo";
        apellidoPersona = "Jiménez Chalán";
        edad = 22;
        /**
        System.out.println("Mi nombre es: "+ nombrePersona +"\n\n\tMi apellido "
                + "es: "+ apellidoPersona);
        */
        System.out.printf("Mi nombre es: %s\nMi apellido es: %s\nMi edad es: %s",
                nombrePersona, apellidoPersona, edad);
    }
    
}
