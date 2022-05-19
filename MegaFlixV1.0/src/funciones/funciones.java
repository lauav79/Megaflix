package funciones;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
        


// Video https://www.youtube.com/watch?v=qTznb9ufH9Y de imagenes en Mysql cargar y guardar imágenes
// https://programmerclick.com/article/83461053032/ para coger la segunda mejor puntuacion
// https://es.acervolima.com/consulta-sql-para-encontrar-el-segundo-salario-mas-alto/ otra opcion
public class funciones {
    //comentario
   /*
    // Visualizar la base de datos
    public ResultSet visualizar(){
        Connection con = funcionesBBDD.isConnected();
        ResultSet result= null;
        
        try{
            PreparedStatement consultaImagen = con.prepareStatement("Select imagen from contenido order by Puntuacion limit by 3");
            result = consultaImagen.executeQuery();
        }catch(Exception ex){
            System.out.println("Error en la consulta");
        }
        return result;        
    }
    
    public void guardarImagen(String ruta, String Nombre){
        Connection con = funcionesBBDD.isConnected();
        String insertar = "insert into contenido (nombre,imagen) values (?,?)";
        FileInputStream fi= null;
        PreparedStatement ps=null;
        try{
            File fichero  =new File(ruta);
            fi= new FileInputStream(fichero);
            ps= con.prepareStatement(insertar);
            ps.setString(1,Nombre);
            //Imagen y el numero 2 porque es el segundo en el insert
            ps.setBinaryStream(2,fi);
            //Se ejecuta la consulta hacia la base de datos
            ps.executeUpdate();
        }catch(Exception ex){
            System.out.println("Error en la consulta");
        }
    }*/
}

