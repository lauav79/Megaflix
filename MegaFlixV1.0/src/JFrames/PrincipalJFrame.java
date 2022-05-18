package JFrames;
/**
 *
 * @author Carmen
 */
public class PrincipalJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalJFrame
     */
    public PrincipalJFrame() {
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
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        JButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mPortada = new javax.swing.JMenu();
        mContenido = new javax.swing.JMenu();
        mSeries = new javax.swing.JMenuItem();
        mPeliculas = new javax.swing.JMenuItem();
        mAyuda = new javax.swing.JMenu();
        mSalir = new javax.swing.JMenuItem();
        mAcerca = new javax.swing.JMenuItem();
        mUsuario = new javax.swing.JMenu();
        mPerfil = new javax.swing.JMenuItem();
        mLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Ver");

        jButton3.setText("Ver");

        JButton2.setText("Ver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(JButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(JButton2))
                .addGap(131, 131, 131))
        );

        mPortada.setText("Portada");
        jMenuBar1.add(mPortada);

        mContenido.setText("Contenido");

        mSeries.setText("Series");
        mContenido.add(mSeries);

        mPeliculas.setText("Peliculas");
        mContenido.add(mPeliculas);

        jMenuBar1.add(mContenido);

        mAyuda.setText("Ayuda");

        mSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mSalir.setText("Salir de la aplicación");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        mAyuda.add(mSalir);

        mAcerca.setText("Acerca de...");
        mAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAcercaActionPerformed(evt);
            }
        });
        mAyuda.add(mAcerca);

        jMenuBar1.add(mAyuda);

        mUsuario.setText("Usuario");

        mPerfil.setText("Perfil");
        mPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPerfilActionPerformed(evt);
            }
        });
        mUsuario.add(mPerfil);

        mLogout.setText("Log Out");
        mUsuario.add(mLogout);

        jMenuBar1.add(mUsuario);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Evento que al pulsar Salga de la aplicación
    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        // TODO add your handling code here:
        //Salir de la aplicación
        System.exit(0);
    }//GEN-LAST:event_mSalirActionPerformed

    private void mPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPerfilActionPerformed
        // TODO add your handling code here:
        //Mostrar el FRAME del PERFIL del USUARIO
        PerfilJFrame perfil = new PerfilJFrame();
        //Mostrar el frame de perfil
        perfil.setVisible(true);
        //ocultar este frame
        this.setVisible(false);
    }//GEN-LAST:event_mPerfilActionPerformed

    private void mAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAcercaActionPerformed
        // TODO add your handling code here:
        AcercaDe acerca = new AcercaDe(this,rootPaneCheckingEnabled);
        acerca.setVisible(true);
        
    }//GEN-LAST:event_mAcercaActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mAcerca;
    private javax.swing.JMenu mAyuda;
    private javax.swing.JMenu mContenido;
    private javax.swing.JMenuItem mLogout;
    private javax.swing.JMenuItem mPeliculas;
    private javax.swing.JMenuItem mPerfil;
    private javax.swing.JMenu mPortada;
    private javax.swing.JMenuItem mSalir;
    private javax.swing.JMenuItem mSeries;
    private javax.swing.JMenu mUsuario;
    // End of variables declaration//GEN-END:variables
}
