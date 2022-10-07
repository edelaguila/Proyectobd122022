/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.modelo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import seguridad.controlador.clsBitacora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;

    //int id_aplicacion;
    //String nombre_aplicacion;
    //String estado_aplicacion;
/**
 *
 * @author visitante
 */
public class daoBitacora {

    private static final String SQL_SELECT = "SELECT bitid, bitfecha, bitaccion, usuid, aplid, bitip, bitnombrepc FROM tbl_bitacora";
    private static final String SQL_INSERT = "INSERT INTO tbl_bitacora(bitfecha, bitaccion, usuid, aplid, bitip, bitnombrepc) VALUES(?, ?, ?, ?, ?, ?)";
    private static final String SQL_QUERY = "SELECT bitid, bitfecha, bitaccion, usuid, aplid, bitip, bitnombrepc FROM tbl_bitacora WHERE bitfecha BETWEEN ? AND ?";    


//se agrega metodo para bitacora
//averiguar IP
    public static String fechaActual() {

        java.util.Date fecha = new java.util.Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");

        return formatoFecha.format(fecha);

    }

    public static String horaActual() {

        java.util.Date fecha = new java.util.Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("hh:mm:ss");

        return formatoFecha.format(fecha);

    }
    
    private String obtenerNombrePc(){
        return System.getProperty("user.name");
    }
            
    private String obtenerIP() throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        return ip.getHostAddress();
    }        

    public List<clsBitacora> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        clsBitacora bitacora = null;
        List<clsBitacora> bitacoras = new ArrayList<clsBitacora>();

        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_bitacora = rs.getInt("bitid");
                String fecha = rs.getString("bitfecha");
                String accion = rs.getString("bitaccion");
                String ip = rs.getString("bitip");
                String nombrepc = rs.getString("bitnombrepc");
                int id_usuario = rs.getInt("usuid");
                int id_aplicacion = rs.getInt("aplid");
                
                bitacora = new clsBitacora();
                bitacora.fSetId_Bitacora(id_bitacora);
                bitacora.fSetfecha_Bitacora(fecha);
                bitacora.fSetaccion_Bitacora(accion);
                bitacora.fSetip_Bitacora(ip);
                bitacora.fSetnombrepc_Bitacora(nombrepc);
                bitacora.fSetId_Usuario(id_usuario);
                bitacora.fSetId_Aplicacion(id_aplicacion);
                
                bitacoras.add(bitacora);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return bitacoras;
    }

    public int insert(int m_usuid, int m_aplicacion, String m_accion) {
        String ipAsignada;
        String nombrepcAsignada;
        ipAsignada = " ";
        nombrepcAsignada = " ";
        //System.out.println("Parametros Bitacora: " + m_usuid + " " + m_aplicacion + " " + m_accion);
       
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = clsConexion.getConnection();
            try {
               ipAsignada= obtenerIP();
            } catch (UnknownHostException ex)
            {
            }
            nombrepcAsignada= obtenerNombrePc();            
            stmt = conn.prepareStatement(SQL_INSERT);
                       
            stmt.setString(1, fechaActual() + " " +horaActual());
            stmt.setString(2, m_accion);
            stmt.setInt(3, m_usuid);
            stmt.setInt(4, m_aplicacion);
            stmt.setString(5, ipAsignada);
            stmt.setString(6, nombrepcAsignada);
            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }
 // Modificacion acceso a Bitacora  
    public List<clsBitacora> query( String primeraFecha, String segundaFecha )
    {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        clsBitacora bitacora = null;
        List<clsBitacora> bitacoras = new ArrayList<clsBitacora>();
        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, primeraFecha);            
            stmt.setString(2, segundaFecha);
            rs = stmt.executeQuery();
            System.out.println("query : " + stmt);
            while (rs.next()) {
                int id_bitacora = rs.getInt("bitid");
                String fecha = rs.getString("bitfecha");
                String accion = rs.getString("bitaccion");
                String ip = rs.getString("bitip");
                String nombrepc = rs.getString("bitnombrepc");
                int id_usuario = rs.getInt("usuid");
                int id_aplicacion = rs.getInt("aplid");
                
                bitacora = new clsBitacora();
                bitacora.fSetId_Bitacora(id_bitacora);
                bitacora.fSetfecha_Bitacora(fecha);
                bitacora.fSetaccion_Bitacora(accion);
                bitacora.fSetip_Bitacora(ip);
                bitacora.fSetnombrepc_Bitacora(nombrepc);
                bitacora.fSetId_Usuario(id_usuario);
                bitacora.fSetId_Aplicacion(id_aplicacion);
                
                bitacoras.add(bitacora);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return bitacoras;
    } 
}
