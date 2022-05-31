/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contenido;

import Funciones.funcionesBBDD;
import Persona.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author imba
 */
public class ContenidoIntermedio {

    int idUser, idContenido;
    double puntuacion;
    String comentario;

    public ContenidoIntermedio() {

    }

    public ContenidoIntermedio(int ic, double pun, String co) {
        this.comentario = co;
        this.idContenido = ic;
        this.puntuacion = pun;
    }

    public int getIdUser() {
        return this.idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdContenido() {
        return this.idContenido;
    }

    public void setIdContenido(int idContenido) {
        this.idContenido = idContenido;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public static DefaultTableModel mostrarContenidoPerfil() {
        String[] nombresColumnas = {"Nombre", "Puntuacion", "Comentario"};
        String[] registros = new String[3];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        String user = Usuario.userArray[0].getAlias();
        System.out.println(user);
        String sql = "select contenido.Nombre,Puntuacion,Comentario from usuariovaloracontenido inner join contenido on idContenido=contenido.id inner join usuarios on idUsuario=usuarios.Id where usuarios.Alias like \"" + user + "\"";
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            cn = funcionesBBDD.connect();
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("Nombre");
                registros[1] = rs.getString("Puntuacion");
                registros[2] = rs.getString("Comentario");
                modelo.addRow(registros);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return modelo;
    }

    public static DefaultTableModel mostrarComentariosContenido(String contenido) {
        String[] nombresColumnas = {"Usuario","Puntuacion", "Comentario"};
        String[] registros = new String[3];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        String sql = "select usuarios.Alias,Puntuacion,Comentario from usuariovaloracontenido inner join contenido on idContenido=contenido.id inner join usuarios on idUsuario=usuarios.Id ";
        Connection cn = funcionesBBDD.connect();;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("Alias");
                registros[1] = rs.getString("Puntuacion");
                registros[2] = rs.getString("Comentario");
                modelo.addRow(registros);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return modelo;
    }
}
