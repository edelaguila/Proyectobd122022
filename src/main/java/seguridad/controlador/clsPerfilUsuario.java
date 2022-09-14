package seguridad.controlador;

public class clsPerfilUsuario {

    private String perid;
    private String usuid;
    private String usunombre;

    public clsPerfilUsuario() {
    }

    public clsPerfilUsuario(String perid, String usuid, String usunombre) {
        this.perid = perid;
        this.usuid = usuid;
        this.usunombre = usunombre;
    }

   
    
    
    

    public String getPerid() {
        return perid;
    }

    public void setPerid(String perid) {
        this.perid = perid;
    }

    public String getUsuid() {
        return usuid;
    }

    public void setUsuid(String usuid) {
        this.usuid = usuid;
    }

    public String getUsunombre() {
        return usunombre;
    }

    public void setUsunombre(String usunombre) {
        this.usunombre = usunombre;
    }

    @Override
    public String toString() {
        return "clsPerfilUsuario{" + "perid=" + perid + ", usuid=" + usuid + ", usunombre=" + usunombre + '}';
    }
    
}