/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.vista;


import ventas.modelo.daoVendedores;
import ventas.modelo.daoVentas;
import ventas.modelo.daoCliente;
import ventas.controlador.clsVentas;
import ventas.controlador.clsCliente;
import ventas.controlador.clsVendedores;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import logistica.controlador.clsBodega;
import logistica.controlador.clsProductos;
import logistica.modelo.daoBodega;
import logistica.modelo.daoProductos;



/**
 *
 * @author visitante
 */
public class frmMantenimientoVentas extends javax.swing.JInternalFrame {

    public void ComboCliente() {
        daoCliente VentasDAO = new daoCliente();
        List<clsCliente> ventas = VentasDAO.select();
        cbox_clicodigo.addItem("Seleccione un cliente");
        //cbox_clicodigo.removeAllItems();
        for (int i = 0; i < ventas.size(); i++) {
            cbox_clicodigo.addItem(String.valueOf(ventas.get(i).getClicodigo()));
        }
    }
    
        public void ComboEstatus() {
        daoVentas VentasDAO = new daoVentas();
        List<clsVentas> ventas = VentasDAO.select();
        cbox_veeestatus.addItem("Seleccione un Estado");
    }
    
        public void estados() {    
        cbox_veeestatus.addItem("1");
        cbox_veeestatus.addItem("0");
    }
        
        public void ComboProducto() {
        daoProductos VentasDAO = new daoProductos();
        List<clsProductos> ventas = VentasDAO.select();
        cbox_prodcodigo.addItem("Seleccione un Producto");
        //cbox_clicodigo.removeAllItems();
        for (int i = 0; i < ventas.size(); i++) {
            cbox_prodcodigo.addItem(String.valueOf(ventas.get(i).getProdcodigo()));
        }
    }
        
        public void ComboBodega() {
        daoBodega VentasDAO = new daoBodega();
        List<clsBodega> ventas = VentasDAO.select();
        cbox_bodcodigo.addItem("Seleccione una Bodega");
        //cbox_clicodigo.removeAllItems();
        for (int i = 0; i < ventas.size(); i++) {
            cbox_bodcodigo.addItem(String.valueOf(ventas.get(i).getcodigob()));
        }
    }    
    

    
    public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Documento");//ENCABEZADO
        modelo.addColumn("ID cliente");
        modelo.addColumn("Fecha");
       modelo.addColumn("Total Venta");
        modelo.addColumn("Estatus");
        modelo.addColumn("Orden");//DETALLE
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("ID Bodega");

