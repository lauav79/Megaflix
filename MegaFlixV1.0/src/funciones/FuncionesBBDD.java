package funciones;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;



public class FuncionesBBDD {
    //prueba
    
    public static void main(String[] args) {
        FuncionesBBDD.loadDriver();
        FuncionesBBDD.connect();
        FuncionesBBDD.isConnected();
        FuncionesBBDD.close();
        FuncionesBBDD.isConnected();
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
    ////tabla contenido
    public static ResultSet getTablaContenido(int resultSetType, int resultSetConcurrency) {
        try {
            Statement stmt = conn.createStatement(resultSetType, resultSetConcurrency);
            ResultSet rs = stmt.executeQuery(DB_CLI_SELECT);
            //stmt.close();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }

    /**
     * Obtiene toda la tabla clientes de la base de datos
     *
     * @return ResultSet (por defecto) con la tabla, null en caso de error
     */
    public static ResultSet getTablaClientes() {
        return getTablaClientes(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
    }
    
    
    //INSERTAR O BORRAR CONTENIDO A LA BBDD
    public static void añadirContenido(String nombre, String descripcion, String director, int temporadas, String duracion, String tipo){
        /*
        ejemplo INSERT INTO contenido VALUES
        (null,'Ultrasecretos','Shion Takeuchi',
        '¿Los lagartos humanoides? Existen. ¿El alunizaje? Nunca sucedió. Esta genia asocial y sus disfuncionales compañeros de trabajo investigan conspiraciones mundiales. Comedia animada ambientada en un gobierno secreto donde abundan las teorías conspirativas.'
        ,1
        ,null,
        'Ultrasecretos',
        'Series');
        
        */
        //https://www.cablenaranja.com/como-insertar-datos-desde-una-aplicacion-java-hacia-mysql/
        //EN CONSTRUCCION(PROBAR SI FUNCIONA EL INSERT)
        String sql;
        if("Series".equals(tipo)){
            sql = "insert into contenido(null, nombre, director, descripcion, temporadas, null, imagen,tipo) values(?,?,?,?,?,?)";
        }
        if("Peliculas".equals(tipo)){
            sql = "insert into contenido(null, nombre, director, descripcion, null, duracion, imagen,tipo) values(?,?,?,?,?,?)";
        }
        
        //INSERCCION
        try{
            // Obtenemos la tabla contenido
            System.out.print("Insertando contenido " + nombre + "...");
            ResultSet rs = getTablaClientes(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
        
    
    }
    
    
}
