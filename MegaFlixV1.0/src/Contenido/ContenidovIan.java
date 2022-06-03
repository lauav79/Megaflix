/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contenido;

import static funciones.FuncionesBBDD.connect2;
import java.lang.reflect.Array;
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
public class ContenidovIan {

    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "3307";
    private static final String DB_NAME = "megaflix";
    private static final String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME + "?serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "1231";

    public int id, temporadas;
    public String nombre, director, descripcion, duracion, tipoContenido, imagen;

    public ContenidovIan() {

    }

    public ContenidovIan(int id, String nom, String dir, String des, int tem, String dur, String ima, String tipo) {
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

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getNombre() {
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

    public String getDescripcion() {
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

    public String getTipoContenido() {
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

    public static ContenidovIan[] c1 = new ContenidovIan[3];

    public static ContenidovIan[] recogerContenidoTop3() {
        try {
            Connection conn = connect2();
            String SQL = "SELECT DISTINCT usuariovaloracontenido.idUsuario,contenido.id,AVG(Puntuacion)as media, Director,Nombre,Imagen,Descripcion,Temporadas,Duracion,Tipo  FROM `contenido` inner join usuariovaloracontenido on contenido.id= idContenido group by contenido.id  order by `media` desc limit 3";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            int i = 0;
            while (rs.next()) {
                ContenidovIan con1 = new ContenidovIan();
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
                c1[i] = con1;
                i++;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static ContenidovIan contenidoGeneral(String nombreCont) {
        ContenidovIan cong = new ContenidovIan();
        try {
            Connection conn = connect2();
            String SQL = "SELECT * FROM `contenido` WHERE `Nombre` LIKE \"" + nombreCont + "\"";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            int i = 0;
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("Nombre");
                String dir = rs.getString("Director");
                String des = rs.getString("Descripcion");
                int tem = rs.getInt("Temporadas");
                String dur = rs.getString("Duracion");
                String img = rs.getString("Imagen");
                String tCon = rs.getString("Tipo");
                cong.setId(id);
                cong.setNombre(nom);
                cong.setDescripcion(des);
                cong.setDirector(dir);
                cong.setDescripcion(des);
                cong.setDuracion(dur);
                cong.setTipoContenido(tCon);
                cong.setTemporadas(tem);
                cong.setImagen(img);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cong;
    }
    
       @Override
    public String toString() {
        //return "Contenido{" + "Nombre=" + Nombre + ", Id=" + Id + '}';
        String contenidoIdNombre=""+id+"-"+nombre;
        return contenidoIdNombre;
    }

}
