/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;

import Funciones.funciones;
import Funciones.funcionesBBDD;
import java.awt.Color;

/**
 *
 * @author admin
 */
public class LoginJFrame extends javax.swing.JFrame {

    PerfilJFrame p2 = new PerfilJFrame();
    public static Principal prin1 = new Principal();

    /**
     * Creates new form LoginJFrame
     */
    public LoginJFrame() {
        funciones image = new funciones();
        image.setImage("/IMG/FondoLogin.jpg");
        setContentPane(image);
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgFondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contrasena = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        patata = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        jPanel1.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(imgFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 680, 440));

        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 38, -1, -1));

        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 88, -1, -1));

        contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 110, 200, 21));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 165, 197, 46));

        patata.setText("Iniciar Sesión");
        patata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patataActionPerformed(evt);
            }
        });
        jPanel1.add(patata, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 137, -1, -1));

        usuario.setMaximumSize(new java.awt.Dimension(50, 21));
        usuario.setMinimumSize(new java.awt.Dimension(50, 21));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 60, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaActionPerformed

    private void patataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patataActionPerformed

        String user = usuario.getText();
        String pass = new String(contrasena.getPassword());
        funcionesBBDD.loadDriver();
        funcionesBBDD.connect();
        funcionesBBDD.isConnected();
        funcionesBBDD.iniciosesion(user, pass);
        color();

        if (funcionesBBDD.iniciosesion(user, pass) == true) {
            prin1.setVisible(true);
            dispose();

        } else {
            jLabel3.setVisible(true);
            jLabel3.setForeground(Color.red);
            jLabel3.setText("Inicio de sesion incorrecto...");
        }

    }//GEN-LAST:event_patataActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed
    public static void color() {
        jLabel3.setVisible(true);
        jLabel3.setForeground(Color.blue);
        jLabel3.setText("Iniciando sesion...");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton patata;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
