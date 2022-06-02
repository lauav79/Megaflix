/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;
import Persona.Usuario;
import static funciones.FuncionesBBDD.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Ian
 */
public class CambiarUsuario extends javax.swing.JFrame {

    int x, y, xMouse, yMouse;
    public static CambiarUsuario cUser1 = new CambiarUsuario();

    /**
     * Creates new form CambiarUsuario
     */
    public CambiarUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        aceptarBoton = new javax.swing.JButton();
        cancelarBoton = new javax.swing.JButton();
        nuevoUsuario = new javax.swing.JTextField();
        TxcambiarUser = new javax.swing.JLabel();
        cerrarPrograma = new javax.swing.JLabel();
        imagenColorFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aceptarBoton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        aceptarBoton.setText("Aceptar");
        aceptarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aceptarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aceptarBotonMouseExited(evt);
            }
        });
        aceptarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBotonActionPerformed(evt);
            }
        });
        jPanel1.add(aceptarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 93, -1));

        cancelarBoton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cancelarBoton.setText("Cancelar");
        cancelarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelarBotonMouseExited(evt);
            }
        });
        cancelarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 93, -1));

        nuevoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        nuevoUsuario.setText("Introduce la nueva contraseña");
        nuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoUsuarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevoUsuarioMouseExited(evt);
            }
        });
        nuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(nuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 260, -1));

        TxcambiarUser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TxcambiarUser.setForeground(new java.awt.Color(255, 255, 255));
        TxcambiarUser.setText("Cambiar Nombre de usuario:");
        jPanel1.add(TxcambiarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

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
        jPanel1.add(cerrarPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 50, 50));

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
        jPanel1.add(imagenColorFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarBotonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_aceptarBotonMouseEntered

    private void aceptarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarBotonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_aceptarBotonMouseExited

    private void aceptarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBotonActionPerformed
        cambioUsuario(nuevoUsuario.getText());
        close();
        JOptionPane.showMessageDialog(null, "A continuación se cerrara la sesión");
        LoginJFrame l1 = new LoginJFrame();
        l1.setVisible(true);
        close();
        Usuario.vaciarUsuario();
        dispose();

    }//GEN-LAST:event_aceptarBotonActionPerformed

    public static void cambioUsuario(String n) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = connect2();
            int id = Usuario.user1.getId();
            String us = n;
            String SQL = "UPDATE `megaflix`.`usuarios` SET `Alias` = '" + us + "' WHERE (`Id` = '" + id + "')";
            st = conn.createStatement();
            st.executeUpdate(SQL);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    private void cancelarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBotonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarBotonMouseEntered

    private void cancelarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBotonMouseExited

    }//GEN-LAST:event_cancelarBotonMouseExited

    private void cancelarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarBotonActionPerformed

    private void nuevoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoUsuarioMouseClicked

    }//GEN-LAST:event_nuevoUsuarioMouseClicked

    private void nuevoUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoUsuarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoUsuarioMouseExited

    private void nuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoUsuarioActionPerformed

    private void imagenColorFondo2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenColorFondo2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_imagenColorFondo2MouseDragged

    private void imagenColorFondo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenColorFondo2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_imagenColorFondo2MousePressed

    private void cerrarProgramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarProgramaMouseClicked
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_cerrarProgramaMouseClicked

    private void cerrarProgramaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarProgramaMouseEntered
        cerrarPrograma.setBackground(new Color(230, 0, 0));
        cerrarPrograma.setForeground(Color.black);
    }//GEN-LAST:event_cerrarProgramaMouseEntered

    private void cerrarProgramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarProgramaMouseExited
        cerrarPrograma.setBackground(new Color(153, 0, 0));
        cerrarPrograma.setForeground(Color.white);
    }//GEN-LAST:event_cerrarProgramaMouseExited

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
            java.util.logging.Logger.getLogger(CambiarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TxcambiarUser;
    private javax.swing.JButton aceptarBoton;
    private javax.swing.JButton cancelarBoton;
    private javax.swing.JLabel cerrarPrograma;
    private javax.swing.JLabel imagenColorFondo2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nuevoUsuario;
    // End of variables declaration//GEN-END:variables
}
