/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author ITP1DAM
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IndexOutOfBoundsException 
    {
        
        Scanner ti = new Scanner (System.in);
        Scanner td = new Scanner (System.in);
        Scanner ts = new Scanner (System.in);
        
        Alumno alu1 = new Alumno();
        
        
        System.out.println("Nombre del alumno:");
        String nombre = ts.nextLine();
        alu1.setNombre(nombre);
        boolean parar = false;
        
        while (parar = false)
        {
            System.out.println("Opciones del alumno: " + alu1.getNombre());
            System.out.println("1. Pedir notas \n 2. Modificar una nota (por posición) \n 3. Imprimir notas \n 4. Finalizar");
            int boton = ti.nextInt();

            switch (boton)
            {
                case 1:
                    try 
                    {    
                        alu1.pedirNotas();
                    } 
                    catch (RangoException error)     
                    {
                        System.out.println("Error. Nota fuera del rango.");
                    }
                    break;

                case 2:
                    System.out.println("Posición de la nota a modificar:");
                    int posicion = ti.nextInt();
                    System.out.println("Nueva nota:");
                    double nota = td.nextDouble();
                    try 
                    {
                        alu1.modificarNota(posicion, nota);
                    } 
                    catch (RangoException error) 
                    {
                        System.out.println("Posicion seleccionada fuera del rango");
                    }
                    break;
                
                case 3:
                    


            } 
        }
        
        
        
        
        
        alu1.imprimirCalificaciones();
    }
    
}
