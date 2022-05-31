package Funciones;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class funcionesBBDD {

    //Valores donde recogeremos todos los valores del usuario
    //Definicion de las  clases que ejecutaremos en la conexion a la BD
    private static Connection conn = null;


    // Configuración de la conexión a la base de datos
    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "3307";
    private static final String DB_NAME = "megaflix";
    private static final String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME + "?serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "1231";
    private static final String DB_MSQ_CONN_OK = "CONEXIÓN CORRECTA";
    private static final String DB_MSQ_CONN_NO = "ERROR EN LA CONEXIÓN";

    //////////////////////////////////////////////////
    // MÉTODOS DE CONEXIÓN A LA BASE DE DATOS
    //////////////////////////////////////////////////
    ;
    
    /**
     * Intenta cargar el JDBC driver.
     * @return true si pudo cargar el driver, false en caso contrario
     */
    public static void loadDriver() {
        try {
            System.out.print("Cargando Driver...");
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            System.out.println("OK!");

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

    /**
     * Intenta conectar con la base de datos.
     *
     * @return true si pudo conectarse, false en caso contrario
     */
    public static Connection connect() {
        try {
            System.out.print("Conectando a la base de datos...");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("OK!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
    /**
     * Comprueba la conexión y muestra su estado por pantalla
     *
     * @return true si la conexión existe y es válida, false en caso contrario
     */
    public static boolean isConnected() {
        boolean estado=false;
        try {
            if (conn != null && conn.isValid(0)) {
                System.out.println(DB_MSQ_CONN_OK);
                estado=true;
            } else{
                estado=false;
            }
        } catch (SQLException ex) {
            System.out.println(DB_MSQ_CONN_NO);
            ex.printStackTrace();

        }
        System.out.println(estado);
        return estado;
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






}
