/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package JFrames;
import Contenido.Contenido;
import Genero.Genero;
import funciones.FuncionesBBDD;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author lauav
 */
public class GestorContenidoMain extends javax.swing.JFrame {
    
    ArrayList listaPeliculas;
    ArrayList listaSeries;
    ArrayList listaGeneros;
    ArrayList listaGenCon;

    /** Creates new form GestorContenidoMain
     * @throws java.lang.ClassNotFoundException */
    public GestorContenidoMain() throws ClassNotFoundException {
        initComponents();
        
        //bienvenida
        String nombre="admin1";
        String bienv="Bienvenid@ "+ nombre+ "!";
        jLabelBienve.setText(bienv);
        
        //llenar listas
        listaPeliculas=new ArrayList();
        listaSeries=new ArrayList();
        listaGeneros=new ArrayList();
        
        //lleno la lista de generos
        llenarCBGenero();
        
    }
    
    //Funciones para cargar la lista de peliculas y series en los comboBox
    public void llenarCBPeliculas() throws ClassNotFoundException{
        //vacio el comboBoxPeliculas
        jCoBoContenido.removeAllItems();
        String sql = "SELECT * FROM contenido WHERE tipo='Peliculas'";
        listaPeliculas=FuncionesBBDD.getListas(sql,"Contenidos");
        Iterator itListaPelis=listaPeliculas.iterator();
        while(itListaPelis.hasNext()){
            Contenido nContenido=(Contenido) itListaPelis.next();
            jCoBoContenido.addItem(nContenido.toString());
        
        }
        
    }
    
    public void llenarCBSeries() throws ClassNotFoundException{
        //vacio el comboBoxSeries
        jCoBoContenido.removeAllItems();
        String sql = "SELECT * FROM contenido WHERE tipo='Series'";
        listaSeries=FuncionesBBDD.getListas(sql,"Contenidos");
        Iterator itListaSeries=listaSeries.iterator();
        while(itListaSeries.hasNext()){
            Contenido nContenido=(Contenido) itListaSeries.next();
            jCoBoContenido.addItem(nContenido.toString());
        
        }
        
    }
    
