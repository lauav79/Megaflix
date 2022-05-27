/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contenido;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

/**
 *
 * @author admin
 */
public class Contenido {

    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "3307";
    private static final String DB_NAME = "megaflix";
    private static final String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME + "?serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "1231";

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
    public static Contenido con1 = new Contenido();
    public static Contenido con2 = new Contenido();
    public static Contenido con3 = new Contenido();

    public static Contenido recogerContenido() {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            String SQL = "SELECT * FROM `contenido` inner join usuariovaloracontenido on contenido.id= idContenido order by `Puntuacion` desc limit 3";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("Nombre");
                String dir = rs.getString("Director");
                String des = rs.getString("Descripcion");
                String dur = rs.getString("Duracion");
                String tCon = rs.getString("Tipo");
                int tem = rs.getInt("Temporadas");
                String img = rs.getString("Imagen");
                con1.setId(id);
                con1.setNombre(nom);
                con1.setDescripcion(des);
                con1.setDirector(dir);
                con1.setDescripcion(des);
                con1.setDuracion(dur);
                con1.setTipoContenido(tCon);
                con1.setTemporadas(tem);
                con1.setImagen(img);
                rs.next();
                con2.setId(id);
                con2.setNombre(nom);
                con2.setDescripcion(des);
                con2.setDirector(dir);
                con2.setDescripcion(des);
                con2.setDuracion(dur);
                con2.setTipoContenido(tCon);
                con2.setTemporadas(tem);
                con2.setImagen(img);
                rs.next();
                con3.setId(id);
                con3.setNombre(nom);
                con3.setDescripcion(des);
                con3.setDirector(dir);
                con3.setDescripcion(des);
                con3.setDuracion(dur);
                con3.setTipoContenido(tCon);
                con3.setTemporadas(tem);
                con3.setImagen(img);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
