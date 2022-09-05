package seguridad.controlador;

public class clsPerfilAplicacion {

    private int perid;
    private int aplid;
    private String aplnombre;

    public clsPerfilAplicacion() {
    }

    public clsPerfilAplicacion(int perid, int aplid, String aplnombre) {
        this.perid = perid;
        this.aplid = aplid;
        this.aplnombre = aplnombre;
    }

    public int getPerid() {
        return perid;
    }

    public void setPerid(int perid) {
        this.perid = perid;
    }

    public int getAplid() {
        return aplid;
    }

    public void setAplid(int aplid) {
        this.aplid = aplid;
    }

    public String getAplnombre() {
        return aplnombre;
    }

    public void setAplnombre(String aplnombre) {
        this.aplnombre = aplnombre;
    }

    @Override
    public String toString() {
        return "clsPerfilAplicacion{" + "perid=" + perid + ", aplid=" + aplid + ", aplnombre=" + aplnombre + '}';
    }
    
}