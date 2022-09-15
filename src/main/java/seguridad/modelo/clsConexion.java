package seguridad.modelo;

import java.sql.*;

public class clsConexion {
    private static final String ip =  "192.168.1.101";  //MARCO GATICA
    private static final String ip2 = "192.168.1.101"; //ING. EDELAGUILA
    private static final String ip3 = "192.168.1.101"; //CARLOS GUZMAN
    private static final String ip4 = "192.168.1.101"; //EDGAR ROBLERO
    private static final String ip5 = "192.168.1.101"; //JUAN SANDOVAL
    private static final String ip6 = "192.168.1.101"; //OMAR CIFUENTES
    private static final String ip7 = "192.168.1.101"; //BYRON BARRIENTOS
    
//  private static final String JDBC_URL = "jdbc:mysql://localhost/proyectob222022?'useSSL=false&serverTimezone=UTC";
    private static final String JDBC_URL = "jdbc:mysql://"+ ip +"/proyectobd122022?useSSL=false&serverTimezone=UTC";    
    private static final String JDBC_USER = "remoto";
    private static final String JDBC_PASS = "picodediamante777";
    
   
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }
    
}
