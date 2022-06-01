/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author admin
 */
public class Usuario extends Persona {

    public static Usuario user1 = new Usuario();
    public int id;
    public String nombre, alias, passw, biogra, tipoUser, imagen;

    public Usuario() {

    }

    public Usuario(int i, String n, String a, String p, String b, String t, String imagen) {
        this.id = i;
        this.nombre = n;
        this.alias = a;
        this.passw = p;
        this.biogra = b;
        this.tipoUser = t;
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getBiogra() {
        return biogra;
    }

    public void setBiogra(String biogra) {
        this.biogra = biogra;
    }

    public String getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }

    public static void vaciarUsuario() {
        user1.setAlias(null);
        user1.setBiogra(null);
        user1.setId(0);
        user1.setImagen(null);
        user1.setNombre(null);
        user1.setPassw(null);
        user1.setTipoUser(null);
    }
}
