/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.modelo;

import ventas.controlador.clsVentas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import seguridad.modelo.clsConexion;
import ventas.controlador.clsCotizacion;

/**
 *
 * @author visitante
 */
public class daoCotizacion {

    private static final String SQL_SELECT = "SELECT cve_documento, clicodigo, cve_fecha, cve_total, cve_estatus FROM cotizacion_ventas_encabezado";
    private static final String SQL_SELECT2 = "SELECT cve_documento, cvd_orden, prodcodigo, cvd_cantidad_producto, cvd_costo_producto FROM cotizacion_ventas_detalle";
    
    private static final String SQL_INSERT = "INSERT INTO cotizacion_ventas_encabezado(cve_documento, clicodigo, cve_fecha, cve_total, cve_estatus) VALUES(?, ?, ?, ?, ?)";
    private static final String SQL_INSERT2 = "INSERT INTO cotizacion_ventas_detalle(cve_documento, cvd_orden, prodcodigo, cvd_cantidad_producto, cvd_costo_producto) VALUES(?, ?, ?, ?, ?)";
    
    //private static final String SQL_UPDATE = "UPDATE cotizacion_ventas_encabezado SET clicodigo=?, cve_fecha=?, veetotal=?, veeestatus=?  WHERE cve_documento = ?";
    private static final String SQL_UPDATE = "UPDATE proyectobd122022.cotizacion_ventas_encabezado SET clicodigo = ?, cve_fecha = ?, cve_total = ?, cve_estatus = ? WHERE (cve_documento = ?)";
    //private static final String SQL_UPDATE2 = "UPDATE cotizacion_ventas_detalle SET prodcodigo=?, prodcodigo=?, vedcantidad=?, vedprecio=?, bodcodigo=? WHERE cve_documento = ?";
    private static final String SQL_UPDATE2 = "UPDATE proyectobd122022.cotizacion_ventas_detalle SET cvd_orden = ?, prodcodigo = ?, cvd_cantidad_producto = ?, cvd_costo_producto WHERE (cve_documento = ?)";

    private static final String SQL_DELETE = "DELETE FROM proyectobd122022.cotizacion_ventas_encabezado WHERE (cve_documento = ?)";
    private static final String SQL_DELETE2 = "DELETE FROM proyectobd122022.cotizacion_ventas_detalle WHERE (cve_documento = ?)";

    private static final String SQL_QUERY = "SELECT cve_documento, clicodigo, cve_fecha, cve_total, cve_estatus WHERE cve_documento = ?";
    private static final String SQL_QUERY2 = "SELECT cve_documento, cvd_orden, prodcodigo, cvd_cantidad_producto, cvd_costo_producto WHERE cve_documento = ?";


    public List<clsCotizacion> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        clsVentas venta = null;
        List<clsCotizacion> ventas = new ArrayList<clsVentas>();

        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String cve_documento = rs.getString("cve_documento");
                int clicodigo = rs.getInt("clicodigo");
                String cve_fecha = rs.getString("cve_fecha");
                int cve_total = rs.getInt("cve_total");
                String cve_estatus = rs.getString("cve_estatus");


