
package vista;

import java.awt.Color;

public class Proveedor extends javax.swing.JFrame {
    
    public Proveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        razonSocial = new javax.swing.JTextField();
        rutProveedor = new javax.swing.JTextField();
        nombreContacto = new javax.swing.JTextField();
        celularProveedor = new javax.swing.JTextField();
        correoProveedor = new javax.swing.JTextField();
        direccionProveedor = new javax.swing.JTextField();
        agregarProveedor = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedor = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DreamGifts");

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        razonSocial.setForeground(new java.awt.Color(102, 102, 102));
        razonSocial.setText("Razon Social");
        razonSocial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                razonSocialFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                razonSocialFocusLost(evt);
            }
        });

        rutProveedor.setForeground(new java.awt.Color(102, 102, 102));
        rutProveedor.setText("Rut Proveedor");
        rutProveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rutProveedorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rutProveedorFocusLost(evt);
            }
        });
        rutProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutProveedorActionPerformed(evt);
            }
        });

        nombreContacto.setForeground(new java.awt.Color(102, 102, 102));
        nombreContacto.setText("Nombre Contacto");
        nombreContacto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreContactoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreContactoFocusLost(evt);
            }
        });

        celularProveedor.setForeground(new java.awt.Color(102, 102, 102));
        celularProveedor.setText("Celular");
        celularProveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                celularProveedorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                celularProveedorFocusLost(evt);
            }
        });
        celularProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularProveedorActionPerformed(evt);
            }
        });

        correoProveedor.setForeground(new java.awt.Color(102, 102, 102));
        correoProveedor.setText("Correo");
        correoProveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                correoProveedorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                correoProveedorFocusLost(evt);
            }
        });

        direccionProveedor.setForeground(new java.awt.Color(102, 102, 102));
        direccionProveedor.setText("Dirección");
        direccionProveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                direccionProveedorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                direccionProveedorFocusLost(evt);
            }
        });
        direccionProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionProveedorActionPerformed(evt);
            }
        });

        agregarProveedor.setText("Agregar");
        agregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProveedorActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Razón Social", "Rut Proveedor", "Nombre contacto", "Dirección ", "Celular", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProveedor);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(razonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rutProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(celularProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(correoProveedor)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(agregarProveedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnListar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnEditar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(razonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rutProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarProveedor)
                    .addComponent(nombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celularProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jMenu1.setText("Ventas");

        jMenuItem1.setText("Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Articulos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Pack");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Bancos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Despacho");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Comunas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Categoria Articulos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Redes Sociales");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu7.setText("Compras");

        jMenuItem9.setText("Facturas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem9);

        jMenuItem10.setText("Proveedores");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Informes");

        jMenuItem11.setText("Informes");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem11);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void direccionProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionProveedorActionPerformed

    private void rutProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutProveedorActionPerformed

    private void razonSocialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_razonSocialFocusGained
        // TODO add your handling code here:
        if(razonSocial.getText().equals("Razon Social")){
            razonSocial.setText("");
        }
    }//GEN-LAST:event_razonSocialFocusGained

    private void rutProveedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rutProveedorFocusGained
        // TODO add your handling code here:
        if(rutProveedor.getText().equals("Rut Proveedor")){
            rutProveedor.setText("");
        }
    }//GEN-LAST:event_rutProveedorFocusGained

    private void nombreContactoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreContactoFocusGained
        // TODO add your handling code here:
        if(nombreContacto.getText().equals("Nombre Contacto")){
            nombreContacto.setText("");
        }
    }//GEN-LAST:event_nombreContactoFocusGained

    private void direccionProveedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionProveedorFocusGained
        // TODO add your handling code here:
        if(direccionProveedor.getText().equals("Dirección")){
            direccionProveedor.setText("");
        }
    }//GEN-LAST:event_direccionProveedorFocusGained

    private void celularProveedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_celularProveedorFocusGained
        // TODO add your handling code here:
        if(celularProveedor.getText().equals("Celular")){
            celularProveedor.setText("");
        }
    }//GEN-LAST:event_celularProveedorFocusGained

    private void correoProveedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoProveedorFocusGained
        // TODO add your handling code here:
        if(correoProveedor.getText().equals("Correo")){
            correoProveedor.setText("");
        }
    }//GEN-LAST:event_correoProveedorFocusGained

    private void razonSocialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_razonSocialFocusLost
        // TODO add your handling code here:
        if(razonSocial.getText().equals("")){
            razonSocial.setText("Razon Social");
        }
        razonSocial.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_razonSocialFocusLost

    private void rutProveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rutProveedorFocusLost
        // TODO add your handling code here:
        if(rutProveedor.getText().equals("")){
            rutProveedor.setText("Rut Proveedor");
        }
        rutProveedor.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_rutProveedorFocusLost

    private void nombreContactoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreContactoFocusLost
        // TODO add your handling code here:
        if(nombreContacto.getText().equals("")){
            nombreContacto.setText("Nombre Contacto");
        }
        nombreContacto.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_nombreContactoFocusLost

    private void direccionProveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionProveedorFocusLost
        // TODO add your handling code here:
        if(direccionProveedor.getText().equals("")){
            direccionProveedor.setText("Dirección");
        }
        direccionProveedor.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_direccionProveedorFocusLost

    private void celularProveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_celularProveedorFocusLost
        // TODO add your handling code here:
        if(celularProveedor.getText().equals("")){
            celularProveedor.setText("Celular");
        }
        celularProveedor.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_celularProveedorFocusLost

    private void correoProveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoProveedorFocusLost
        // TODO add your handling code here:
        if(correoProveedor.getText().equals("")){
            correoProveedor.setText("Correo");
        }
        correoProveedor.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_correoProveedorFocusLost

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        cliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Articulo articulo = new Articulo();
        articulo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Packs packs = new Packs();
        packs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Bancos bancos = new Bancos();
        bancos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Despacho despacho = new Despacho();
        despacho.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Comunas comunas = new Comunas();
        comunas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        CategoriaArt categoriaArt = new CategoriaArt();
        categoriaArt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        RedesSociales redesSociales = new RedesSociales();
        redesSociales.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        Facturas facturas = new Facturas();
        facturas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Proveedor proveedor = new Proveedor();
        proveedor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Informes informes = new Informes();
        informes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void agregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProveedorActionPerformed
        Controlador.ProveedorController.btnAgregar(razonSocial.getText(),rutProveedor.getText(),nombreContacto.getText(),direccionProveedor.getText(),celularProveedor.getText(),correoProveedor.getText());
        
    }//GEN-LAST:event_agregarProveedorActionPerformed

    private void celularProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularProveedorActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        Controlador.ProveedorController.Rellenar();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       Controlador.ProveedorController.btnModificar();
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedor().setVisible(true);
            }
        });
    }
        private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        cliente.setVisible(true);
        this.setVisible(false);
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarProveedor;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnListar;
    private javax.swing.JTextField celularProveedor;
    private javax.swing.JTextField correoProveedor;
    private javax.swing.JTextField direccionProveedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombreContacto;
    private javax.swing.JTextField razonSocial;
    private javax.swing.JTextField rutProveedor;
    public javax.swing.JTable tablaProveedor;
    // End of variables declaration//GEN-END:variables
}
