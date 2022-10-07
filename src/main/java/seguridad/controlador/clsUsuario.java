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
    private String Tipo;
    public clsUsuario() {
    }
    
    public clsUsuario(int p_usuid, String p_usunombre, String p_usucontrasena, String p_usuestatus, String p_usunombrereal, String p_usucorreoe, String p_usutelefono, String p_usudireccion, String p_Tipo) {
        this.usuid = p_usuid;
        this.usunombre = p_usunombre;
        this.usucontrasena = p_usucontrasena;
        this.usutelefono = p_usutelefono;
        this.usunombrereal = p_usunombrereal;
        this.usuestatus = p_usuestatus;
        this.usudireccion = p_usudireccion;
        this.usucorreoe = p_usucorreoe;
        this.Tipo = p_Tipo;
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

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "clsUsuario{" + "usuid=" + usuid + ", usunombre=" + usunombre + ", usucontrasena=" + usucontrasena + ", usuestatus=" + usuestatus + ", usunombrereal=" + usunombrereal + ", usucorreoe=" + usucorreoe + ", usutelefono=" + usutelefono + ", usudireccion=" + usudireccion + ", Tipo=" + Tipo + '}';
    }
    
    
    
}