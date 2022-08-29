package seguridad.controlador;
/*
actualización 2708
*/
public class clsPerfil {
    private int perid; //iper_id;
    private String pernombre;//sper_nombre;
    private String perestatus; //sper_estado;

    public clsPerfil() {
    }

    public clsPerfil(int iid) {
        this.perid = iid;
    }
    
    public clsPerfil(String snombre, String sestado) {
        this.pernombre = snombre;
        this.perestatus = sestado;
    }
    
    public clsPerfil(int iid, String snombre, String sestado) {
        this.perid = iid;
        this.pernombre = snombre;
        this.perestatus = sestado;
    }
    

    public int getId_perfil() {
        return perid;
    }

    public void setId_perfil(int iid) {
        this.perid = iid;
    }

    public String getperfil() {
        return pernombre;
    }

    public void setnombreperfil(String snombre) {
        this.pernombre = snombre;
    }

    public String getnombreperfil() {
        return perestatus;
    }

    public void setEstado(String sestado) {
        this.perestatus = sestado;
    }
    
    public String getEstado() {
        return perestatus;
    }

    @Override
    public String toString() {
        return "tbl_perfil{" + "per_idPerfil=" + perid + ", per_NombrePerfil=" + pernombre + ", per_EstatusPerfil=" + perestatus + '}';
    }
    
    
}
