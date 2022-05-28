package funciones;

import Contenido.Contenido;
import Genero.Genero;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class FuncionesBBDD {
    //prueba
    
    public static void main(String[] args) throws ClassNotFoundException {
        FuncionesBBDD.loadDriver();
        FuncionesBBDD.connect();
        FuncionesBBDD.isConnected();
        FuncionesBBDD.close();
        FuncionesBBDD.isConnected();
        /*
        //prueba de insert
        String name="contenido1";
        String desc="probando probando";
        String dire="director inventado";
        int temp=1;
        String dura="null";
        String tipo="Series";
        
        FuncionesBBDD.añadirContenido(name,desc,dire,temp,dura,tipo);
        //String nombre, String descripcion, String director, int temporadas, String duracion, String tipo
        */
        
        
    }
    
    //conectar
    // Conexión a la base de datos
    private static Connection conn = null;
    
    // Configuración de la conexión a la base de datos
    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "megaflix";
    private static final String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME + "?serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "toor";
    private static final String DB_MSQ_CONN_OK = "CONEXIÓN CORRECTA";
    private static final String DB_MSQ_CONN_NO = "ERROR EN LA CONEXIÓN";
    String url = "jdbc:mysql://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME+"?serverTimezone=UTC";
    // Configuración de la tabla Contenido
    private static final String DB_CLI = "contenido";
    private static final String DB_CLI_SELECT = "SELECT * FROM " + DB_CLI;
    private static final String DB_CLI_ID = "id";
    private static final String DB_CLI_NOM = "nombre";
    private static final String DB_CLI_DIR = "director";
    //CONTINUAR AQUIIIIIIIIIIIIIIIIIIIIIIIII
    
    /**
     * Intenta cargar el JDBC driver.
     * @return true si pudo cargar el driver, false en caso contrario
     */
    public static boolean loadDriver() {
        try {
            System.out.print("Cargando Driver...");
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            System.out.println("OK!");
            return true;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    /**
     * Intenta conectar con la base de datos.
     *
     * @return true si pudo conectarse, false en caso contrario
     */
    public static boolean connect() {
        try {
            System.out.print("Conectando a la base de datos...");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("OK!");
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    /**
     * Comprueba la conexión y muestra su estado por pantalla
     *
     * @return true si la conexión existe y es válida, false en caso contrario
     */
    public static boolean isConnected() {
        // Comprobamos estado de la conexión
        try {
            if (conn != null && conn.isValid(0)) {
                System.out.println(DB_MSQ_CONN_OK);
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(DB_MSQ_CONN_NO);
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * Cierra la conexión con la base de datos
     */
    public static void close() {
        try {
            System.out.print("Cerrando la conexión...");
            conn.close();
            System.out.println("OK!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
 

    
    
    
    //INSERTAR O BORRAR CONTENIDO A LA BBDD
    public static void añadirContenido(String nombre, String descripcion, String director, int temporadas, String duracion, String tipo) throws ClassNotFoundException, SQLException{
                
        //INSERCCION
        try{
  
            loadDriver();
            connect();
            
            // Preparamos un statement para hacer la inserción del registro.
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO contenido VALUES (?,?,?,?,?,?,?,?)");
            //aunque en la bbdd es int, para poder setearlo a null(porque es autoncremental) ha de ser String
            stmt.setString(1, null);
            stmt.setString(2, nombre);
            stmt.setString(3, director);
            stmt.setString(4, descripcion);
            stmt.setInt(5, temporadas);
            stmt.setString(6, duracion);
            stmt.setString(7, null);
            stmt.setString(8, tipo);
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El contenido se ha insertado correctamente");
             
            
        }catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "El contenido no se ha podido insertar correctamente");
        
    
        }
        conn.close();
        
    
    }
     public static void añadirGeneroContenido(int idCont, int idGen) throws ClassNotFoundException, SQLException{
                
        //INSERCCION
        try{
  
            loadDriver();
            connect();
            
            // Preparamos un statement para hacer la inserción del registro.
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO generocontenido VALUES (?,?,?)");
            //aunque en la bbdd es int, para poder setearlo a null(porque es autoncremental) ha de ser String 
            stmt.setString(1, null);
            stmt.setInt(2, idCont);
            stmt.setInt(3, idGen);
           
            System.out.println(stmt);
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El registro de generoContenido se ha insertado correctamente");
             
            
        }catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "El registro de generoContenido no se ha podido insertar correctamente");
        
    
        }
        conn.close();
        
    
    }
    //borrar genero o contenido segun el string tabla que le pasamos
    public static void borrarRegistro(String id,String tabla) throws SQLException{
        String sql="";
        try{
            loadDriver();
            connect();
            
            // Preparamos un statement para hacer el borrado del registro.
            if("Contenido".equals(tabla)){
                sql="DELETE FROM contenido WHERE id='"+id+"'";
            }else if("Genero".equals(tabla)){
                sql="DELETE FROM genero WHERE id='"+id+"'";
            }
            
            PreparedStatement stmt = conn.prepareStatement(sql);            
            
            stmt.executeUpdate();
            //System.out.println("se ha borrado el contenido correctamente!");
            JOptionPane.showMessageDialog(null, "El registro de la tabla: "+ tabla+", se ha borrado correctamente");
            
        }catch (SQLException e) {
        e.printStackTrace();
        
    
        }
        conn.close();
        
    }
    //Con esta funcion se devuelven la lista de generos, contenidos 
    public static ArrayList getListas(String sql,String lista) throws ClassNotFoundException{
        //ArrayList listaGeneros= new ArrayList();
        //ArrayList listaContenido=new ArrayList();
        ArrayList listaDevolver=new ArrayList();
        Genero nGenero= null;
        
        Contenido nContenido=null;
        
        
        try {
            loadDriver();
            connect();
            // Obtenemos un Statement de la conexión
            Statement st = conn.createStatement();
            // Ejecutamos una consulta SELECT para obtener la tabla que deseamos
            
            ResultSet rs = st.executeQuery(sql);
            
            // Recorremos todo el ResultSet y guardamos los datos en un nuevo objeto que
            //insertamos en el arraylist de listaDevolver
       
            //si  lista=genero devolvemos arraylist de onjetos genero
            if("Generos".equals(lista)){
                while(rs.next()) {
                    nGenero= new Genero(0,"Nombre");
                    nGenero.setIdgenero(rs.getInt("idgenero"));
                    nGenero.setNombre(rs.getString("Nombre"));

                    listaDevolver.add(nGenero);
                }
            
            //si  lista=contenido devolvemos arraylist de onjetos contenido
            }else if("Contenidos".equals(lista)){
                while(rs.next()) {
                     nContenido= new Contenido("Nombre", "Director", "Tipo", "Descripcion", "Duracion", "Imagen", 0, 0);
                     nContenido.setId(rs.getInt("id"));
                     nContenido.setNombre(rs.getString("Nombre"));      
                     nContenido.setDirector(rs.getString("Director"));
                     nContenido.setDescripcion(rs.getString("Descripcion"));
                     nContenido.setTemporadas(rs.getInt("Temporadas"));
                     nContenido.setDuracion(rs.getString("Duracion"));
                     nContenido.setImagen(rs.getString("Imagen"));
                     nContenido.setTipo(rs.getString("Tipo"));
                     System.out.println(nContenido.toString());

                     listaDevolver.add(nContenido);
                }
            }
            // Cerramos el statement y la conexión
            st.close();
            conn.close();
        }
        
       catch (SQLException e) {
        e.printStackTrace();
        }
       //devolvemos el array de objetos contenido
        return listaDevolver;
    
    }
    /**
     * 
     * @param nombre el nombre del contenido del que queremos sacar el id
     * @return el  id del contenido
     */
    public static int getIdCont(String nombre){
        
        int idCon=0;
        loadDriver();
        connect();
        String sql="SELECT id from contenido where Nombre=\""+ nombre+ "\";";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //st.close();
            
            //guardo en el arraylist el nombre y la altura
            while(rs.next()){
                 idCon=rs.getInt("id");
            }
            
          
            return idCon;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    
    
    
    }
    /*
    public void mostrarContenido(){
    
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
    }*/
}

