/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;

import Contenido.ContenidovIan;
import Funciones.funcionesBBDDvIan;
import Persona.Usuario;
import funciones.FuncionesBBDD;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author imba
 */
public class Principal extends javax.swing.JFrame {

    public static Principal prin1 = new Principal();
    static int xMouse, yMouse, x, y;
    PaginaPeliV1 p2 = null;

    public Principal() {
        initComponents();
        imagen1.setIcon(new ImageIcon(ContenidovIan.c1[0].getImagen()));
        imagen2.setIcon(new ImageIcon(ContenidovIan.c1[1].getImagen()));
        imagen3.setIcon(new ImageIcon(ContenidovIan.c1[2].getImagen()));

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
        ver3 = new javax.swing.JButton();
        ver1 = new javax.swing.JButton();
        ver2 = new javax.swing.JButton();
        imagen1 = new javax.swing.JLabel();
        imagen3 = new javax.swing.JLabel();
        imagen2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nombreContenido = new javax.swing.JTextField();
        perfil = new javax.swing.JButton();
        paginaPrincipal = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        cerrarSesion = new javax.swing.JButton();
        cerrarPrograma = new javax.swing.JLabel();
        imagenColorFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pagina Principal");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ver3.setText("Ver");
        ver3.setBorder(null);
        jPanel2.add(ver3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 70, -1));

        ver1.setText("Ver");
        ver1.setBorder(null);
        jPanel2.add(ver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 70, -1));

        ver2.setText("Ver");
        ver2.setBorder(null);
        ver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver2ActionPerformed(evt);
            }
        });
        jPanel2.add(ver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 80, -1));

        imagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen1MouseClicked(evt);
            }
        });
        jPanel2.add(imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 170, 240));

        imagen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen3MouseClicked(evt);
            }
        });
        jPanel2.add(imagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 170, 240));

        imagen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen2MouseClicked(evt);
            }
        });
        jPanel2.add(imagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 170, 240));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, 30));

        nombreContenido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombreContenido.setBorder(null);
        nombreContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreContenidoActionPerformed(evt);
            }
        });
        jPanel2.add(nombreContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 240, 30));

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

        jComboBox1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peliculas", "Series" }));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, 30));

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

    private void ver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ver2ActionPerformed

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
        PerfilJFrame.perfil1.setVisible(true);
    }//GEN-LAST:event_perfilActionPerformed

    private void paginaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaPrincipalActionPerformed
        dispose(); // TODO add your handling code here:
        Principal.prin1.setVisible(true);
    }//GEN-LAST:event_paginaPrincipalActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        dispose();
        LoginJFrame.login1.setVisible(true);
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

    private void imagen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen1MouseClicked
        dispose();
        try {
            int idContenido = ContenidovIan.c1[0].getId();
            int idUsuario = Usuario.user1.getId();
            p2 = new PaginaPeliV1(idContenido, idUsuario);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        p2.setVisible(true);


    }//GEN-LAST:event_imagen1MouseClicked

    private void imagen2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen2MouseClicked
        dispose();
        try {
            int idContenido = ContenidovIan.c1[1].getId();
            int idUsuario = Usuario.user1.getId();
            p2 = new PaginaPeliV1(idContenido, idUsuario);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        p2.setVisible(true);

    }//GEN-LAST:event_imagen2MouseClicked

    private void imagen3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen3MouseClicked
        dispose();
        try {
            int idContenido = ContenidovIan.c1[2].getId();
            int idUsuario = Usuario.user1.getId();
            p2 = new PaginaPeliV1(idContenido, idUsuario);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        p2.setVisible(true);

    }//GEN-LAST:event_imagen3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            int idContenido=FuncionesBBDD.getIdCont(nombreContenido.getText());
            int idUsuario = Usuario.user1.getId();
            if (idContenido!=0){
            p2 = new PaginaPeliV1(idContenido, idUsuario);
            dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Ese contenido no existe, intentelo de nuevo");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        p2.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cerrarPrograma;
    private javax.swing.JButton cerrarSesion;
    private static javax.swing.JLabel imagen1;
    private static javax.swing.JLabel imagen2;
    private static javax.swing.JLabel imagen3;
    private javax.swing.JLabel imagenColorFondo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombreContenido;
    private javax.swing.JButton paginaPrincipal;
    private javax.swing.JButton perfil;
    private javax.swing.JButton ver1;
    private javax.swing.JButton ver2;
    private javax.swing.JButton ver3;
    // End of variables declaration//GEN-END:variables
}
