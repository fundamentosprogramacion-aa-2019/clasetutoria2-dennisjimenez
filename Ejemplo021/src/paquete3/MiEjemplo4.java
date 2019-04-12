package paquete3;

import java.util.Scanner;

/**
 * * @author dennisjimenez
 */
public class MiEjemplo4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, ciudad;
        int edad;
        double nota1, nota2, promedio;
        
        System.out.println("Ingrese su nombre y apellido por favor: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad por favor: ");
        edad = entrada.nextInt();
        System.out.println("Ingrese sus notas por favor ");
        System.out.println("Nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Nota 2: ");
        nota2 = entrada.nextDouble();
        entrada.nextLine();
        promedio = (nota1+nota2)/2;
        System.out.println("Ingrese su ciudad por favor: ");
        ciudad = entrada.nextLine();
        
        System.out.printf("\nMi nombre es: %s\nMi edad es: %d años\nMis notas "
                + "son: \nNota 1: %.2f puntos\nNota 2: %.2f puntos\nMi "
                + "promedio es: %.2f puntos\nMi ciudad es: %s", nombre, edad,
                nota1, nota2, promedio,ciudad);
    }    
}
