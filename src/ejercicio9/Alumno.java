/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.ArrayList;



/**
 * 
 * @author ITP1DAM
 */
public class Alumno 
{
    public static int num_asignaturas = 5;
    private String nombre;
    private ArrayList <Double> notas;
    
    
    public Alumno() 
    {
        notas = new ArrayList<>();
    }
    
    
    public Alumno(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public String getNombre() 
    {
        return nombre;
    }
    
    
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    
}
