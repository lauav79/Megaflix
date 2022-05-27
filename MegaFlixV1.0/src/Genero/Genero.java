/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Genero;

/**
 *
 * @author Laura Álvarez
 */
public class Genero {
    private int idgenero;
    private String nombre;
    
    public Genero(int id, String nombre){
        this.idgenero=id;
        this.nombre=nombre;
    }

    public int getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(int idgenero) {
        this.idgenero = idgenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * 
     * @return String de nombre e id del genero
     */
    @Override
    public String toString() {
        String generoIdNombre=""+idgenero+"-"+nombre;
        return generoIdNombre;
    }
    
}
