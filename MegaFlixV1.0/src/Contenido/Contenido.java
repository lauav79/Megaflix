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
    public static Contenido con1 = new Contenido();
    public static Contenido con2 = new Contenido();
    public static Contenido con3 = new Contenido();
    public static int id, temporadas;
    public static String nombre, director, descripcion, duracion, tipoContenido, imagen;

    public Contenido() {

    }

    public Contenido(int id, String nom, String dir, String des, int tem, String dur, String ima, String tipo) {
        this.id = id;
        this.nombre = nom;
        this.director = dir;
        this.descripcion = des;
        this.duracion = dur;
        this.tipoContenido = tipo;
        this.imagen = ima;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public static String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public static String getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(String tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
