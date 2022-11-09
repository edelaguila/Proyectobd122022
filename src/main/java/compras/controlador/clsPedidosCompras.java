/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compras.controlador;

/**
 *
 * @author visitante
 */
public class clsPedidosCompras {
    //declaracion de variable para Vendedores 
    String pce_documento;
    int procodigo;
    String pce_fecha;
    
    int prodcodigo;
    int pce_cantidad_producto;
    int pce_total_producto;

    public clsPedidosCompras() {
    }

    public clsPedidosCompras(String pce_documento, int procodigo, String pce_fecha, int prodcodigo, int pce_cantidad_producto, int pce_total_producto) {
        this.pce_documento = pce_documento;
        this.procodigo = procodigo;
        this.pce_fecha = pce_fecha;
        this.prodcodigo = prodcodigo;
        this.pce_cantidad_producto = pce_cantidad_producto;
        this.pce_total_producto = pce_total_producto;
    }

    public String getPce_documento() {
        return pce_documento;
    }

    public void setPce_documento(String pce_documento) {
        this.pce_documento = pce_documento;
    }

    public int getProcodigo() {
        return procodigo;
    }

    public void setProcodigo(int procodigo) {
        this.procodigo = procodigo;
    }

    public String getPce_fecha() {
        return pce_fecha;
    }

    public void setPce_fecha(String pce_fecha) {
        this.pce_fecha = pce_fecha;
    }

    public int getProdcodigo() {
        return prodcodigo;
    }

    public void setProdcodigo(int prodcodigo) {
        this.prodcodigo = prodcodigo;
    }

    public int getPce_cantidad_producto() {
        return pce_cantidad_producto;
    }

    public void setPce_cantidad_producto(int pce_cantidad_producto) {
        this.pce_cantidad_producto = pce_cantidad_producto;
    }

    public int getPce_total_producto() {
        return pce_total_producto;
    }

    public void setPce_total_producto(int pce_total_producto) {
        this.pce_total_producto = pce_total_producto;
    }

    @Override
    public String toString() {
        return "clsPedidosCompras{" + "pce_documento=" + pce_documento + ", procodigo=" + procodigo + ", pce_fecha=" + pce_fecha + ", prodcodigo=" + prodcodigo + ", pce_cantidad_producto=" + pce_cantidad_producto + ", pce_total_producto=" + pce_total_producto + '}';
    }
    
    }
