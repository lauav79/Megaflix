/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;

import Contenido.ContenidoIntermedio;
import Funciones.funcionesBBDDvIan;
import Persona.Usuario;
import funciones.FuncionesBBDD;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author imba
 */
public final class PerfilJFrame extends javax.swing.JFrame {
    
    public static PerfilJFrame perfil1 = new PerfilJFrame();
    
    int x, y, xMouse, yMouse;

    /**
     * Creates new form PerfilJFrame
     */
    public PerfilJFrame() {
        initComponents();
        imagenPerfil.setIcon(new ImageIcon(Usuario.user1.getImagen()));
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
        nombreContenido = new javax.swing.JTextField();
        cambiarContrasena = new javax.swing.JButton();
        eliminarCuenta = new javax.swing.JButton();
        cambiarAlias = new javax.swing.JButton();
        nombreUser = new javax.swing.JLabel();
        imagenPerfil = new javax.swing.JLabel();
        gestionarContenidoBoton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        nombreContenido1 = new javax.swing.JTextField();
        perfil = new javax.swing.JButton();
        paginaPrincipal = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
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

        nombreContenido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombreContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreContenidoActionPerformed(evt);
            }
        });
        jPanel4.add(nombreContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 290, 30));

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

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 70, 30));

        nombreContenido1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombreContenido1.setBorder(null);
        nombreContenido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreContenido1ActionPerformed(evt);
            }
        });
        jPanel4.add(nombreContenido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 240, 30));

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

    private void nombreContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreContenidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreContenidoActionPerformed

    private void cambiarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarContrasenaActionPerformed
        CambioContraseña.c1.setVisible(true);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            int idContenido=FuncionesBBDD.getIdCont(nombreContenido.getText());
            int idUsuario = Usuario.user1.getId();
            if (idContenido!=0){
            PaginaPeliV1 p2 = new PaginaPeliV1(idContenido, idUsuario);
            p2.setVisible(true);
            dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Ese contenido no existe, intentelo de nuevo");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombreContenido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreContenido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreContenido1ActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        dispose();
        PerfilJFrame.perfil1.setVisible(true);
    }//GEN-LAST:event_perfilActionPerformed

    private void paginaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaPrincipalActionPerformed
        dispose(); // TODO add your handling code here:
        Principal.prin1.setVisible(true);
    }//GEN-LAST:event_paginaPrincipalActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        dispose();
        LoginJFrame l1= new LoginJFrame();
        l1.setVisible(true);
        Usuario.vaciarUsuario();
        funcionesBBDDvIan.close();
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
        funcionesBBDDvIan.loadDriver();
        funcionesBBDDvIan.connect();
        funcionesBBDDvIan.isConnected();
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
    private javax.swing.JButton cambiarAlias;
    private javax.swing.JButton cambiarContrasena;
    private javax.swing.JLabel cerrarPrograma;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton eliminarCuenta;
    private javax.swing.JButton gestionarContenidoBoton;
    private javax.swing.JLabel imagenColorFondo;
    private javax.swing.JLabel imagenColorFondo2;
    private javax.swing.JLabel imagenPerfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreContenido;
    private javax.swing.JTextField nombreContenido1;
    private javax.swing.JLabel nombreUser;
    private javax.swing.JButton paginaPrincipal;
    private javax.swing.JButton perfil;
    private javax.swing.ButtonGroup seleccionContenido;
    // End of variables declaration//GEN-END:variables
}
