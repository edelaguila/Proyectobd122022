/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.controlador;

/**
 *
 * @author visitante
 */
public class clsModulos {
    int aplid;
    String aplnombre;
    String aplestatus;

    public clsModulos() {
    }

    public clsModulos(int id_aplicacion) {
        this.aplid= id_aplicacion;
    }

    public clsModulos(String nombreAplicacion, String estadoAplicacion) {
        this.aplnombre = nombreAplicacion;
        this.aplestatus = estadoAplicacion;
    }

    public int getId_aplicacion() {
        return aplid;
    }

    public void setId_aplicacion(int id_aplicacion) {
        this.aplid = id_aplicacion;
    }

    public String getNombreAplicacion() {
        return aplnombre;
    }

    public void setNombreAplicacion(String nombreAplicacion) {
        this.aplnombre = nombreAplicacion;
    }

    public String getestadoAplicacion() {
        return aplestatus;
    }

    public void setestadoAplicacion(String estadoAplicacion) {
        this.aplestatus = estadoAplicacion;
    }

    @Override
    public String toString() {
        return "tbl_aplicacion{" + "aplid=" + aplid + ", aplnombre=" + aplnombre + ", aplestatus=" + aplestatus + '}';
    }
    
}
