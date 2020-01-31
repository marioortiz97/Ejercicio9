/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 * Excepción que controla el rango de notas válidas para un alumno.
 * @author Mario Ortiz Gamiz
 */
public class RangoException extends Exception
{
    /**
     * Constructor de la excepción
     * @param message 
     */
    public RangoException(String message) 
    {
        super(message);
    }
    
}
