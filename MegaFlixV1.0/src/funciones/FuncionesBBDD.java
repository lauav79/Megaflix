package funciones;

import Contenido.Contenido;
import Valoraciones.Valoracion;
import Genero.Genero;
import Genero.GeneroContenido;
import Persona.Usuario;
import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FuncionesBBDD {

    //prueba
    static Clip clip;
    static Long nowFrame;
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
    String url = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME + "?serverTimezone=UTC";
    // Configuración de la tabla Contenido
    private static final String DB_CLI = "contenido";
    private static final String DB_CLI_SELECT = "SELECT * FROM " + DB_CLI;
    private static final String DB_CLI_ID = "id";
    private static final String DB_CLI_NOM = "nombre";
    private static final String DB_CLI_DIR = "director";
    //CONTINUAR AQUIIIIIIIIIIIIIIIIIIIIIIIII

    /**
     * Intenta cargar el JDBC driver.
     *
     * @return true si pudo cargar el driver, false en caso contrario
     */
    public static boolean loadDriver() {
        try {
            System.out.print("Cargando Driver...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("OK!");
            return true;
        } catch (ClassNotFoundException ex) {
            return false;
        } catch (Exception ex) {
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
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
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
            pararSonido();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //INSERTAR O BORRAR CONTENIDO A LA BBDD
    public static void añadirContenido(String nombre, String descripcion, String director, int temporadas, String duracion, String tipo) throws ClassNotFoundException, SQLException {

        //INSERCCION
        try {

            loadDriver();
            connect();

            // Preparamos un statement para hacer la inserción del registro.
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO contenido VALUES (?,?,?,?,?,?,?,?)");
            //aunque en la bbdd es int, para poder setearlo a null(porque es autoncremental) ha de ser String
            //le quito los espacios al nombre para guardar la imagen
            String nombreSinEsp = nombre.replace(" ", "");
            String rutaImg = "./src/imagenes/" + nombreSinEsp + ".jpg";

            stmt.setString(1, null);
            stmt.setString(2, nombre);
            stmt.setString(3, director);
            stmt.setString(4, descripcion);
            stmt.setInt(5, temporadas);
            stmt.setString(6, duracion);
            stmt.setString(7, rutaImg);
            stmt.setString(8, tipo);

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El contenido se ha insertado correctamente, no olvides añadir a mano la imagen en la ruta ./src/imagenes/");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "El contenido no se ha podido insertar correctamente");

        }
        conn.close();

    }

    public static void añadirGeneroContenido(int idCont, int idGen) throws ClassNotFoundException, SQLException {

        //INSERCCION
        try {

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

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "El registro de generoContenido no se ha podido insertar correctamente");

        }
        conn.close();

    }

    public static void añadirGenero(String nombre) throws ClassNotFoundException, SQLException {

        //INSERCCION
        try {

            loadDriver();
            connect();

            // Preparamos un statement para hacer la inserción del registro.
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO genero VALUES (?,?)");
            //aunque en la bbdd es int, para poder setearlo a null(porque es autoncremental) ha de ser String 
            stmt.setString(1, null);
            stmt.setString(2, nombre);;

            //System.out.println(stmt);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El registro de Género se ha insertado correctamente");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "El registro de Género no se ha podido insertar correctamente");

        }
        conn.close();

    }

    //borrar genero o contenido segun el string tabla que le pasamos
    public static void borrarRegistro(String id, String tabla) throws SQLException {
        String sql = "";
        try {
            loadDriver();
            connect();

            // Preparamos un statement para hacer el borrado del registro.
            if ("Contenido".equals(tabla)) {
                sql = "DELETE FROM contenido WHERE id='" + id + "'";
            } else if ("Genero".equals(tabla)) {
                sql = "DELETE FROM genero WHERE idgenero='" + id + "'";
            }

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.executeUpdate();
            //System.out.println("se ha borrado el contenido correctamente!");
            JOptionPane.showMessageDialog(null, "El registro de la tabla: " + tabla + ", se ha borrado correctamente");

        } catch (SQLException e) {
            e.printStackTrace();

        }
        conn.close();

    }

    //Con esta funcion se devuelven la lista de generos, contenidos 
    @SuppressWarnings("unchecked")
    public static ArrayList getListas(String sql, String lista) throws ClassNotFoundException {
        //ArrayList listaGeneros= new ArrayList();
        //ArrayList listaContenido=new ArrayList();
        ArrayList listaDevolver = new ArrayList();
        Genero nGenero = null;
        Valoracion nValoracion = null;
        Contenido nContenido = null;
        GeneroContenido nGenCon = null;

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
            if ("Generos".equals(lista)) {
                while (rs.next()) {
                    nGenero = new Genero(0, "Nombre");
                    nGenero.setIdgenero(rs.getInt("idgenero"));
                    nGenero.setNombre(rs.getString("Nombre"));

                    listaDevolver.add(nGenero);
                }

                //si  lista=contenido devolvemos arraylist de onjetos contenido
            } else if ("Comentarios".equals(lista)) {
                while (rs.next()) {
                    nValoracion = new Valoracion(0, 0, 0, 0, "Comentario");
                    nValoracion.setId(rs.getInt("id"));
                    nValoracion.setIdContenido(rs.getInt("idContenido"));
                    nValoracion.setIdUser(rs.getInt("idUsuario"));
                    nValoracion.setComentario(rs.getString("Comentario"));
                    nValoracion.setPuntuacion(rs.getDouble("Puntuacion"));

                    listaDevolver.add(nValoracion);
                }

            } else if ("Contenidos".equals(lista)) {
                while (rs.next()) {
                    //int id, String nom, String dir, String des, int tem, String dur, String ima, String tipo
                    nContenido = new Contenido(0, "nombre", "dir", "des", 0, "dur","img", "tipo");
                    nContenido.setId(rs.getInt("id"));
                    nContenido.setNombre(rs.getString("Nombre"));
                    nContenido.setDirector(rs.getString("Director"));
                    nContenido.setDescripcion(rs.getString("Descripcion"));
                    nContenido.setTemporadas(rs.getInt("Temporadas"));
                    nContenido.setDuracion(rs.getString("Duracion"));
                    nContenido.setImagen(rs.getString("Imagen"));
                    nContenido.setTipoContenido(rs.getString("Tipo"));
                    System.out.println(nContenido.toString());

                    listaDevolver.add(nContenido);
                }
            } else if ("GenerosContenido".equals(lista)) {
                while (rs.next()) {
                    nGenCon = new GeneroContenido("NombreGenero", 0, 0, 0);
                    nGenCon.setNombreGen(rs.getString("Nombre"));
                    nGenCon.setIdGenCon(rs.getInt("id"));
                    nGenCon.setIdCont(rs.getInt("idContenido"));
                    nGenCon.setIdCont(rs.getInt("idgenero"));
                    listaDevolver.add(nGenCon);

                }

            }
            // Cerramos el statement y la conexión
            st.close();
            conn.close();
        } catch (SQLException e) {
        }
        //devolvemos el array de objetos contenido
        return listaDevolver;

    }
    /**
     * 
     * @return arraylist de nombres del contenido
     */
    public static ArrayList getNombreContenidos() {
        ArrayList<String> nombresCont = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = connect2();
            String SQL = "SELECT Nombre FROM `contenido`";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                String nombreCont = rs.getString("Nombre");
                nombresCont.add(nombreCont);
            }
        } catch (SQLException ex) {
        }

        return nombresCont;
    }

    /**
     *
     * @param nombre el nombre del contenido del que queremos sacar el id
     * @return el id del contenido
     */
    public static int getIdCont(String nombre) {

        int idCon = 0;
        loadDriver();
        connect();
        String sql = "SELECT id from contenido where Nombre=\"" + nombre + "\";";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //st.close();

            //guardo en el arraylist el nombre y la altura
            while (rs.next()) {
                idCon = rs.getInt("id");
            }

            return idCon;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }

    }

    public static String getImagenCont(int id) throws SQLException {
        String sql = sql = "SELECT Imagen FROM contenido WHERE id=" + id;
        String img = "";
        try {
            FuncionesBBDD.loadDriver();
            FuncionesBBDD.connect();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                img = (rs.getString("Imagen"));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        conn.close();
        return img;
    }

    public static void añadirComentario(String coment, double punt, int idUser, int idCont) throws SQLException {
        try {

            loadDriver();
            connect();

            // Preparamos un statement para hacer la inserción del registro.
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO usuariovaloracontenido VALUES (?,?,?,?,?)");
            //aunque en la bbdd es int, para poder setearlo a null(porque es autoncremental) ha de ser String 
            stmt.setString(1, null);
            stmt.setInt(2, idUser);
            stmt.setInt(3, idCont);
            stmt.setDouble(4, punt);
            stmt.setString(5, coment);

            System.out.println(stmt);

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tu comentario se ha publicado correctamente");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Tu comentario no se ha podido publicar correctamente");

        }
        conn.close();

    }
    
    

    /**
     * Comprueba que el usuario y la contraseña con correctas y crea el usuario
     * con los datos del que se acaba de loguear.
     * @param user nombre de usuario introducido
     * @param pass contraseña introducida
     */
    public static void iniciosesion(String user, String pass) {
        try {
            loadDriver();
            connect();
            String SQL = "SELECT * FROM usuarios WHERE Alias=\"" + user + "\"";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                int idu = rs.getInt("id");
                String ali = rs.getString("Alias");
                String nom = rs.getString("Nombre");
                String pas = rs.getString("passwd");
                String bio = rs.getString("Bio");
                String tUser = rs.getString("TipoUsuario");
                String imagen = rs.getString("Imagen");
                System.out.println(ali + " " + pas);
                Usuario.user1.setNombre(nom);
                Usuario.user1.setAlias(ali);
                Usuario.user1.setBiogra(bio);
                Usuario.user1.setId(idu);
                Usuario.user1.setPassw(pas);
                Usuario.user1.setTipoUser(tUser);
                Usuario.user1.setImagen(imagen);
            }
        } catch (SQLException ex) {
        }

    }
    DefaultListModel defaultListmodel = new DefaultListModel();

    /**
     * 
    */
    public static ArrayList getContenidos() {
        ArrayList<String> stars = new ArrayList<>();
        try {
            Connection conn = connect2();
            String SQL = "SELECT Nombre FROM `contenido`";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                String nom = rs.getString("Nombre");
                stars.add(nom);
            }
        } catch (SQLException ex) {
        }

        return stars;
    }

    public static Connection connect2() {
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    public static void reproducirSonido() {
        try {

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("cancionFondo.wav"));
            clip = AudioSystem.getClip();
            clip.setMicrosecondPosition(0);
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }

    //Para el sonido para que al cerrar sesion no se reproduzcan dos simultáneamente
    public static void pararSonido() {
        clip.stop();
        clip.close();
    }

    public static void eliminarUsuario(int idUser) throws SQLException {
        try {
            Connection conn = connect2();
            String SQL = "DELETE FROM usuarios " + "WHERE Id =" + idUser;
            Statement st = conn.prepareStatement(SQL);
            st.executeUpdate(SQL);

        } catch (SQLException e) {

        }
    }
}
