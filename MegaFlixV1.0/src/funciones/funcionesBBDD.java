package Funciones;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class funcionesBBDD {

    // Conexión a la base de datos
    private static Connection conn = null;
    private static Statement st = null;

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
    private static final String DB_CON = "contenido";
    private static final String DB_CON_SELECT = "SELECT * FROM " + DB_CON;
    private static final String DB_CON_ID = "Id";
    private static final String DB_CON_NOM = "Nombre";
    private static final String DB_CON_DIR = "Director";
    private static final String DB_CON_DES = "Descripcion";
    private static final String DB_CON_TEM = "Temporadas";
    private static final String DB_CON_DUR = "Duracion";
    private static final String DB_CON_IMG = "Imagen";
    private static final String DB_CON_TIP = "Tipo";

    //Configuración tabla genero
    private static final String DB_GEN = "genero";
    private static final String DB_GEN_SELECT = "SELECT * FROM " + DB_GEN;
    private static final String DB_GEN_IDG = "idgenero";
    private static final String DB_GEN_NOM = "Nombre";

    //Configuracion de la tabla generocontenido
    private static final String DB_GNC = "generocontenido";
    private static final String DB_GNC_SELECT = "SELECT * FROM " + DB_GNC;
    private static final String DB_GNC_ID = "id";
    private static final String DB_GNC_IDC = "idContenido";
    private static final String DB_GNC_IDG = "idgenero";

    //Configuracion de la tabla usuarios
    private static final String DB_USU = "usuarios";
    private static final String DB_USU_SELECT = "SELECT * FROM " + DB_USU;
    private static final String DB_USU_ID = "Id";
    private static final String DB_USU_NOM = "Nombre";
    private static final String DB_USU_ALI = "Alias";
    private static final String DB_USU_PAS = "passwd";
    private static final String DB_USU_BIO = "Bio";
    private static final String DB_USU_TIP = "TipoUsuario";
    private static final String DB_UAP_SELECT = "SELECT " + DB_USU_ALI+","+DB_USU_PAS + " FROM " + DB_USU;


    //Configuracion de la tabla usuariovaloracontenido
    private static final String DB_UVC = "usuariovalocacontenido";
    private static final String DB_UVC_SELECT = "SELECT * FROM " + DB_UVC;
    private static final String DB_UVC_ID = "Id";
    private static final String DB_UVC_IDU = "idUsuario";
    private static final String DB_UVC_IDC = "idContenido";
    private static final String DB_UVC_PUN = "Puntuacion";
    private static final String DB_UVC_COM = "Comentario";

    //////////////////////////////////////////////////
    // MÉTODOS DE CONEXIÓN A LA BASE DE DATOS
    //////////////////////////////////////////////////
    ;
    
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
public static boolean busquedacontenido(){
    boolean acceso=false;
    return acceso;
}
    public static boolean iniciosesion(String user, String pass) {
        boolean acceso = false;
        try {
            String SQL = DB_UAP_SELECT;
            st=conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                String ali = rs.getString(DB_USU_ALI);
                String pas = rs.getString(DB_USU_PAS);
                if (ali.equals(user) && pas.equals(pass)) {

                    acceso = true;
                }
            }
            return acceso;

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return acceso;

    }
}
