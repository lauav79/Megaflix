/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Genero;

/**
 *
 * @author Laura Álvarez
 */
public class GeneroContenido {
    private String nombreGen;
    private  int idGenCon,idCont,idGen;
    
    public GeneroContenido(String nombreG,int idGC,int idC,int idG){
        this.nombreGen=nombreG;
        this.idCont=idC;
        this.idGen=idG;
        this.idGenCon=idGC;
    }

    public String getNombreGen() {
        return nombreGen;
    }

    public void setNombreGen(String nombreGen) {
        this.nombreGen = nombreGen;
    }

    public int getIdGenCon() {
        return idGenCon;
    }

    public void setIdGenCon(int idGenCon) {
        this.idGenCon = idGenCon;
    }

    public int getIdCont() {
        return idCont;
    }

    public void setIdCont(int idCont) {
        this.idCont = idCont;
    }

    public int getIdGen() {
        return idGen;
    }

    public void setIdGen(int idGen) {
        this.idGen = idGen;
    }
    
    
    
    
}
