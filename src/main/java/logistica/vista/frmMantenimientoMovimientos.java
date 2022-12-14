/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. Juan Miguel Sandoval Chile.
 */
package logistica.vista;

import seguridad.vista.*;
import logistica.modelo.daoMovimientos;
import logistica.controlador.clsMovimientos;
import logistica.modelo.daoProductos;
import logistica.controlador.clsProductos;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;

/**
 *
 * @author visitante Juan Miguel Sandoval
 */
public class frmMantenimientoMovimientos extends javax.swing.JInternalFrame {

    public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id Movimiento");
        modelo.addColumn("Fecha");
        modelo.addColumn("Estado");
        modelo.addColumn("Nombre producto");
         modelo.addColumn("Existencia producto");
         modelo.addColumn("Cantidad");
         modelo.addColumn("Nombre linea");
         modelo.addColumn("Nombre marca");
         modelo.addColumn("Nombre concepto");
         modelo.addColumn("nombre cliente");
         modelo.addColumn("nombre proveedor");
        
        daoMovimientos perfilDAO = new daoMovimientos();
        List<clsMovimientos> perfiles = perfilDAO.select();
        tablaVendedores.setModel(modelo);
        String[] dato = new String[20];
        for (int i = 0; i < perfiles.size(); i++) {
            dato[0] = Integer.toString(perfiles.get(i).getMovid());
            dato[1] = perfiles.get(i).getMovfecha();
                 
            dato[2] = perfiles.get(i).getMovestado();
             
            dato[3] = perfiles.get(i).getProdnombre();
            dato[4] = Float.toString(perfiles.get(i).getProdexistencia());
            dato[5] = Integer.toString(perfiles.get(i).getMovcantidad());
            dato[6] = perfiles.get(i).getLinnombre();
            dato[7] = perfiles.get(i).getMarnombre();
            dato[8] = perfiles.get(i).getConnombre();
            dato[9] = perfiles.get(i).getClinombre();
            dato[10] = perfiles.get(i).getPronombre();
                 
            modelo.addRow(dato);
        }
    }

    public void buscarVendedor() {
        clsMovimientos vendedorAConsultar = new clsMovimientos();
        daoMovimientos perfilDAO = new daoMovimientos();

        vendedorAConsultar.setMovid(Integer.parseInt(txtbuscado.getText()));
        vendedorAConsultar = perfilDAO.query(vendedorAConsultar);
        
        
        txtFecha.setText( vendedorAConsultar.getMovfecha());  
        txEstado.setText(vendedorAConsultar.getMovestado());  
        txtProducto.setText(Integer.toString( vendedorAConsultar.getProdcodigo()));  
        txtCantidad.setText(Integer.toString( vendedorAConsultar.getMovcantidad()));  
        txtLinea.setText(Integer.toString( vendedorAConsultar.getLincodigo()));  
        txtMarca.setText(Integer.toString( vendedorAConsultar.getMarcodigo()));  
        txtConcepto.setText(Integer.toString( vendedorAConsultar.getConid()));
        txtCliente.setText(Integer.toString( vendedorAConsultar.getClicodigo()));
        txtProveedor.setText(Integer.toString( vendedorAConsultar.getProcodigo()));
    } 

    public frmMantenimientoMovimientos() {
        initComponents();
        llenadoDeTablas();
       
        
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
        btnBuscar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        txtbuscado = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVendedores = new javax.swing.JTable();
        lb = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        label6 = new javax.swing.JLabel();
        txEstado = new javax.swing.JTextField();
        label7 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        label8 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        label9 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        txtLinea = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        label11 = new javax.swing.JLabel();
        txtConcepto = new javax.swing.JTextField();
        label12 = new javax.swing.JLabel();
        label13 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        label14 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        verificar = new javax.swing.JButton();
        label15 = new javax.swing.JLabel();
        efecto = new javax.swing.JTextField();
        asignar = new javax.swing.JButton();
        updateTable = new javax.swing.JButton();

        lb2.setForeground(new java.awt.Color(204, 204, 204));
        lb2.setText(".");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento Productos");
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 95, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 95, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 95, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 95, -1));

        label1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label1.setText("Productos");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));
        getContentPane().add(txtbuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 102, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 95, -1));

        tablaVendedores.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaVendedores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 565, 330));

        lb.setForeground(new java.awt.Color(204, 204, 204));
        lb.setText(".");
        getContentPane().add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 20, 13, -1));

        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtFecha.setOpaque(false);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 263, -1));

        label6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label6.setText("Fecha movimiento");
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txEstado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txEstado.setOpaque(false);
        txEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(txEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 263, -1));

        label7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label7.setText("Estado movimiento");
        getContentPane().add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txtProducto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtProducto.setOpaque(false);
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 263, -1));

        label8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label8.setText("Codigo producto");
        getContentPane().add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCantidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtCantidad.setOpaque(false);
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 263, -1));

        label9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label9.setText("Cantidad");
        getContentPane().add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        label10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label10.setText("Codigo linea");
        getContentPane().add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        txtLinea.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtLinea.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtLinea.setOpaque(false);
        txtLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLineaActionPerformed(evt);
            }
        });
        getContentPane().add(txtLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 263, -1));

        txtMarca.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtMarca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtMarca.setOpaque(false);
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 263, -1));

        label11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label11.setText("Codigo marca");
        getContentPane().add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        txtConcepto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtConcepto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtConcepto.setOpaque(false);
        txtConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConceptoActionPerformed(evt);
            }
        });
        getContentPane().add(txtConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 263, -1));

        label12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label12.setText("efecto");
        getContentPane().add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        label13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label13.setText("Codigo cliente");
        getContentPane().add(label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 20));

        txtCliente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtCliente.setOpaque(false);
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 263, 20));

        label14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label14.setText("Codigo proveedor");
        getContentPane().add(label14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 20));

        txtProveedor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtProveedor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtProveedor.setOpaque(false);
        txtProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 263, 20));

        verificar.setText("Verficar");
        verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarActionPerformed(evt);
            }
        });
        getContentPane().add(verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 90, -1));

        label15.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label15.setText("Codigo concepto");
        getContentPane().add(label15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        efecto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        efecto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        efecto.setOpaque(false);
        efecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efectoActionPerformed(evt);
            }
        });
        getContentPane().add(efecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 263, -1));

        asignar.setText("Asignar");
        asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarActionPerformed(evt);
            }
        });
        getContentPane().add(asignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 90, -1));

        updateTable.setText("actualizar tabla");
        updateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTableActionPerformed(evt);
            }
        });
        getContentPane().add(updateTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        daoMovimientos perfilDAO = new daoMovimientos();
        clsMovimientos vendedorAEliminar = new clsMovimientos();
   
        vendedorAEliminar.setMovid(Integer.parseInt(txtbuscado.getText()));
  
        perfilDAO.delete(vendedorAEliminar);
        perfilDAO.delete2(vendedorAEliminar);
        llenadoDeTablas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        daoMovimientos perfilDAO = new daoMovimientos();
        clsMovimientos vendedorAInsertar = new clsMovimientos();     
        daoMovimientos perfilDAO2 = new daoMovimientos();
        clsMovimientos vendedorAInsertar2 = new clsMovimientos();   
       vendedorAInsertar.setMovfecha(txtFecha.getText());
       vendedorAInsertar.setMovestado((txEstado.getText()));
       vendedorAInsertar2.setProdcodigo(Integer.parseInt(txtProducto.getText()));
       vendedorAInsertar2.setMovcantidad(Integer.parseInt(txtCantidad.getText()));
       vendedorAInsertar2.setLincodigo(Integer.parseInt(txtLinea.getText()));
       vendedorAInsertar2.setMarcodigo(Integer.parseInt(txtMarca.getText()));
       vendedorAInsertar2.setConid(Integer.parseInt(txtConcepto.getText()));
       vendedorAInsertar2.setClicodigo(Integer.parseInt(txtCliente.getText()));
       vendedorAInsertar2.setProcodigo(Integer.parseInt(txtProveedor.getText()));
          perfilDAO2.insert2(vendedorAInsertar2);
         perfilDAO.insert(vendedorAInsertar);
         
         llenadoDeTablas();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        buscarVendedor();
        
      
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
//        // TODO add your handling code here:
        daoMovimientos perfilDAO2 = new daoMovimientos();
        clsMovimientos vendedorAActualizar2 = new clsMovimientos(); 
        
        daoMovimientos perfilDAO = new daoMovimientos();
        clsMovimientos vendedorAActualizar = new clsMovimientos();
       
        //******************ENCABEZADO**********************
       vendedorAActualizar.setMovid(Integer.parseInt(txtbuscado.getText()));
       vendedorAActualizar.setMovfecha(txtFecha.getText());
       vendedorAActualizar.setMovestado((txEstado.getText()));
       perfilDAO.update(vendedorAActualizar);

        //******************DETALLE**************************
       vendedorAActualizar.setMovid(Integer.parseInt(txtbuscado.getText()));
       vendedorAActualizar.setProdcodigo(Integer.parseInt(txtProducto.getText()));
       vendedorAActualizar.setMovcantidad(Integer.parseInt(txtCantidad.getText()));
       vendedorAActualizar.setLincodigo(Integer.parseInt(txtLinea.getText()));
       vendedorAActualizar.setMarcodigo(Integer.parseInt(txtMarca.getText()));
       vendedorAActualizar.setConid(Integer.parseInt(txtConcepto.getText()));
       vendedorAActualizar.setClicodigo(Integer.parseInt(txtCliente.getText()));
       vendedorAActualizar.setProcodigo(Integer.parseInt(txtProveedor.getText()));
       perfilDAO.update2(vendedorAActualizar);
      
      

        
        llenadoDeTablas();         

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
          
        txtbuscado.setText("");
        txtFecha.setText("");
         txEstado.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");
        txtLinea.setText("");
        txtMarca.setText("");
        txtConcepto.setText("");
        txtCliente.setText("");
        txtProveedor.setText("");
        efecto.setText("");
       
        valor=0;
       
        btnRegistrar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txEstadoActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLineaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLineaActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConceptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConceptoActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorActionPerformed
String name;
float valor;
String estado;
int marca;
int linea;
int codigo;
    private void verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarActionPerformed
        // TODO add your handling code here:
        
          clsProductos vendedorAConsultar = new clsProductos();
        daoProductos perfilDAO = new daoProductos();
        vendedorAConsultar.setProdcodigo(Integer.parseInt(txtProducto.getText()));
        vendedorAConsultar = perfilDAO.query(vendedorAConsultar);
        
        codigo = vendedorAConsultar.getProdcodigo();
        name = vendedorAConsultar.getProdnombre();  
        valor = vendedorAConsultar.getProdexistencia();  
        estado = vendedorAConsultar.getProdestatus();  
        marca = vendedorAConsultar.getMarcodigo(); 
        linea =vendedorAConsultar.getLincodigo();  
            

       
         
         
         
        
    }//GEN-LAST:event_verificarActionPerformed

    private void efectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_efectoActionPerformed

    private void asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarActionPerformed
        // TODO add your handling code here:
  float cantidad = Float.parseFloat(txtCantidad.getText());      
         daoProductos vendedorDAO = new daoProductos();
        clsProductos vendedorAActualizar = new clsProductos();

       
        
        
        if (efecto.getText().equals("+")){
         vendedorAActualizar.setProdcodigo(codigo);
             vendedorAActualizar.setProdnombre(name);        
            vendedorAActualizar.setProdestatus(estado);        
             vendedorAActualizar.setMarcodigo(marca);
           vendedorAActualizar.setLincodigo(linea);
        vendedorAActualizar.setProdexistencia(valor+cantidad);
                vendedorDAO.update(vendedorAActualizar);
        }else if (efecto.getText().equals("-")){
         vendedorAActualizar.setProdcodigo(codigo);
             vendedorAActualizar.setProdnombre(name);        
            vendedorAActualizar.setProdestatus(estado);        
             vendedorAActualizar.setMarcodigo(marca);
           vendedorAActualizar.setLincodigo(linea);
        vendedorAActualizar.setProdexistencia(valor-cantidad);
                vendedorDAO.update(vendedorAActualizar);
        
        }
        
   
        
         
    }//GEN-LAST:event_asignarActionPerformed

    private void updateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTableActionPerformed
        // TODO add your handling code here:
        llenadoDeTablas();
    }//GEN-LAST:event_updateTableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asignar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField efecto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lbusu;
    private javax.swing.JTable tablaVendedores;
    private javax.swing.JTextField txEstado;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtConcepto;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtLinea;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtbuscado;
    private javax.swing.JButton updateTable;
    private javax.swing.JButton verificar;
    // End of variables declaration//GEN-END:variables
}
