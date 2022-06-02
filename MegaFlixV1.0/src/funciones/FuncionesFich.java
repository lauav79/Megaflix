package Funciones;

import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedWriter;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FuncionesFich{

    
    
            
    //fichero de añadir 
    
    public static void añadirLogLoginOk(String nombreUser){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fecha=dtf.format(LocalDateTime.now());
        String log = "El usuario "+ nombreUser+ " ha ingresado correctamente en la app en fecha:"+fecha+"\n";
        
        
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            
            File file = new File("./Logs/logLogin.txt");
            // Si el archivo no existe, se crea
            if (!file.exists()) {
                file.createNewFile();
            }
            // flag true, indica adjuntar información al archivo.
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(log);
            System.out.println("información agregada");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                            //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null){
                    bw.close();}
                if (fw != null){
                    fw.close();}
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }

}
