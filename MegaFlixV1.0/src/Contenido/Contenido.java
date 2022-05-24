/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contenido;

/**
 *
 * @author admin
 */

public class Contenido {
    
    String Nombre,Director,Tipo,Descripcion,Duracion,Imagen;
    int Id, Temporadas;
    //Constructor
    public Contenido(String Nombre, String Director, String Tipo, String Descripcion, String Duracion, String Imagen, int Id, int Temporadas) {
        this.Nombre = Nombre;
        this.Director = Director;
        this.Tipo = Tipo;
        this.Descripcion = Descripcion;
        this.Duracion = Duracion;
        this.Imagen = Imagen;
        this.Id = Id;
        this.Temporadas = Temporadas;
    }
    //Segundo constructor
    public Contenido(String Nombre, String Tipo, String Descripcion, String Imagen) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Descripcion = Descripcion;
        this.Imagen = Imagen;
    }
   
    //Getters y Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(int Temporadas) {
        this.Temporadas = Temporadas;
    }
    
    
}
    
    

  
