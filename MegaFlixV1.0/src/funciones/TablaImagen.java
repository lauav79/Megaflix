package funciones;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Carmen
 */
public class TablaImagen extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
     
        //To change body of generated methods, choose Tools | Templates.
        if (value instanceof JLabel){
            JLabel lbl = (JLabel) value;
            return lbl;
        }
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
    
    

}
