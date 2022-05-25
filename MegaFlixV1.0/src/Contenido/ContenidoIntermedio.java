/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contenido;

/**
 *
 * @author imba
 */
public class ContenidoIntermedio {
    static int  idUser,idContenido;
    static double puntuacion;
    static String comentario;
    
    public ContenidoIntermedio(){
        
    }
    public ContenidoIntermedio(int iu, int ic, double pun, String co){
        this.comentario=co;
        this.idContenido=ic;
        this.idUser=iu;
        this.puntuacion=pun;
    }

    public static int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public static int getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(int idContenido) {
        this.idContenido = idContenido;
    }

    public static double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public static String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
