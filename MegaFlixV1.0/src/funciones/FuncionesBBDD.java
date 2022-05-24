package funciones;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;



public class FuncionesBBDD {
    //prueba
    
    public static void main(String[] args) throws ClassNotFoundException {
        FuncionesBBDD.loadDriver();
        FuncionesBBDD.connect();
        FuncionesBBDD.isConnected();
        FuncionesBBDD.close();
        FuncionesBBDD.isConnected();
        
        //prueba de insert
        String name="contenido1";
        String desc="probando probando";
        String dire="director inventado";
        int temp=1;
        String dura="null";
        String tipo="Series";
        
        FuncionesBBDD.añadirContenido(name,desc,dire,temp,dura,tipo);
        //String nombre, String descripcion, String director, int temporadas, String duracion, String tipo
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
    public static void añadirContenido(String nombre, String descripcion, String director, int temporadas, String duracion, String tipo) throws ClassNotFoundException{
                
        //INSERCCION
        try{
           // Cargamos la clase que implementa el Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Creamos una nueva conexión a la base de datos 'Megaflix'
            String url = "jdbc:mysql://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME+"?serverTimezone=UTC";
            Connection conn = (Connection) DriverManager.getConnection(url,"root","toor");
            
            // Preparamos un statement para hacer la inserción del registro.
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO contenido VALUES (?,?,?,?,?,?,?,?)");
            stmt.setString(1, null);
            stmt.setString(2, nombre);
            stmt.setString(3, director);
            stmt.setString(4, descripcion);
            stmt.setInt(5, temporadas);
            stmt.setString(6, duracion);
            stmt.setString(7, null);
            stmt.setString(8, tipo);
            
            stmt.executeUpdate();
             
            
        }catch (SQLException e) {
        e.printStackTrace();
        
    
        }
    
    }
}

