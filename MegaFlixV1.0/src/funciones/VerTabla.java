package funciones;


import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import javax.swing.JTable;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Carmen
 */
public class VerTabla {
   /* public static void visualizarTabla(JTable tabla){
       funciones result = new funciones();
       funcionesBBDD conexion = new funcionesBBDD();
       Connection con = conexion.conectar();
       ResultSet rs = result.visualizar();
        
       tabla.setDefaultRenderer(Object.class, new TablaImagen());
       
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Nombre");
        dt.addColumn("Director");
        dt.addColumn("Descripcion");
        dt.addColumn("Temporadas");
        dt.addColumn("Duracion");
        dt.addColumn("Imagen");
        dt.addColumn("Tipo");
        dt.addColumn("Ruta Imagen");
        
        try{
            while(rs.next()){
                Object[] fila = new Object[8];
                fila[0] = rs.getObject(2);
                fila[1] = rs.getObject(3);
                fila[2] = rs.getObject(4);
                fila[3] = rs.getObject(5);
                fila[4] = rs.getObject(6);
                //REcoger la imagen
              Blob imagenblob = rs.getBlob(7);
              byte[] data = imagenblob.getBytes(1, (int) imagenblob.length());
              BufferedImage img= null;
              try {
                  img = ImageIO.read(new ByteArrayInputStream(data));
              }catch(Exception ex){
                  System.out.println("Imagen no ha podido ser leidda");   
              }
              ImageIcon icono =new ImageIcon(img);
              fila[5] = new JLabel(icono);
              fila[6] = rs.getObject(8);
              fila[7] = rs.getObject(9);
              dt.addRow(fila);
            }
            
            tabla.setModel(dt);
            tabla.setRowHeight(64);
        }catch(Exception ex){
            System.out.println("Error de visualizacion de la tabla");
        }
    }*/
}
