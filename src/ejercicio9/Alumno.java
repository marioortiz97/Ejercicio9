/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;



/**
 * Clase que recoge el nombre y las notas de un alumno
 * @author Mario Ortiz Gámiz
 */
public class Alumno 
{
    public static int num_asignaturas = 5;
    private String nombre;
    private ArrayList <Double> notas;
    
    
    /**
     * Constructor por defecto
     */
    public Alumno() 
    {
        notas = new ArrayList<>();
    }
    
    /**
     * Constructor con parámetros
     * @param nombre parametro que recibe el nombre del alumno
     */
    public Alumno(String nombre) 
    {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene el nombre del alumno
     * @return devuelve el nombre
     */
    public String getNombre() 
    {
        return nombre;
    }
    
    /**
     * Modifica el nombre del alumno
     * @param nombre parametro que recibe como nombre del alumno
     */
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    /**
     * Pide las notas de los alumnos y las añade al array
     * @throws RangoException 
     */
    public void pedirNotas() throws RangoException
    {
        Scanner td = new Scanner (System.in);
        
        for (int i = 0; i < num_asignaturas; i++) 
        {
            System.out.println("Introduce la nota ");
            double nota = td.nextDouble();
            if (nota < 0 || nota > 10)
            {
                throw new RangoException ("Error. Nota no válida. \n Abortando ejecución...");
            }
            else
            {
                notas.add(nota);
            }
            
        }
    }
    
    /**
     * Modifica una nota del array
     * @param posicion posicion de la nota a modificar
     * @param nnota modificación de la nota
     * @throws RangoException
     * @throws java.lang.IndexOutOfBoundsException 
     */
    public void modificarNota(int posicion, double nnota) throws RangoException, java.lang.IndexOutOfBoundsException
    {
        notas.set(posicion, nnota);
    }
    
    /**
     * Imprime por pantalla las calificaciones
     */
    public void imprimirCalificaciones()
    {
        
        System.out.println(notas);
    }
}
