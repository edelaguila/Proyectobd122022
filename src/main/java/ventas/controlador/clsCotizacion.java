/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.controlador;



/**
 *
 * @author visitante
 */
public class clsCotizacion {
    String cve_documento;
    int clicodigo;
    String cve_fecha;
    
    int prodcodigo;
    int cvd_cantidad_producto;
    int cvd_total_producto;



    public clsCotizacion() {
    }

    public clsCotizacion(String veedocumento) {
    this.cve_documento = cve_documento;
    }

     public clsCotizacion(String cve_documento, int clicodigo, String cve_fecha, int prodcodigo,int cvd_cantidad_producto, int cvd_total_producto) {
         
        this.cve_documento = cve_documento;
        this.clicodigo = clicodigo;
        this.cve_fecha = cve_fecha;
        this.prodcodigo = prodcodigo;
        this.cvd_cantidad_producto = cvd_cantidad_producto;
        this.cvd_total_producto = cvd_total_producto;
        this.prodcodigo = prodcodigo;
    }



public String Getcve_documento() {
        return cve_documento;
    }

    public void Setcve_documento(String cve_documento) {
        this.cve_documento = cve_documento;
    }


    public int Getclicodigo() {
        return clicodigo;
    }

    public void Setclicodigo(int clicodigo) {
        this.clicodigo = clicodigo;
    }

    public String Getcve_fecha() {
        return cve_fecha;
    }

    public void Setcve_fecha(String cve_fecha) {
        this.cve_fecha = cve_fecha;
    }

    public int Getprodcodigo() {
        return prodcodigo;
    }

    public void Setprodcodigo(int prodcodigo) {
        this.prodcodigo = prodcodigo;
    }
    
    public int Getcvd_cantidad_producto() {
        return cvd_cantidad_producto;
    }

    public void Setcvd_cantidad_producto(int cvd_cantidad_producto) {
        this.cvd_cantidad_producto = cvd_cantidad_producto;
    }
    
    public int Getcvd_total_producto() {
        return cvd_total_producto;
    }

    public void Setcvd_total_producto(int cvd_total_producto) {
        this.cvd_total_producto = cvd_total_producto;
    }
   


    @Override
    public String toString() {
         return "tbl_vendedores{" + "cve_documento =" + cve_documento + ", clicodigo=" + clicodigo + ", cve_fecha=" + cve_fecha + ", prodcodigo=" + prodcodigo +", cvd_cantidad_producto=" +'}';
    }
    
}
