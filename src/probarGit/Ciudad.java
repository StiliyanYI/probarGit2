/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probarGit;

/**
 *
 * @author alumno
 */
public class Ciudad {
    //Atributos
    private String nombre;
    private int poblacion;
    
    //Constructor
    public Ciudad(String nombre, int poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public String toString() {
        return nombre;
    }
    
    //Getters && setters

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    
    
    
}
