/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;

import Funciones.funciones;
import Funciones.funcionesBBDD;
import java.awt.Color;
import javax.swing.border.Border;

/**
 *
 * @author admin
 */
public class LoginJFrame extends javax.swing.JFrame {

    PerfilJFrame p2 = new PerfilJFrame();
    public static Principal prin1 = new Principal();
    int xMouse, yMouse, x, y;

    /**
     * Creates new form LoginJFrame funciones image = new funciones(); funciones
     * image = new funciones(); image.setImage("/IMG/FondoLogin.jpg");
     * setContentPane(image); image.setImage("/IMG/FondoLogin.jpg");
     * setContentPane(image);
     */
    public LoginJFrame() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        usuarioText = new javax.swing.JLabel();
        contraseñaText = new javax.swing.JLabel();
        campoContrasena = new javax.swing.JPasswordField();
        iniciarSesionBoton = new javax.swing.JButton();
        campoUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cerrarPrograma = new javax.swing.JLabel();
        imagenLogo = new javax.swing.JLabel();
        imagenColorFondo2 = new javax.swing.JLabel();
        imagenColorFondo = new javax.swing.JLabel();
        imgFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuarioText.setBackground(new java.awt.Color(255, 255, 255));
        usuarioText.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        usuarioText.setForeground(new java.awt.Color(255, 255, 255));
        usuarioText.setText("Usuario");
        jPanel1.add(usuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 30));

        contraseñaText.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        contraseñaText.setForeground(new java.awt.Color(255, 255, 255));
        contraseñaText.setText("Contraseña");
        jPanel1.add(contraseñaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 30));

        campoContrasena.setForeground(new java.awt.Color(204, 204, 204));
        campoContrasena.setText("********");
        campoContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoContrasenaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                campoContrasenaMouseExited(evt);
            }
        });
        campoContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(campoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, 30));

        iniciarSesionBoton.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        iniciarSesionBoton.setText("Iniciar Sesión");
        iniciarSesionBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iniciarSesionBotonMouseEntered(evt);
            }
        });
        iniciarSesionBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionBotonActionPerformed(evt);
            }
        });
        jPanel1.add(iniciarSesionBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 140, 40));

        campoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        campoUsuario.setText("Inserte su nombre de usuario");
        campoUsuario.setMaximumSize(new java.awt.Dimension(50, 21));
        campoUsuario.setMinimumSize(new java.awt.Dimension(50, 21));
        campoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoUsuarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                campoUsuarioMouseExited(evt);
            }
        });
        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Megaflix Imagenes Pelis Login.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 530, 430));

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
        jPanel1.add(cerrarPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        imagenLogo.setBackground(new java.awt.Color(153, 0, 0));
        imagenLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Logo Megaflix.png"))); // NOI18N
        jPanel1.add(imagenLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 330, 50));

        imagenColorFondo2.setBackground(new java.awt.Color(153, 0, 0));
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
        jPanel1.add(imagenColorFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        imagenColorFondo.setBackground(new java.awt.Color(153, 0, 0));
        imagenColorFondo.setOpaque(true);
        jPanel1.add(imagenColorFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 280, 510));

        imgFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(imgFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContrasenaActionPerformed

    private void iniciarSesionBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionBotonActionPerformed

        String user = campoUsuario.getText();
        String pass = new String(campoContrasena.getPassword());
        funcionesBBDD.loadDriver();
        funcionesBBDD.connect();
        funcionesBBDD.isConnected();
        funcionesBBDD.iniciosesion(user, pass);
        prin1.setVisible(true);
        dispose();


    }//GEN-LAST:event_iniciarSesionBotonActionPerformed

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void iniciarSesionBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSesionBotonMouseEntered
        this.setBackground(new Color(200, 200, 200));
    }//GEN-LAST:event_iniciarSesionBotonMouseEntered

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

    private void imagenColorFondo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenColorFondo2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_imagenColorFondo2MousePressed

    private void campoContrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoContrasenaMouseClicked
        if (String.valueOf(campoContrasena.getPassword()).equals("********")) {
            campoContrasena.setText("");
            campoContrasena.setForeground(Color.black);
        }
    }//GEN-LAST:event_campoContrasenaMouseClicked

    private void campoContrasenaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoContrasenaMouseExited
        if (String.valueOf(campoContrasena.getPassword()).isEmpty()) {
            campoContrasena.setText("********");
            campoContrasena.setForeground(Color.gray);
        }
    }//GEN-LAST:event_campoContrasenaMouseExited

    private void campoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoUsuarioMouseClicked
        if (campoUsuario.getText().equals("Inserte su nombre de usuario")) {
            campoUsuario.setText("");
            campoUsuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_campoUsuarioMouseClicked

    private void campoUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoUsuarioMouseExited
        if (campoUsuario.getText().equals("")) {
            campoUsuario.setText("Inserte su nombre de usuario");
            campoUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_campoUsuarioMouseExited

    private void imagenColorFondo2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenColorFondo2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_imagenColorFondo2MouseDragged

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
    private javax.swing.JPasswordField campoContrasena;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel cerrarPrograma;
    private javax.swing.JLabel contraseñaText;
    private javax.swing.JLabel imagenColorFondo;
    private javax.swing.JLabel imagenColorFondo2;
    private javax.swing.JLabel imagenLogo;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JButton iniciarSesionBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel usuarioText;
    // End of variables declaration//GEN-END:variables
}
