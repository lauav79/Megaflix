/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;

import Contenido.Contenido;
import Persona.Usuario;
import funciones.FuncionesBBDD;
import static funciones.FuncionesBBDD.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;

/**
 *
 * @author imba
 */
public class Principal extends javax.swing.JFrame {

    static int xMouse, yMouse, x, y;
    PaginaPeliV1 p2 = null;
    DefaultListModel defaultListmodel = new DefaultListModel();

    private ArrayList getContenidos() {
        ArrayList<String> stars = new ArrayList<String>();
        try {
            Connection conn = connect2();
            String SQL = "SELECT Nombre FROM `contenido`";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                String nom = rs.getString("Nombre");
                stars.add(nom);
            }
        } catch (SQLException ex) {
        }

        return stars;
    }

    @SuppressWarnings("unchecked")
    private void contenidoFiltrado(String searchTerm) {
        DefaultListModel filtrado = new DefaultListModel<>();
        ArrayList stars = getContenidos();
        stars.stream().forEach((star) -> {
            String starName = star.toString().toLowerCase();
            if (starName.contains(searchTerm.toLowerCase())) {
                filtrado.addElement(star);
            }
        });
        defaultListmodel = filtrado;
        listaContenidos.setModel(defaultListmodel);

    }

    public Principal() {
        Contenido.recogerContenidoTop3();

        initComponents();
        
        busquedaContenido.setVisible(false);
        listaContenidos.setVisible(false);
        imagen1.setIcon(new ImageIcon(Contenido.c1[0].getImagen()));
        imagen2.setIcon(new ImageIcon(Contenido.c1[1].getImagen()));
        imagen3.setIcon(new ImageIcon(Contenido.c1[2].getImagen()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        imagen1 = new javax.swing.JLabel();
        imagen3 = new javax.swing.JLabel();
        imagen2 = new javax.swing.JLabel();
        busquedaContenido = new javax.swing.JScrollPane();
        listaContenidos = new javax.swing.JList<>();
        nombreContenido = new javax.swing.JTextField();
        perfil = new javax.swing.JButton();
        paginaPrincipal = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        cerrarPrograma = new javax.swing.JLabel();
        imagenColorFondo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pagina Principal");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagen1.setBackground(new java.awt.Color(0, 0, 0));
        imagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen1.setOpaque(true);
        imagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen1MouseClicked(evt);
            }
        });
        jPanel2.add(imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 170, 240));

        imagen3.setBackground(new java.awt.Color(0, 0, 0));
        imagen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen3.setOpaque(true);
        imagen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen3MouseClicked(evt);
            }
        });
        jPanel2.add(imagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 170, 240));

        imagen2.setBackground(new java.awt.Color(0, 0, 0));
        imagen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen2.setOpaque(true);
        imagen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen2MouseClicked(evt);
            }
        });
        jPanel2.add(imagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 170, 240));

        listaContenidos.setVisible(false);
        listaContenidos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaContenidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaContenidosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listaContenidosMouseExited(evt);
            }
        });
        busquedaContenido.setViewportView(listaContenidos);

        jPanel2.add(busquedaContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 360, 100));

        nombreContenido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombreContenido.setBorder(null);
        nombreContenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreContenidoMouseClicked(evt);
            }
        });
        nombreContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreContenidoActionPerformed(evt);
            }
        });
        nombreContenido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreContenidoKeyReleased(evt);
            }
        });
        jPanel2.add(nombreContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 360, 30));

        perfil.setBackground(new java.awt.Color(0, 0, 0));
        perfil.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        perfil.setForeground(new java.awt.Color(255, 255, 255));
        perfil.setText("Perfil");
        perfil.setBorder(null);
        perfil.setBorderPainted(false);
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });
        jPanel2.add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 110, 50));

        paginaPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        paginaPrincipal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        paginaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        paginaPrincipal.setText("Pagina Principal");
        paginaPrincipal.setBorder(null);
        paginaPrincipal.setBorderPainted(false);
        paginaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paginaPrincipalActionPerformed(evt);
            }
        });
        jPanel2.add(paginaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

        cerrarSesion.setBackground(new java.awt.Color(0, 0, 0));
        cerrarSesion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.setBorder(null);
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 130, 50));

        cerrarPrograma.setBackground(new java.awt.Color(153, 0, 0));
        cerrarPrograma.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        cerrarPrograma.setForeground(new java.awt.Color(255, 255, 255));
        cerrarPrograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarPrograma.setText("X");
        cerrarPrograma.setOpaque(true);
        cerrarPrograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarProgramaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarProgramaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarProgramaMouseExited(evt);
            }
        });
        jPanel2.add(cerrarPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 50, 50));

        imagenColorFondo2.setBackground(new java.awt.Color(153, 0, 0));
        imagenColorFondo2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        imagenColorFondo2.setOpaque(true);
        imagenColorFondo2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                imagenColorFondo2MouseDragged(evt);
            }
        });
        imagenColorFondo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imagenColorFondo2MousePressed(evt);
            }
        });
        jPanel2.add(imagenColorFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("TOP 3 CONTENIDO RECOMEDADO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 610, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void imagenColorFondo2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenColorFondo2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_imagenColorFondo2MouseDragged

    private void imagenColorFondo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenColorFondo2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_imagenColorFondo2MousePressed

    private void nombreContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreContenidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreContenidoActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        dispose();
        PerfilJFrame p1 = new PerfilJFrame();
        p1.setVisible(true);
    }//GEN-LAST:event_perfilActionPerformed

    private void paginaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaPrincipalActionPerformed
        dispose(); // TODO add your handling code here:
        Principal p1 = new Principal();
        p1.setVisible(true);
    }//GEN-LAST:event_paginaPrincipalActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        dispose();
        LoginJFrame l1 = new LoginJFrame();
        l1.setVisible(true);
        Usuario.vaciarUsuario();
        close();
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void cerrarProgramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarProgramaMouseClicked
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_cerrarProgramaMouseClicked

    private void cerrarProgramaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarProgramaMouseEntered
        cerrarPrograma.setBackground(new Color(230, 0, 0));
        cerrarPrograma.setForeground(Color.black);
    }//GEN-LAST:event_cerrarProgramaMouseEntered

    private void cerrarProgramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarProgramaMouseExited
        cerrarPrograma.setBackground(new Color(153, 0, 0));
        cerrarPrograma.setForeground(Color.white);
    }//GEN-LAST:event_cerrarProgramaMouseExited

    private void imagen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen1MouseClicked
        dispose();
        try {
            int idContenido = Contenido.c1[0].getId();
            int idUsuario = Usuario.user1.getId();
            p2 = new PaginaPeliV1(idContenido, idUsuario);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        p2.setVisible(true);


    }//GEN-LAST:event_imagen1MouseClicked

    private void imagen2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen2MouseClicked
        dispose();
        try {
            int idContenido = Contenido.c1[1].getId();
            int idUsuario = Usuario.user1.getId();
            p2 = new PaginaPeliV1(idContenido, idUsuario);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        p2.setVisible(true);

    }//GEN-LAST:event_imagen2MouseClicked

    private void imagen3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen3MouseClicked
        dispose();
        try {
            int idContenido = Contenido.c1[2].getId();
            int idUsuario = Usuario.user1.getId();
            p2 = new PaginaPeliV1(idContenido, idUsuario);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        p2.setVisible(true);

    }//GEN-LAST:event_imagen3MouseClicked

    private void nombreContenidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreContenidoKeyReleased
        contenidoFiltrado(nombreContenido.getText());
    }//GEN-LAST:event_nombreContenidoKeyReleased

    private void nombreContenidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreContenidoMouseClicked
        listaContenidos.setVisible(true);
        busquedaContenido.setVisible(true);


    }//GEN-LAST:event_nombreContenidoMouseClicked

    private void listaContenidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaContenidosMouseClicked
        //JOptionPane.showMessageDialog(rootPane,listaContenidos.getSelectedValue(),"Nombre Elegido",JOptionPane.INFORMATION_MESSAGE);
        String Peli = new String(listaContenidos.getSelectedValue());
        System.out.println(Peli);
        int idPeli = FuncionesBBDD.getIdCont(Peli);
        try {
            PaginaPeliV1 p1 = new PaginaPeliV1(idPeli, Usuario.user1.getId());
            dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listaContenidosMouseClicked

    private void listaContenidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaContenidosMouseExited
        busquedaContenido.setVisible(false);
    }//GEN-LAST:event_listaContenidosMouseExited

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane busquedaContenido;
    private javax.swing.JLabel cerrarPrograma;
    private javax.swing.JButton cerrarSesion;
    private static javax.swing.JLabel imagen1;
    private static javax.swing.JLabel imagen2;
    private static javax.swing.JLabel imagen3;
    private javax.swing.JLabel imagenColorFondo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JList<String> listaContenidos;
    private javax.swing.JTextField nombreContenido;
    private javax.swing.JButton paginaPrincipal;
    private javax.swing.JButton perfil;
    // End of variables declaration//GEN-END:variables
}
