/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;

import Contenido.ContenidoIntermedio;
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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author imba
 */
public final class PerfilJFrame extends javax.swing.JFrame {


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

    private void asignarDatos() {
        getContenidos().stream().forEach((star) -> {
            defaultListmodel.addElement(star);
        });
        listaContenidos.setModel(defaultListmodel);
        listaContenidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

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
    int x, y, xMouse, yMouse;

    /**
     * Creates new form PerfilJFrame
     */
    public PerfilJFrame() {
        initComponents();
        busquedaContenido.setVisible(false);
        imagenPerfil.setIcon(new ImageIcon(Usuario.user1.getImagen()));
        nUser.setText(Usuario.user1.getAlias());
        gestionarContenidoBoton.setVisible(false);
        mostrarContenido();
        if (Usuario.user1.getTipoUser().equals("Admin")) {
            gestionarContenidoBoton.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccionContenido = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        cambiarContrasena = new javax.swing.JButton();
        eliminarCuenta = new javax.swing.JButton();
        cambiarAlias = new javax.swing.JButton();
        nombreUser = new javax.swing.JLabel();
        imagenPerfil = new javax.swing.JLabel();
        gestionarContenidoBoton = new javax.swing.JButton();
        busquedaContenido = new javax.swing.JScrollPane();
        listaContenidos = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        perfil = new javax.swing.JButton();
        paginaPrincipal = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        nombreContenido = new javax.swing.JTextField();
        nUser = new javax.swing.JLabel();
        cerrarPrograma = new javax.swing.JLabel();
        imagenColorFondo2 = new javax.swing.JLabel();
        imagenColorFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(840, 500));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cambiarContrasena.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cambiarContrasena.setText("Cambiar Contraseña");
        cambiarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarContrasenaActionPerformed(evt);
            }
        });
        jPanel4.add(cambiarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 220, -1));

        eliminarCuenta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        eliminarCuenta.setText("Eliminar Cuenta");
        jPanel4.add(eliminarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 220, -1));

        cambiarAlias.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cambiarAlias.setText("Cambiar Nombre Usuario");
        cambiarAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarAliasActionPerformed(evt);
            }
        });
        jPanel4.add(cambiarAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 220, -1));
        jPanel4.add(nombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 220, 20));

        imagenPerfil.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        imagenPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(imagenPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, 200));

        gestionarContenidoBoton.setText("Gestionar Contenido");
        gestionarContenidoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarContenidoBotonActionPerformed(evt);
            }
        });
        jPanel4.add(gestionarContenidoBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 190, 40));

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

        jPanel4.add(busquedaContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 360, 100));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre Pelicula", "Valoración", "Comentario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 640, 490));

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
        jPanel4.add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 110, 50));

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
        jPanel4.add(paginaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

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
        jPanel4.add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 130, 50));

        nombreContenido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombreContenido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
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
        jPanel4.add(nombreContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 360, 30));

        nUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(nUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 220, 40));

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
        jPanel4.add(cerrarPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 50, 50));

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
        jPanel4.add(imagenColorFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 50));

        imagenColorFondo.setBackground(new java.awt.Color(153, 0, 0));
        imagenColorFondo.setOpaque(true);
        jPanel4.add(imagenColorFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 280, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarContrasenaActionPerformed
        CambioContraseña c1= new CambioContraseña();
        c1.setVisible(true);
    }//GEN-LAST:event_cambiarContrasenaActionPerformed

    private void cambiarAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarAliasActionPerformed
        CambiarUsuario.cUser1.setVisible(true);
    }//GEN-LAST:event_cambiarAliasActionPerformed

    private void gestionarContenidoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarContenidoBotonActionPerformed
        try {
            GestorContenidoMain g1 = new GestorContenidoMain(Usuario.user1.getAlias());
            g1.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PerfilJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_gestionarContenidoBotonActionPerformed

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

    private void imagenColorFondo2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenColorFondo2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_imagenColorFondo2MouseDragged

    private void imagenColorFondo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenColorFondo2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_imagenColorFondo2MousePressed

    private void nombreContenidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreContenidoMouseClicked
        listaContenidos.setVisible(true);
        busquedaContenido.setVisible(true);

    }//GEN-LAST:event_nombreContenidoMouseClicked

    private void nombreContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreContenidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreContenidoActionPerformed

    private void nombreContenidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreContenidoKeyReleased
        contenidoFiltrado(nombreContenido.getText());
    }//GEN-LAST:event_nombreContenidoKeyReleased

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
    public void mostrarContenido() {
        ContenidoIntermedio c1 = new ContenidoIntermedio();
        DefaultTableModel modelo = ContenidoIntermedio.mostrarTablaPerfil();
        jTable1.setModel(modelo);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PerfilJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane busquedaContenido;
    private javax.swing.JButton cambiarAlias;
    private javax.swing.JButton cambiarContrasena;
    private javax.swing.JLabel cerrarPrograma;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton eliminarCuenta;
    private javax.swing.JButton gestionarContenidoBoton;
    private javax.swing.JLabel imagenColorFondo;
    private javax.swing.JLabel imagenColorFondo2;
    private javax.swing.JLabel imagenPerfil;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> listaContenidos;
    private javax.swing.JLabel nUser;
    private javax.swing.JTextField nombreContenido;
    private javax.swing.JLabel nombreUser;
    private javax.swing.JButton paginaPrincipal;
    private javax.swing.JButton perfil;
    private javax.swing.ButtonGroup seleccionContenido;
    // End of variables declaration//GEN-END:variables
}