                venta = new clsVentas();
                venta.Setvedcodigo(cve_documento);
                venta.Setclicodigo(clicodigo);
                venta.set(cve_fecha);
                venta.Setveetotal(cve_total);
                venta.Setveeestatus(cve_estatus);

                
                ventas.add(venta);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return ventas;
    }
    
        public List<clsVentas> select2() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        clsVentas venta = null;
        List<clsVentas> ventas = new ArrayList<clsVentas>();

        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT2);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String cve_documento = rs.getString("cve_documento");
                int vedorden = rs.getInt("vedorden");
                int prodcodigo = rs.getInt("prodcodigo");
                int vedcantidad = rs.getInt("vedcantidad");
                int vedprecio = rs.getInt("vedprecio");
                int bodcodigo = rs.getInt("bodcodigo");



                venta = new clsVentas();
                venta.Setvedcodigo(cve_documento);
                venta.Setvedorden(vedorden);
                venta.Setprodcodigo(prodcodigo);
                venta.Setvedcantidad(vedcantidad);
                venta.Setvedprecio(vedprecio);
                venta.Setbodcodigo(bodcodigo);

                
                ventas.add(venta);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return ventas;
    }

    public int insert(clsVentas vanta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, vanta.Getcve_documento());
            stmt.setInt(2, vanta.Getclicodigo());
            stmt.setString(3, vanta.Getcve_fecha());
            stmt.setFloat(4, vanta.Getveetotal());
            stmt.setString(5, vanta.Getveeestatus());



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
    
        public int insert2(clsVentas vanta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT2);
            stmt.setString(1, vanta.Getcve_documento());
            stmt.setInt(2, vanta.Getvedorden());
            stmt.setInt(3, vanta.Getprodcodigo());
            stmt.setInt(4, vanta.Getvedcantidad());
            stmt.setInt(5, vanta.Getvedprecio());
            stmt.setInt(6, vanta.Getbodcodigo());



            System.out.println("ejecutando query:" + SQL_INSERT2);
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

    public int update(clsVentas vanta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, vanta.Getclicodigo());
            stmt.setString(2, vanta.Getcve_fecha());
            stmt.setInt(3, vanta.Getveetotal());
            stmt.setString(4, vanta.Getveeestatus());
            stmt.setString(5, vanta.Getcve_documento());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }
    
        public int update2(clsVentas vanta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE2);
            stmt = conn.prepareStatement(SQL_UPDATE2);
            stmt.setInt(1, vanta.Getvedorden());
            stmt.setInt(2, vanta.Getprodcodigo());
            stmt.setInt(3, vanta.Getvedcantidad());
            stmt.setInt(4, vanta.Getvedprecio());
            stmt.setInt(5, vanta.Getbodcodigo());
            stmt.setString(6, vanta.Getcve_documento());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

    public int delete(clsVentas vanta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, vanta.Getcve_documento());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }
    
        public int delete2(clsVentas vanta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE2);
            stmt = conn.prepareStatement(SQL_DELETE2);
            stmt.setString(1, vanta.Getcve_documento());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

//    public List<Persona> query(Persona vendedor) { // Si se utiliza un ArrayList
    public clsVentas query(clsVentas vanta) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<clsVentas> vendedores = new ArrayList<clsVentas>();
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, vanta.Getcve_documento());
            rs = stmt.executeQuery();
            while (rs.next()) {
                String cve_documento = rs.getString("cve_documento");
                int clicodigo = rs.getInt("clicodigo");
                String cve_fecha = rs.getString("cve_fecha");
                int veetotal = rs.getInt("veetotal");
                String veeestatus = rs.getString("veeestatus");
                
                vanta = new clsVentas();
                vanta.Setcve_documento(veedocumento);
                vanta.Setclicodigo(clicodigo);
                vanta.Setcve_fecha(cve_fecha);
                vanta.Setveetotal(veetotal);
                
                //vendedores.add(vendedor); // Si se utiliza un ArrayList
            }
            //System.out.println("Registros buscado:" + vendedor);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        //return vendedores;  // Si se utiliza un ArrayList
        return vanta;
    }
    
        public clsVentas query2(clsVentas vanta) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<clsVentas> vendedores = new ArrayList<clsVentas>();
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY2);
            stmt = conn.prepareStatement(SQL_QUERY2);
            stmt.setString(1, vanta.Getcve_documento());
            rs = stmt.executeQuery();
            while (rs.next()) {
                String cve_documento = rs.getString("cve_documento");
                int vedorden = rs.getInt("vedorden");
                int prodcodigo = rs.getInt("prodcodigo");
                int vedcantidad = rs.getInt("vedcantidad");
                int vedprecio = rs.getInt("vedprecio");
                int bodcodigo = rs.getInt("bodcodigo");
                
                vanta = new clsVentas();
                vanta.Setcve_documento(cve_documento);
                vanta.Setvedorden(vedorden);
                vanta.Setprodcodigo(prodcodigo);
                vanta.Setvedcantidad(vedcantidad);
                vanta.Setvedprecio(vedprecio);
                vanta.Setbodcodigo(bodcodigo);
                
                //vendedores.add(vendedor); // Si se utiliza un ArrayList
            }
            //System.out.println("Registros buscado:" + vendedor);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        //return vendedores;  // Si se utiliza un ArrayList
        return vanta;
    }
   
}

