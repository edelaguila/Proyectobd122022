/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
int perid; //per_idPerfil; Juan Miguel Sandoval Chile.
String pernombre;//per_NombrePerfil;
String perestatus; //per_EstatusPerfil; 
actualización 0209 Juan Miguel Sandoval Chile
*/
package seguridad.modelo;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import seguridad.vista.frmMantenimientoUsuarios;
import seguridad.vista.mdiGeneral;

/**
 *
 * @Dani
 */
public class daoAcceso2{
    public daoAcceso2 (String usuario){
        String tipo_usuario=usuario.toUpperCase();
        if(tipo_usuario.equals("")|| tipo_usuario.equals("INVITADO")){
            Invitado();   
        }
        else if (tipo_usuario.equals("ADMINISTRADOR")){
            Administrador();
        }
        else if (tipo_usuario.equals("USUARIO")){
            Usuario();
        }
    }

    private void Administrador(){
        mdiGeneral mdi= new mdiGeneral();
        mdi.setVisible(true);
        ActionListener nueva = new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e) {
                frmMantenimientoUsuarios users = new frmMantenimientoUsuarios();
                //users.btnEliminar.setVisible(false);
                mdi.jDesktopPane1.add(users);
                Dimension desktopSize = mdi.jDesktopPane1.getSize();
                Dimension FrameSize = users.getSize();
                users.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
                System.out.println("Prueba");
            }
                    
        };
        mdi.jMenuItem3.addActionListener(nueva);
        
    }
    
    private void Usuario(){
        mdiGeneral mdi= new mdiGeneral();
        mdi.setVisible(true);
        ActionListener nueva = new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e) {
                frmMantenimientoUsuarios users = new frmMantenimientoUsuarios();
                users.btnEliminar.setVisible(false);               
                users.btnModificar.setVisible(false);
                mdi.jDesktopPane1.add(users);
                Dimension desktopSize = mdi.jDesktopPane1.getSize();
                Dimension FrameSize = users.getSize();
                users.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);             
                System.out.println("Prueba");
            }
                    
        };
        mdi.jMenuItem3.addActionListener(nueva);
    }
   
    
    private void Invitado(){
        mdiGeneral mdi= new mdiGeneral();
        mdi.setVisible(true);
        ActionListener nueva = new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e) {
                frmMantenimientoUsuarios users = new frmMantenimientoUsuarios();
                users.btnEliminar.setVisible(false);
                users.btnRegistrar.setVisible(false);
                users.btnModificar.setVisible(false);
                mdi.jDesktopPane1.add(users);
                Dimension desktopSize = mdi.jDesktopPane1.getSize();
                Dimension FrameSize = users.getSize();
                users.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
                System.out.println("Prueba");
            }
                    
        };
        mdi.jMenuItem3.addActionListener(nueva);
    }
}


