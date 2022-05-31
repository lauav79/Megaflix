/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;
import Contenido.Contenido;
import Genero.Genero;
import Genero.GeneroContenido;
import Persona.Usuario;
import Funciones.funcionesBBDDvIan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import funciones.FuncionesBBDD;


/**
 *
 * @author admin
 */
public class VisualizarContenido extends javax.swing.JFrame {
    public static VisualizarContenido vc1 = new VisualizarContenido();
    ArrayList listaDatos=new ArrayList();
    ArrayList listaComentarios=new ArrayList();
    
    
    /**
     * Creates new form VisualizarContenido
     */
    //AÑADIR LOS CAMPOS como parametros 
    public VisualizarContenido() throws  SQLException, ClassNotFoundException {
        initComponents();
        //GET EL ID 
        int idCont=15;  
        //id usuario
        int idUser=1;
        Contenido nnContenido=new Contenido();
        Usuario nUsuario=new Usuario();
        
        //idUser
        
        
        
        //tabla de contenido
        String titulo="";
        String descripcion="";
        String director="";
        String imagen;
        String duracion="";
        int temporadas=0;
        String tipo="";
        
        
        //tabla de comentarios
        double valoracion=0;
        //String valoracionStr=String.valueOf(valoracion);
        String comentario;
        String usuario;
        
        //tabla generocontenido
        String genero="";
        
        //Saco los datos del contenido que se va a visualizar
        String sql="SELECT * FROM contenido WHERE id="+idCont;
        listaDatos=funciones.FuncionesBBDD.getListas(sql, "Contenidos");
        Iterator itListaDatosPelis=listaDatos.iterator();
        while(itListaDatosPelis.hasNext()){
            Contenido nContenido=(Contenido) itListaDatosPelis.next();
            titulo=nContenido.getNombre();
            descripcion=nContenido.getDescripcion();
            imagen=nContenido.getImagen();
            duracion=nContenido.getDuracion();
            temporadas=nContenido.getTemporadas();
            tipo=nContenido.getTipo();
        
        }
        
        //Contenido cont=new Contenido((String Nombre, String Director, String Tipo, String Descripcion, String Duracion, String Imagen, int Id, int Temporadas))
        //trato el string de descripcion.
        int numCarac=65  ;
        String descBien="";
        int longDesc=descripcion.length()-1;
        for(int i=0;i<=longDesc;i++){
            char c=descripcion.charAt(i);
            descBien+=c;
            if(i%numCarac==0 && i>0){
                descBien+="-\n";
            }            
        }
        
        //saco el género a partir de la tabla generocontenido
        sql="SELECT * "
            + "FROM genero NATURAL JOIN"
            + " generocontenido WHERE idContenido="+idCont;
        listaDatos=FuncionesBBDD.getListas(sql, "GenerosContenido");
         Iterator itListaDatosGenero=listaDatos.iterator();
        while(itListaDatosGenero.hasNext()){
            GeneroContenido nGeneroCont=(GeneroContenido) itListaDatosGenero.next();
            genero+=" "+nGeneroCont.getNombreGen();
            System.out.println("Genero"+genero);
        }
        System.out.println("Genero"+genero);
        
        
        
        //comentarios
        sql="SELECT * FROM usuariovaloracontenido WHERE idContenido="+idCont;
        FuncionesBBDD.getListas(sql,"Comentarios");
        
        //cargo los comentarios 
        DefaultTableModel modelo= FuncionesBBDD.mostrarComentariosContenido(titulo);
        jTable1.setModel(modelo);
        //si es pelicula muestro solo duracion
        if ("Peliculas".equals(tipo)){
            
            jLaDur.setText("Duración:");
            jLabelDur.setText(duracion);
        
        //si es serie muestro solo las temporadas
        }else if("Series".equals(tipo)){
            //cambiar label
            jLaTemp.setText("Temporadas:");
            jLabelTemp.setText(Integer.toString(temporadas));
        
        }
        
        jLabelTitulo.setText(titulo);
        jLabelGenero.setText(genero);
        //textArcoment.setText(comentario);
        textArDesc.setText(descBien);
        
        
        //jLaUser.setText(usuario);
        
        //imagen;
        imagen=FuncionesBBDD.getImagenCont(idCont);
        System.out.println(imagen);
        jLaImagen.setIcon( new ImageIcon(imagen));
        
    
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
        jLabelTitulo = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textArDesc = new java.awt.TextArea();
        jLaDur = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLaImagen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Comentar = new javax.swing.JButton();
        jTeFiComent = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpiPunt = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelDur = new javax.swing.JLabel();
        jLaTemp = new javax.swing.JLabel();
        jLabelTemp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelTitulo.setLabelFor(jLabelTitulo);
        jLabelTitulo.setText("titulo");
        jPanel2.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, 270, 39));

        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 11, -1, -1));

        jLabel3.setText("Descripción:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 152, -1, -1));

        textArDesc.setEditable(false);
        jPanel2.add(textArDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 185, 477, 163));
        jPanel2.add(jLaDur, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 408, 84, 34));

        jLabelGenero.setText("Género");
        jPanel2.add(jLabelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 152, -1, -1));
        jPanel2.add(jLaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 184, 141, 188));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Comentar.setText("Comentar");
        Comentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComentarActionPerformed(evt);
            }
        });

        jTeFiComent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeFiComentActionPerformed(evt);
            }
        });

        jLabel1.setText("Puntuación:");

        jLabel5.setText("Comentario:");

        jSpiPunt.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 10.0d, 0.5d));
        jSpiPunt.setEditor(new javax.swing.JSpinner.NumberEditor(jSpiPunt, "0.0"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Usuario", "Puntuación", "Comentario"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Usuario");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Puntuación");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Comentario");
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTeFiComent, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(Comentar))
                    .addComponent(jSpiPunt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jSpiPunt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTeFiComent, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Comentar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 378, -1, -1));

        jLabelDur.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jLabelDur, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 408, 50, 34));
        jPanel2.add(jLaTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 84, 34));

        jLabelTemp.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jLabelTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 460, 50, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jTeFiComentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeFiComentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeFiComentActionPerformed

    private void ComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComentarActionPerformed
        // TODO add your handling code here:
        //AKI TENGO QUE LLAMAR A LOS OBJETOS PARA OBJETNER EL IDCONT Y IDUSER
        int idCont=2;
        //id usuario
        int idUser=1;
        String comentario=jTeFiComent.getText();
        double puntos=(double) jSpiPunt.getValue();
        String mError="No se ha podido realizar la inserción \n |";
        //compruebo que el comentario no está vacío
        int longComent=comentario.length();
        if(longComent>0){
            try {
                //insertar comentario
                FuncionesBBDD.añadirComentario(comentario,puntos,idUser,idCont);
            } catch (SQLException ex) {
                Logger.getLogger(VisualizarContenido.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            JOptionPane.showMessageDialog(null, mError, "Error de inserción, comentario vacio", JOptionPane.WARNING_MESSAGE);
        }
        //DefaultTableModel modelo= FuncionesBBDD.mostrarComentariosContenido(titulo);
        //RECARGAR LA TABLA
        //jTable1.setModel(modelo);

    }//GEN-LAST:event_ComentarActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizarContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vc1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comentar;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JLabel jLaDur;
    private javax.swing.JLabel jLaImagen;
    private javax.swing.JLabel jLaTemp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDur;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelTemp;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpiPunt;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTeFiComent;
    private java.awt.TextArea textArDesc;
    // End of variables declaration//GEN-END:variables
}
