/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compras.vista;


import ventas.modelo.daoVendedores;
import ventas.controlador.clsVendedores;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;



/**
 *
 * @author visitante
 */
public class frmMantenimientoCompras extends javax.swing.JInternalFrame {

    public void llenadoDeCombos() {
        daoVendedores vendedorDAO = new daoVendedores();
        List<clsVendedores> vendedores = vendedorDAO.select();
        cbox_aplicacion.addItem("Seleccione una opción");
        for (int i = 0; i < vendedores.size(); i++) {
            cbox_aplicacion.addItem(String.valueOf(vendedores.get(i).fGetid_Vendedores()));
        }
    }

    public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Vendedor");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
       modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        modelo.addColumn("Estado");
        modelo.addColumn("Tipo");

        daoVendedores vendedorDAO = new daoVendedores();
        List<clsVendedores> vendedores = vendedorDAO.select();
        tablaVendedores.setModel(modelo);
        String[] dato = new String[7];
        for (int i = 0; i < vendedores.size(); i++) {
            dato[0] = Integer.toString(vendedores.get(i).fGetid_Vendedores());
            dato[1] = vendedores.get(i).fGetnombre_Vendedores();
            dato[2] = vendedores.get(i).fGetdireccion_Vendedores();
            dato[3] = Integer.toString(vendedores.get(i).fGettelefono_Vendedores());
            dato[4] =vendedores.get(i).fGetcorreo_Vendedores();
            dato[5] = vendedores.get(i).fGetestado_Vendedores();
            dato[6] = vendedores.get(i).fGettipo_Vendedores();
            //System.out.println("vendedor:" + vendedores);
            modelo.addRow(dato);
        }
    }

    public void buscarVendedor() {
        clsVendedores vendedorAConsultar = new clsVendedores();
        daoVendedores vendedorDAO = new daoVendedores();
        vendedorAConsultar.fSetid_Vendedores(Integer.parseInt(txtbuscado.getText()));
        vendedorAConsultar = vendedorDAO.query(vendedorAConsultar);
        txtNombre.setText(vendedorAConsultar.fGetnombre_Vendedores());
        txtDireccion.setText(vendedorAConsultar.fGetdireccion_Vendedores());
        txtTelefono.setText(String.valueOf(vendedorAConsultar.fGettelefono_Vendedores()));
        txtCorreo.setText(vendedorAConsultar.fGetcorreo_Vendedores());
        txtEstado.setText(vendedorAConsultar.fGetestado_Vendedores());
        txtTipo.setText(vendedorAConsultar.fGettipo_Vendedores());
    }

    public frmMantenimientoCompras() {
        initComponents();
        llenadoDeTablas();
        llenadoDeCombos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb2 = new javax.swing.JLabel();
        lbusu = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        txtbuscado = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        cbox_aplicacion = new javax.swing.JComboBox<>();
        label4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVendedores = new javax.swing.JTable();

        lb2.setForeground(new java.awt.Color(204, 204, 204));
        lb2.setText(".");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento Vendedores");
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 95, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 95, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 95, -1));

        label1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label1.setText("Compras");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 100, -1));

        label3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label3.setText("No.Documento");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtbuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtbuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 102, -1));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtNombre.setOpaque(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 20, 142, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 95, -1));

        cbox_aplicacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbox_aplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_aplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(cbox_aplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 341, 160, -1));

        label4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label4.setText("Proveedor");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtDireccion.setOpaque(false);
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 55, 142, -1));

        label5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label5.setText("Codigo Producto");
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 55, -1, -1));

        jButton2.setText("Ayuda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 341, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtTelefono.setOpaque(false);
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 90, 142, -1));

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtCorreo.setOpaque(false);
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 125, 142, -1));

        label6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label6.setText("Estatus");
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 125, -1, -1));

        label7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label7.setText("No.Proveedor");
        getContentPane().add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtEstado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtEstado.setOpaque(false);
        getContentPane().add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 155, 142, -1));

        txtTipo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTipo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtTipo.setOpaque(false);
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 190, 140, -1));

        label8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label8.setText("Precio");
        getContentPane().add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        label9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label9.setText("Cantidad");
        getContentPane().add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 155, -1, -1));

        tablaVendedores.setBackground(new java.awt.Color(153, 255, 153));
        tablaVendedores.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.Documento", "No.Proveedor", "Codigo del Producto", "No.Bodega", "Cantidad", "Precio", "Total"
            }
        ));
        jScrollPane1.setViewportView(tablaVendedores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 670, 303));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        daoVendedores vendedorDAO = new daoVendedores();
        clsVendedores vendedorAEliminar = new clsVendedores();
        vendedorAEliminar.fSetid_Vendedores(Integer.parseInt(txtbuscado.getText()));
        vendedorDAO.delete(vendedorAEliminar);
        llenadoDeTablas();        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        daoVendedores vendedorDAO = new daoVendedores();
        clsVendedores vendedorAInsertar = new clsVendedores();
        vendedorAInsertar.fSetnombre_Vendedores(txtNombre.getText());
        vendedorAInsertar.fSetdireccion_Vendedores(txtDireccion.getText());
        vendedorAInsertar.fSettelefono_Vendedores(Integer.parseInt(txtTelefono.getText()));
        vendedorAInsertar.fSetcorreo_Vendedores(txtCorreo.getText());
        vendedorAInsertar.fSetestado_Vendedores(txtDireccion.getText());
        vendedorAInsertar.fSettipo_Vendedores(txtTipo.getText());
        vendedorDAO.insert(vendedorAInsertar);
        llenadoDeTablas();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        buscarVendedor();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        daoVendedores vendedorDAO = new daoVendedores();
        clsVendedores vendedorAActualizar = new clsVendedores();
        vendedorAActualizar.fSetid_Vendedores(Integer.parseInt(txtbuscado.getText()));
        vendedorAActualizar.fSetnombre_Vendedores(txtNombre.getText());
        vendedorAActualizar.fSetdireccion_Vendedores(txtDireccion.getText());
        vendedorAActualizar.fSettelefono_Vendedores(Integer.parseInt(txtTelefono.getText()));
        vendedorAActualizar.fSetcorreo_Vendedores(txtCorreo.getText());
        vendedorAActualizar.fSetestado_Vendedores(txtDireccion.getText());
        vendedorAActualizar.fSettipo_Vendedores(txtTipo.getText());
        vendedorDAO.update(vendedorAActualizar);
        llenadoDeTablas();        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        cbox_aplicacion.setSelectedIndex(0);
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtEstado.setText("");
        txtTipo.setText("");
        txtbuscado.setText("");
        btnRegistrar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cbox_aplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_aplicacionActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_aplicacionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            if ((new File("src\\main\\java\\ayudas\\ProcesoMayor.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\ayudas\\ProcesoMayor.chm");
                p.waitFor();
            } else {
                System.out.println("La ayuda no Fue encontrada");
            }
            System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void txtbuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbox_aplicacion;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lbusu;
    private javax.swing.JTable tablaVendedores;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}