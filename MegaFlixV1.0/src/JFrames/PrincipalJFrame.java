package JFrames;
import java.sql.Connection;
import funciones.funcionesBBDD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Carmen
 */
public class PrincipalJFrame extends javax.swing.JFrame {
        DefaultTableModel modelo;
        PreparedStatement st;                                                            
    /**                                                           
     * Creates new form PrincipalJFrame
     */
    public PrincipalJFrame() {                                                             
        initComponents();
        panelTabla.setVisible(false);
        Tabla.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Portada");
        //Conectar base de datos
        Connection conec= funcionesBBDD.conectar();

        // Primera Consulta
        String sql1="Select Imagen from usuariovaloracontenido join contenido on idContenido=contenido.Id where Puntuacion=(Select max(Puntuacion) from usuariovaloracontenido)";
        try {
                PreparedStatement pst = conec.prepareStatement(sql1);
                ResultSet res = pst.executeQuery();
                if(res.next()){
                img1.setIcon(new ImageIcon(res.getString("Imagen")));
                }
        } catch (SQLException ex) {
            System.out.println("No se ha encontrado la imagen");
        }
        //Segunda Consulta
        String sql2=" Select Imagen from usuariovaloracontenido join contenido as c on idContenido=c.Id order by Puntuacion desc Limit 1,1";
        try {
                PreparedStatement ps2=conec.prepareStatement(sql2);
                ResultSet res2= ps2.executeQuery();
                if(res2.next()){
                img2.setIcon(new ImageIcon(res2.getString("Imagen")));
                }
        } catch (SQLException ex) {
            System.out.println("No se ha encontrado la imagen");
        }
         //Tercera Consulta
        String sql3=" Select Imagen from usuariovaloracontenido join contenido as c on idContenido=c.Id order by Puntuacion desc Limit 2,1";
        try {
                PreparedStatement ps3=conec.prepareStatement(sql3);
                ResultSet res3= ps3.executeQuery();
                if(res3.next()){
                img3.setIcon(new ImageIcon(res3.getString("Imagen")));
                }
                conec.close();
        } catch (SQLException ex) {
            System.out.println("No se ha encontrado la imagen");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        JButton2 = new javax.swing.JButton();
        img3 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        panelBuscar = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        rbSerie = new javax.swing.JRadioButton();
        rbPeli = new javax.swing.JRadioButton();
        bBuscar = new javax.swing.JButton();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
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

        panelBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda"));

        buttonGroup1.add(rbSerie);
        rbSerie.setText("Series");

        buttonGroup1.add(rbPeli);
        rbPeli.setText("Películas");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addComponent(rbSerie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbPeli)
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBuscarLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(bBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(img2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(img1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(248, 248, 248)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(89, 89, 89))
        );

        mPortada.setText("Portada");
        jMenuBar1.add(mPortada);

        mContenido.setText("Contenido");

        mSeries.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mSeries.setText("Series");
        mSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSeriesActionPerformed(evt);
            }
        });
        mContenido.add(mSeries);

        mPeliculas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mPeliculas.setText("Peliculas");
        mContenido.add(mPeliculas);

        jMenuBar1.add(mContenido);

        mAyuda.setText("Ayuda");

        mSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/cerrar1.png"))); // NOI18N
        mSalir.setText("Salir de la aplicación");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        mAyuda.add(mSalir);

        mAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/ayuda1.png"))); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
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

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
       visualizarTabla();
        // Búsqueda de contenido
        //Obtener texto a buscar
        String texto=txtBuscar.getText();
        if(rbSerie.isSelected()){
            Connection conec= funcionesBBDD.conectar();
           String sqlBuscarSerie="Select Nombre, Imagen from contenido where Tipo='Series' and Nombre like '%"+ texto +"%'"; 
            try {
                st=(PreparedStatement)conec.prepareStatement(sqlBuscarSerie);
                ResultSet rs=st.executeQuery();              
                Object[] nombre =new Object[1];
                modelo = (DefaultTableModel) Tabla.getModel();
                //Vaciar la tabla antes de cada búsqueda
                modelo.setRowCount(0);
                while(rs.next()){
                   nombre[0]= rs.getString("Nombre");
                   modelo.addRow(nombre);
               }
                Tabla.setModel(modelo);
                conec.close();
            } catch (SQLException ex) {
                System.out.println("No se ha podido añadir la tabla");
            }

        }else if (rbPeli.isSelected()){
            Connection conec= funcionesBBDD.conectar();
            String sqlBuscarPeli="Select Nombre, Imagen from contenido where Tipo='Peliculas' and Nombre like '%"+ texto +"%'"; 
             try {
                st=(PreparedStatement)conec.prepareStatement(sqlBuscarPeli);
                ResultSet rs=st.executeQuery();              
                Object[] nombre =new Object[1];
                modelo = (DefaultTableModel) Tabla.getModel();
                //Vaciar la tabla antes de cada búsqueda
                modelo.setRowCount(0);
                while(rs.next()){
                   nombre[0]= rs.getString("Nombre");
                   modelo.addRow(nombre);
               }
                Tabla.setModel(modelo);
                conec.close();
            } catch (SQLException ex) {
                System.out.println("No se ha podido añadir la tabla");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe selecionar una opción");
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void mSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSeriesActionPerformed
        visualizarTabla();
        String sqlTSeries="Select Nombre from contenido where Tipo='Series'";
        Connection conec= funcionesBBDD.conectar();
            try {
                st= conec.prepareStatement("Select Nombre from contenido where Tipo='Series'");
                ResultSet rs=st.executeQuery();
                Object[] nombre =new Object[1];
                modelo = (DefaultTableModel) Tabla.getModel();
                //Vaciar la tabla antes de cada búsqueda
                modelo.setRowCount(0);
                while(rs.next()){
                   nombre[0]= rs.getString("Nombre");
                   modelo.addRow(nombre);
               }
                Tabla.setModel(modelo);
                conec.close();
            } catch (SQLException ex) {
                System.out.println("No se ha podido añadir la tabla");
            }
    }//GEN-LAST:event_mSeriesActionPerformed
     public void visualizarTabla(){
         //Ocultar elemenos que no me hacen falta
        img1.setVisible(false);
        img2.setVisible(false);
        img3.setVisible(false);
        //Hacer visible la tabla
        panelTabla.setVisible(true);
        Tabla.setVisible(true);
        Tabla.removeAll();
    }
    public void crearTabla(){
        
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
    private javax.swing.JTable Tabla;
    private javax.swing.JButton bBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JRadioButton rbPeli;
    private javax.swing.JRadioButton rbSerie;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
