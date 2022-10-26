/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguridad.controlador;

public class clsUsuario {
    
    private int usuid;
    private String usunombre;
    private String usucontrasena;
    private String usuestatus;
    private String usunombrereal;
    private String usucorreoe;
    private String usutelefono;
    private String usudireccion;
    private String usutipo;

    public clsUsuario(int usuid, String usunombre, String usucontrasena, String usuestatus, String usunombrereal, String usucorreoe, String usutelefono, String usudireccion, String usutipo) {
        this.usuid = usuid;
        this.usunombre = usunombre;
        this.usucontrasena = usucontrasena;
        this.usuestatus = usuestatus;
        this.usunombrereal = usunombrereal;
        this.usucorreoe = usucorreoe;
        this.usutelefono = usutelefono;
        this.usudireccion = usudireccion;
        this.usutipo = usutipo;
    }

    public clsUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    public int getUsuid() {
        return usuid;
    }

    public void setUsuid(int usuid) {
        this.usuid = usuid;
    }

    public String getUsunombre() {
        return usunombre;
    }

    public void setUsunombre(String usunombre) {
        this.usunombre = usunombre;
    }

    public String getUsucontrasena() {
        return usucontrasena;
    }

    public void setUsucontrasena(String usucontrasena) {
        this.usucontrasena = usucontrasena;
    }

    public String getUsuestatus() {
        return usuestatus;
    }

    public void setUsuestatus(String usuestatus) {
        this.usuestatus = usuestatus;
    }

    public String getUsunombrereal() {
        return usunombrereal;
    }

    public void setUsunombrereal(String usunombrereal) {
        this.usunombrereal = usunombrereal;
    }

    public String getUsucorreoe() {
        return usucorreoe;
    }

    public void setUsucorreoe(String usucorreoe) {
        this.usucorreoe = usucorreoe;
    }

    public String getUsutelefono() {
        return usutelefono;
    }

    public void setUsutelefono(String usutelefono) {
        this.usutelefono = usutelefono;
    }

    public String getUsudireccion() {
        return usudireccion;
    }

    public void setUsudireccion(String usudireccion) {
        this.usudireccion = usudireccion;
    }

    public String getUsutipo() {
        return usutipo;
    }

    public void setUsutipo(String usutipo) {
        this.usutipo = usutipo;
    }

    @Override
    public String toString() {
        return "clsUsuario{" + "usuid=" + usuid + ", usunombre=" + usunombre + ", usucontrasena=" + usucontrasena + ", usuestatus=" + usuestatus + ", usunombrereal=" + usunombrereal + ", usucorreoe=" + usucorreoe + ", usutelefono=" + usutelefono + ", usudireccion=" + usudireccion + ", usutipo=" + usutipo + '}';
    }
   
    

}