        daoVentas vendedorDAO = new daoVentas();
        List<clsVentas> ventas = vendedorDAO.select();
        daoVentas vendedorDAO2 = new daoVentas();
        List<clsVentas> ventas2 = vendedorDAO.select2();
        tablaVendedores.setModel(modelo);
        String[] dato = new String[10];
        for (int i = 0; i < ventas.size(); i++) {
            dato[0] = ventas.get(i).Getveedocumento(); //ENCABEZADO
            dato[1] = Integer.toString(ventas.get(i).Getclicodigo());
            dato[2] = ventas.get(i).Getveefecha();
            dato[3] = Integer.toString(ventas.get(i).Getveetotal());
            dato[4] =ventas.get(i).Getveeestatus();
            dato[5] = Integer.toString(ventas2.get(i).Getvedorden());//DETALLE
            dato[6] = Integer.toString(ventas2.get(i).Getprodcodigo());
            dato[7] = Integer.toString(ventas2.get(i).Getvedcantidad());
            dato[8] = Integer.toString(ventas2.get(i).Getvedprecio());
            dato[9] = Integer.toString(ventas2.get(i).Getbodcodigo());
            //System.out.println("vendedor:" + vendedores);
            modelo.addRow(dato);
        }
    }

    public void buscarVendedor() {
        clsVentas ventasAConsultar = new clsVentas();
        daoVentas vendedorDAO = new daoVentas();
        
        clsVentas ventasAConsultar2 = new clsVentas();
        daoVentas vendedorDAO2 = new daoVentas();
        
        //vendedorAConsultar.Setvedcodigo(Integer.parseInt(txtbuscado.getText()));
        ventasAConsultar = vendedorDAO.query(ventasAConsultar);
        ventasAConsultar2 = vendedorDAO2.query2(ventasAConsultar2);
        //***************************ENCABEZADO*********************************
        txtbuscado.setText(ventasAConsultar.Getveedocumento());
        txtIDDocumento.setText(ventasAConsultar.Getveedocumento());
        cbox_clicodigo.setSelectedItem(ventasAConsultar.Getclicodigo());
        txtFecha.setText(ventasAConsultar.Getveefecha());
        ventasAConsultar.Setveetotal(Integer.parseInt(txtTotalVentas.getText()));
        cbox_veeestatus.setSelectedItem(ventasAConsultar.Getveeestatus());
        //***************************DETALLE***********************************
        ventasAConsultar2.Setvedorden(Integer.parseInt(txtOrdenID.getText()));
        cbox_prodcodigo.setSelectedItem(ventasAConsultar2.Getprodcodigo());
        ventasAConsultar2.Setvedcantidad(Integer.parseInt(txtCantidad.getText()));
        ventasAConsultar2.Setvedprecio(Integer.parseInt(txtPrecio.getText()));
        cbox_bodcodigo.setSelectedItem(ventasAConsultar2.Getbodcodigo());
    }

    public frmMantenimientoVentas() {
        initComponents();
        llenadoDeTablas();
        ComboCliente();
        ComboEstatus();
        estados();
        ComboProducto();
        ComboBodega();

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
        btnLimpiar = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtTotalVentas = new javax.swing.JTextField();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVendedores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        label14 = new javax.swing.JLabel();
        label15 = new javax.swing.JLabel();
        txtOrdenID = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cbox_veeestatus = new javax.swing.JComboBox<>();
        cbox_clicodigo = new javax.swing.JComboBox<>();
        cbox_prodcodigo = new javax.swing.JComboBox<>();
        cbox_bodcodigo = new javax.swing.JComboBox<>();
        label8 = new javax.swing.JLabel();
        txtIDDocumento = new javax.swing.JTextField();

        lb2.setForeground(new java.awt.Color(204, 204, 204));
        lb2.setText(".");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento Ventas");
        setVisible(true);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label1.setText("Ventas");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label3.setText("Cliente codigo");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        label5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label5.setText("Fecha");

        lb.setForeground(new java.awt.Color(204, 204, 204));
        lb.setText(".");

        jButton2.setText("Ayuda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtTotalVentas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTotalVentas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        label6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label6.setText("Estatus");

        label7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label7.setText("Total venta");

        tablaVendedores.setBackground(new java.awt.Color(153, 255, 153));
        tablaVendedores.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Vendedor", "ID Empleado", "Correo", "Telefono", "Direccion", "Porcentaje", "Comision"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVendedores);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel1.setText("1 = Habilitado y 0 = Inhabilitado");

        label10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label10.setText("Orden ID");

        label11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label11.setText("Codigo Producto");

        label12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label12.setText("Cantidad");

        label14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label14.setText("Precio");

        label15.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label15.setText("Bodega ID");

        txtOrdenID.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtOrdenID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        txtCantidad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCantidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        txtPrecio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPrecio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        cbox_veeestatus.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbox_veeestatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_veeestatusActionPerformed(evt);
            }
        });

        cbox_clicodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbox_clicodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_clicodigoActionPerformed(evt);
            }
        });

        cbox_prodcodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbox_prodcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_prodcodigoActionPerformed(evt);
            }
        });

        cbox_bodcodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbox_bodcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_bodcodigoActionPerformed(evt);
            }
        });

        label8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label8.setText("ID Documento");

        txtIDDocumento.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtIDDocumento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3)
                            .addComponent(label5)
                            .addComponent(label7)
                            .addComponent(label6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label11)
                                    .addComponent(label12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbox_veeestatus, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtTotalVentas, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbox_clicodigo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtOrdenID)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbox_prodcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(label10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label15)
                                    .addComponent(label14))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbox_bodcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                        .addComponent(label1)
                        .addGap(294, 294, 294))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label1)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label8)
                            .addComponent(txtIDDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(cbox_clicodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label6)
                            .addComponent(cbox_veeestatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label10)
                            .addComponent(txtOrdenID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label11)
                            .addComponent(cbox_prodcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label12)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label14)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label15)
                            .addComponent(cbox_bodcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnEliminar)
                            .addComponent(btnModificar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)
                            .addComponent(btnLimpiar))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(81, 81, 81))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        daoVendedores vendedorDAO = new daoVendedores();
        daoVendedores vendedorDAO2 = new daoVendedores();
        clsVendedores vendedorAEliminar = new clsVendedores();
        clsVendedores vendedorAEliminar2 = new clsVendedores();
        vendedorAEliminar.Setvedcodigo(Integer.parseInt(txtbuscado.getText()));
        vendedorDAO.delete(vendedorAEliminar);
        vendedorDAO2.delete(vendedorAEliminar2);
        llenadoDeTablas();     
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        daoVentas vendedorDAO = new daoVentas();
        daoVentas vendedorDAO2 = new daoVentas();
        clsVentas ventasAInsertar = new clsVentas();
        clsVentas ventasAInsertar2 = new clsVentas();
        //******************ENCABEZADO**********************
        ventasAInsertar.Setvedcodigo(txtIDDocumento.getText());
        ventasAInsertar.Setclicodigo(Integer.parseInt(cbox_clicodigo.getSelectedItem().toString()));
        ventasAInsertar.Setveefecha(txtFecha.getText());
        ventasAInsertar.Setveetotal(Integer.parseInt(txtTotalVentas.getText()));
        ventasAInsertar.Setveeestatus(cbox_veeestatus.getSelectedItem().toString());
        //******************DETALLE**************************
        ventasAInsertar2.Setvedcodigo(txtIDDocumento.getText());
        ventasAInsertar2.Setvedorden(Integer.parseInt(txtOrdenID.getText()));
        ventasAInsertar2.Setprodcodigo(Integer.parseInt(cbox_prodcodigo.getSelectedItem().toString()));
        ventasAInsertar2.Setvedcantidad(Integer.parseInt(txtCantidad.getText()));
        ventasAInsertar2.Setvedprecio(Integer.parseInt(txtPrecio.getText()));
        ventasAInsertar2.Setbodcodigo(Integer.parseInt(cbox_bodcodigo.getSelectedItem().toString()));
        
        vendedorDAO.insert(ventasAInsertar);
        vendedorDAO2.insert2(ventasAInsertar2);
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
        vendedorAActualizar.Setvedcodigo(Integer.parseInt(txtbuscado.getText()));
        vendedorAActualizar.Setveddireccion(txtFecha.getText());
        vendedorAActualizar.Setvedtelefono(txtTotalVentas.getText());
        vendedorDAO.update(vendedorAActualizar);
        llenadoDeTablas();     
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtIDDocumento.setText("");
        cbox_clicodigo.setSelectedIndex(0);
        txtFecha.setText("");
        txtTotalVentas.setText("");
        cbox_veeestatus.setSelectedIndex(0);
        txtOrdenID.setText("");
        cbox_prodcodigo.setSelectedIndex(0);
        txtCantidad.setText("");
        txtPrecio.setText("");
        cbox_bodcodigo.setSelectedIndex(0);
        txtbuscado.setText("");
        btnRegistrar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

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

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void cbox_veeestatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_veeestatusActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_veeestatusActionPerformed

    private void cbox_clicodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_clicodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_clicodigoActionPerformed

    private void cbox_prodcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_prodcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_prodcodigoActionPerformed

    private void cbox_bodcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_bodcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_bodcodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbox_bodcodigo;
    private javax.swing.JComboBox<String> cbox_clicodigo;
    private javax.swing.JComboBox<String> cbox_prodcodigo;
    private javax.swing.JComboBox<String> cbox_veeestatus;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lbusu;
    private javax.swing.JTable tablaVendedores;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIDDocumento;
    private javax.swing.JTextField txtOrdenID;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotalVentas;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}
