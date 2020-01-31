/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;



/**
 *
 * @author ITP1DAM
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner ti = new Scanner (System.in);
        Scanner td = new Scanner (System.in);
        Scanner ts = new Scanner (System.in);

        Alumno alu1 = new Alumno();

        System.out.println("Nombre del alumno:");
        String nombre = ts.nextLine();
        alu1.setNombre(nombre);

        try 
        {    
            alu1.pedirNotas();
        } 
        catch (RangoException error)     
        {
            System.out.println("Error.Posicion fuera de la lista.");
        }
        
        alu1.imprimirCalificaciones();
    }
    
}