    public void llenarCBGenero() throws ClassNotFoundException{
        //vacio el comboBoxPeliculas
        jCoBoGenero.removeAllItems();
        String sql = "SELECT * FROM genero";
        listaGeneros=FuncionesBBDD.getListas(sql,"Generos");
        Iterator itListaGeneros=listaGeneros.iterator();
        while(itListaGeneros.hasNext()){
            Genero nGenero=(Genero) itListaGeneros.next();
            jCoBoGenero.addItem(nGenero.toString());
        
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabelBienve = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRaPeliAñadir = new javax.swing.JRadioButton();
        jRaSerieAñadir = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFiNombre = new javax.swing.JTextField();
        jTextFiDesc = new javax.swing.JTextField();
        jTextFiDur = new javax.swing.JTextField();
        jSpinnerTemp = new javax.swing.JSpinner();
        jTextFiDir = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCoBoGenero = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jBuBorrar = new javax.swing.JButton();
        jRaPeliEliminar = new javax.swing.JRadioButton();
        jRaSeriesEliminar = new javax.swing.JRadioButton();
        jCoBoContenido = new javax.swing.JComboBox<>();
        mostrarContenido = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Atrás");

        jLabelBienve.setText("Bienvenida");

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Añadir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBienve, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jButton2)
                .addGap(36, 36, 36)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabelBienve, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("", jPanel1);

        jLabel1.setText("Nombre:");

        buttonGroup1.add(jRaPeliAñadir);
        jRaPeliAñadir.setText("Película");
        jRaPeliAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRaPeliAñadirActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRaSerieAñadir);
        jRaSerieAñadir.setText("Serie");
        jRaSerieAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRaSerieAñadirActionPerformed(evt);
            }
        });

        jLabel2.setText("Descripción:");

        jLabel3.setText("Director:");

        jLabel4.setText("Temporadas:(series)");

        jLabel5.setText("Duración: (mins)");

        jTextFiNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiNombreActionPerformed(evt);
            }
        });

        jSpinnerTemp.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinnerTemp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextFiDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiDirActionPerformed(evt);
            }
        });

        jButton4.setText("Añadir a BBDD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setText("Género:");

        jCoBoGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jCoBoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFiDur, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jRaPeliAñadir)
                                .addGap(18, 18, 18)
                                .addComponent(jRaSerieAñadir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinnerTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFiNombre)
                                            .addComponent(jTextFiDesc)
                                            .addComponent(jTextFiDir, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRaPeliAñadir)
                    .addComponent(jRaSerieAñadir)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFiNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFiDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFiDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinnerTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFiDur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCoBoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Añadir", jPanel4);

        jBuBorrar.setText("Eliminar");
        jBuBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuBorrarActionPerformed(evt);
            }
        });

        buttonGroup6.add(jRaPeliEliminar);
        jRaPeliEliminar.setText("Películas");
        jRaPeliEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRaPeliEliminarActionPerformed(evt);
            }
        });

        buttonGroup6.add(jRaSeriesEliminar);
        jRaSeriesEliminar.setText("Series");

        jCoBoContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCoBoContenidoActionPerformed(evt);
            }
        });

        mostrarContenido.setText("Mostrar");
        mostrarContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarContenidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCoBoContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRaPeliEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRaSeriesEliminar)
                                .addGap(68, 68, 68)
                                .addComponent(mostrarContenido))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jBuBorrar)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRaPeliEliminar)
                            .addComponent(jRaSeriesEliminar)
                            .addComponent(mostrarContenido)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addComponent(jCoBoContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jBuBorrar)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Eliminar", jPanel3);
        jTabbedPane2.addTab("Géneros", jTabbedPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarContenidoActionPerformed
        // TODO add your handling code here:
        
        //compruebo si esta seleccionadas pelis y series
        //Cargo los datos en el comboBox según la seleccion del checkbox
        if(jRaPeliEliminar.isSelected()){
            try {
                llenarCBPeliculas();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GestorContenidoMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(jRaSeriesEliminar.isSelected()){
            try {
                llenarCBSeries();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GestorContenidoMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            jCoBoContenido.addItem("Selecciona películas o series");
        }
        
        
        
        

        //
    }//GEN-LAST:event_mostrarContenidoActionPerformed

    private void jCoBoContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCoBoContenidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCoBoContenidoActionPerformed

    private void jRaPeliEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRaPeliEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRaPeliEliminarActionPerformed

    private void jBuBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuBorrarActionPerformed
        // TODO add your handling code here:
        //BOTON DE BORRARR
        //descompongo el id y el nombre y llamo a la funcion eliminarContenido
        String contenido=jCoBoContenido.getSelectedItem().toString();
        String [] partesContenido= contenido.split("-");
        
        try {
            FuncionesBBDD.borrarRegistro(partesContenido[0],"Contenido");
                        
            //System.out.println(contenido);
        } catch (SQLException ex) {
            Logger.getLogger(GestorContenidoMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBuBorrarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //recojo los datos

        boolean insertOK=true;
        String mError="";

        //recojo los datos de los TextField
        String nombre= jTextFiNombre.getText();
        String descripcion= jTextFiDesc.getText();
        String director= jTextFiDir.getText();
        int temporadas= (Integer) jSpinnerTemp.getValue();
        String duracion=jTextFiDur.getText();
        String tipo="ninguno";
        String genero=jCoBoGenero.getSelectedItem().toString();
        //separo el id del nombre para luego insertarlo en generoContenido en bbdd
        String [] partesGenero= genero.split("-");
        

        //compruebo que los campos comunes a series y pelis no estén vacios
        //las temporadas se controlan si se ha elegido serie
        int longNombre=nombre.length();
        int longDesc=descripcion.length();
        int longDir=director.length();
        int longDur=duracion.length();

        if(longNombre==0 || longDesc==0 || longDir==0){
            insertOK=false;
            mError=mError+"\n |Comprueba que has rellenado los campos de nombre, descripción y director.|";

        }


        //tipo de contenido con checkbox
        if(jRaPeliAñadir.isSelected()){
            tipo="Peliculas";
            //ha de tener duración
            if(longDur==0){
                insertOK=false;
                mError=mError+"\n |Una película ha de tener duración|";
            }
            //no ha de tener temporadas
            if(temporadas>0){
                insertOK=false;
                mError=mError+"\n |Una película no ha de tener temporadas|";
            }
        }else if(jRaSerieAñadir.isSelected()){
            tipo="Series";
            //si es serie tiene que tener temporadas, más de 0
            if(temporadas<=0){
                insertOK=false;
                mError=mError+"\n |Una serie ha de tener más de 0 temporadas|";
            }
            //si se ha introducido duración, la seteamos vacia.
            if(longDur>0){
                duracion="";
            }
        }else{
            insertOK=false;
            mError=mError+"\n |No has selecionado el tipo de contenido(Película/Serie)|";
        }
        

        System.out.println("Errores"+ mError);
        //HACER UN JOPTIONPANE

        //inserto el nuevo registro en bbdd
        if(insertOK==true){
            //llamo a la funcion para insertar contenido
            ArrayList listaContIns=new ArrayList();

            try{
                FuncionesBBDD.añadirContenido(nombre,descripcion,director,temporadas,duracion,tipo);
                //falta insertar la imagen
                System.out.println("Se ha insertado el contenido");
                //(int idCont, int idGen)
                /*
                String sql="SELECT * from contenido where Nombre=\""+ nombre+ "\"";
                FuncionesBBDD.getListas(sql,"Contenidos");
                Iterator itListaCont=listaContIns.iterator();
                while(itListaCont.hasNext()){
                    Contenido nCont=(Contenido) itListaCont.next();
                    System.out.println(nCont);
                    int idCont = nCont.getId();        
                    System.out.println(idCont);
                }
                */
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GestorContenidoMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(GestorContenidoMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            int idCont = 0;
            //saco el id del genero del array con el que cargo los generos
            int idGen=Integer.parseInt(partesGenero[0]);
            //saco el id del contenido con una consulta
            idCont=FuncionesBBDD.getIdCont(nombre);
            System.out.println(idCont);
            
            try {
                FuncionesBBDD.añadirGeneroContenido(idCont,idGen);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GestorContenidoMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(GestorContenidoMain.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        }else{
            //muestro los errores
            String mensajeFinal="No se ha podido insertar el contenido por errores en los datos dados."+mError;
            JOptionPane.showMessageDialog(null, mensajeFinal, "Error de inserción", JOptionPane.WARNING_MESSAGE);
        }
        
        //insertar generoContenido
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFiDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiDirActionPerformed

    private void jTextFiNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiNombreActionPerformed

    private void jRaSerieAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRaSerieAñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRaSerieAñadirActionPerformed

    private void jRaPeliAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRaPeliAñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRaPeliAñadirActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GestorContenidoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorContenidoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorContenidoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorContenidoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GestorContenidoMain().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GestorContenidoMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jBuBorrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCoBoContenido;
    private javax.swing.JComboBox<String> jCoBoGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelBienve;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRaPeliAñadir;
    private javax.swing.JRadioButton jRaPeliEliminar;
    private javax.swing.JRadioButton jRaSerieAñadir;
    private javax.swing.JRadioButton jRaSeriesEliminar;
    private javax.swing.JSpinner jSpinnerTemp;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextFiDesc;
    private javax.swing.JTextField jTextFiDir;
    private javax.swing.JTextField jTextFiDur;
    private javax.swing.JTextField jTextFiNombre;
    private javax.swing.JButton mostrarContenido;
    // End of variables declaration//GEN-END:variables

}
