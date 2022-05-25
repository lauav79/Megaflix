/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

import Persona.Persona;

/**
 *
 * @author admin
 */
public class Usuario extends Persona {

    int id;
    public static String nombre, alias, passw, biogra, tipoUser;

    public Usuario() {

    }

    public Usuario(int i, String n, String a, String p, String b, String t) {
        this.id = i;
        this.nombre = n;
        this.alias = a;
        this.passw = p;
        this.biogra = b;
        this.tipoUser = t;

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

    public static String getAlias() {
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

}
