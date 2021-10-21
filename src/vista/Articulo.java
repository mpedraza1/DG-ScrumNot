//
package vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class Articulo extends javax.swing.JFrame {
DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form ejemplo
     */
    public Articulo() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo.addColumn("Marca");
        modelo.addColumn("Codigo");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Factura");
        modelo.addColumn("O Compra");
        modelo.addColumn("Rut proveedor");
        modelo.addColumn("Fecha de Venc");
        modelo.addColumn("Estado");
        tabla.setModel(modelo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtven = new javax.swing.JTextField();
        JCEstado = new javax.swing.JComboBox<>();
        agregar = new javax.swing.JButton();
        categoriaArt = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        txtordendecompra = new javax.swing.JTextField();
        txtrutproveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtfactura = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 0));

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        txtven.setForeground(new java.awt.Color(102, 102, 102));
        txtven.setText("F. vencimiento");
        txtven.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtvenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtvenFocusLost(evt);
            }
        });
        txtven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvenActionPerformed(evt);
            }
        });

        JCEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "0" }));
        JCEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCEstadoActionPerformed(evt);
            }
        });

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/GuardarTodo.png"))); // NOI18N
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        categoriaArt.setText("estado");

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/borrar.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Actualizar (2).png"))); // NOI18N
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        txtordendecompra.setForeground(new java.awt.Color(102, 102, 102));
        txtordendecompra.setText("Orden de compra");
        txtordendecompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtordendecompraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtordendecompraFocusLost(evt);
            }
        });
        txtordendecompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtordendecompraActionPerformed(evt);
            }
        });

        txtrutproveedor.setForeground(new java.awt.Color(102, 102, 102));
        txtrutproveedor.setText("Rut proveedor");
        txtrutproveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrutproveedorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtrutproveedorFocusLost(evt);
            }
        });
        txtrutproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrutproveedorActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        txtfactura.setForeground(new java.awt.Color(102, 102, 102));
        txtfactura.setText("N° Factura");
        txtfactura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfacturaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfacturaFocusLost(evt);
            }
        });
        txtfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfacturaActionPerformed(evt);
            }
        });

        txtdescripcion.setForeground(new java.awt.Color(102, 102, 102));
        txtdescripcion.setText("Descripción");
        txtdescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdescripcionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdescripcionFocusLost(evt);
            }
        });
        txtdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionActionPerformed(evt);
            }
        });

        txtcantidad.setForeground(new java.awt.Color(102, 102, 102));
        txtcantidad.setText("Cantidad");
        txtcantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcantidadFocusLost(evt);
            }
        });

        txtcodigo.setForeground(new java.awt.Color(102, 102, 102));
        txtcodigo.setText("Codigo");
        txtcodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcodigoFocusLost(evt);
            }
        });
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        txtmarca.setForeground(new java.awt.Color(102, 102, 102));
        txtmarca.setText("Marca");
        txtmarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtmarcaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmarcaFocusLost(evt);
            }
        });
        txtmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(agregar)
                        .addGap(18, 18, 18)
                        .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(modificar)
                        .addGap(19, 19, 19))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtfactura))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(txtordendecompra, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtrutproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(txtven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(categoriaArt)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JCEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(eliminar)
                    .addComponent(modificar)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtordendecompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtrutproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JCEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(categoriaArt))
                    .addContainerGap(311, Short.MAX_VALUE)))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
       String Dato[] = new String [9];
       
       Dato[0] = txtmarca.getText();
       Dato[1] = txtcodigo.getText();
       Dato[2] = txtcantidad.getText();
       Dato[3] = txtdescripcion.getText();
       Dato[4] = txtfactura.getText();
       Dato[5] = txtordendecompra.getText();
       Dato[6] = txtrutproveedor.getText();
       Dato[7] = txtven.getText();
       Dato[8] = JCEstado.getSelectedItem().toString();
       modelo.addRow(Dato);
       
    }//GEN-LAST:event_agregarActionPerformed

    private void txtmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarcaActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcionActionPerformed

    private void txtfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfacturaActionPerformed

    private void txtrutproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrutproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrutproveedorActionPerformed

    private void txtvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvenActionPerformed

    private void JCEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCEstadoActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
     int FilaSelec = tabla.getSelectedRow();
     if(FilaSelec>=0){
         modelo.removeRow(FilaSelec);
         
     }
     else{JOptionPane.showMessageDialog(this, "FILA NO SELECCIONADA");
     }
    }//GEN-LAST:event_eliminarActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
       txtmarca.setText("");
        txtcodigo.setText("");
        txtcantidad.setText("");
        txtdescripcion.setText("");
        txtfactura.setText("");
        txtordendecompra.setText("");
        txtrutproveedor.setText("");
        txtven.setText("");
        txtmarca.requestFocus();
        
    }//GEN-LAST:event_nuevoActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
       /* int FilaSelec = tabla.getSelectedRow();
        if(FilaSelec>= 0){
            txtmarca.setText(tabla.getValueAt(FilaSelec,0).toString());
            txtcodigo.setText(tabla.getValueAt(FilaSelec,1).toString());
            txtcantidad.setText(tabla.getValueAt(FilaSelec,2).toString());
            txtdescripcion.setText(tabla.getValueAt(FilaSelec,3).toString());
            txtfactura.setText(tabla.getValueAt(FilaSelec,4).toString());
            txtordendecompra.setText(tabla.getValueAt(FilaSelec,5).toString());
            txtrutproveedor.setText(tabla.getValueAt(FilaSelec,6).toString());
            txtven.setText(tabla.getValueAt(FilaSelec,7).toString());
            
            modelo.removeRow(FilaSelec);
            
        }
        else{
            JOptionPane.showMessageDialog(this, "FILA NO SELECCIONADA");
        }
        
        */
    }//GEN-LAST:event_modificarActionPerformed

    private void txtmarcaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmarcaFocusGained
        // TODO add your handling code here:
        if(txtmarca.getText().equals("Marca")){
            txtmarca.setText("");
        }
    }//GEN-LAST:event_txtmarcaFocusGained

    private void txtmarcaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmarcaFocusLost
        // TODO add your handling code here:
        if(txtmarca.getText().equals("")){
            txtmarca.setText("Marca");
        }
        txtmarca.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_txtmarcaFocusLost

    private void txtcodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcodigoFocusGained
        // TODO add your handling code here:
        if(txtcodigo.getText().equals("Codigo")){
            txtcodigo.setText("");
    }//GEN-LAST:event_txtcodigoFocusGained
    }
    private void txtcodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcodigoFocusLost
        // TODO add your handling code here:
        if(txtcodigo.getText().equals("")){
            txtcodigo.setText("Codigo");
        }
        txtcodigo.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_txtcodigoFocusLost

    private void txtcantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcantidadFocusGained
        // TODO add your handling code here:
        if(txtcantidad.getText().equals("Cantidad")){
            txtcantidad.setText("");
        } 
    }//GEN-LAST:event_txtcantidadFocusGained

    private void txtcantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcantidadFocusLost
        // TODO add your handling code here:
        if(txtcantidad.getText().equals("")){
            txtcantidad.setText("Cantidad");
        }
        txtcantidad.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_txtcantidadFocusLost

    private void txtfacturaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfacturaFocusGained
        // TODO add your handling code here:
        if(txtfactura.getText().equals("N° Factura")){
            txtfactura.setText("");
        } 
    }//GEN-LAST:event_txtfacturaFocusGained

    private void txtfacturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfacturaFocusLost
        // TODO add your handling code here:
        if(txtfactura.getText().equals("")){
            txtfactura.setText("N° Factura");
        }
        txtfactura.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_txtfacturaFocusLost

    private void txtordendecompraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtordendecompraFocusGained
        // TODO add your handling code here:
        if(txtordendecompra.getText().equals("Orden de compra")){
            txtordendecompra.setText("");
    } 
    }//GEN-LAST:event_txtordendecompraFocusGained

    private void txtordendecompraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtordendecompraFocusLost
        // TODO add your handling code here:
        if(txtordendecompra.getText().equals("")){
            txtordendecompra.setText("Orden de compra");
        }
        txtfactura.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_txtordendecompraFocusLost

    private void txtordendecompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtordendecompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtordendecompraActionPerformed

    private void txtrutproveedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrutproveedorFocusGained
        // TODO add your handling code here:
        if(txtrutproveedor.getText().equals("Rut proveedor")){
            txtrutproveedor.setText("");
    } 
    }//GEN-LAST:event_txtrutproveedorFocusGained

    private void txtrutproveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrutproveedorFocusLost
        // TODO add your handling code here:
        if(txtrutproveedor.getText().equals("")){
            txtrutproveedor.setText("Rut proveedor");
        }
        txtrutproveedor.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_txtrutproveedorFocusLost

    private void txtvenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtvenFocusGained
        // TODO add your handling code here:
        if(txtven.getText().equals("F. vencimiento")){
            txtven.setText("");
        }
    }//GEN-LAST:event_txtvenFocusGained

    private void txtvenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtvenFocusLost
        // TODO add your handling code here:
        if(txtven.getText().equals("")){
            txtven.setText("F. vencimiento");
        }
        txtven.setForeground(new Color (102,102,102));
        
    }//GEN-LAST:event_txtvenFocusLost

    private void txtdescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdescripcionFocusGained
        // TODO add your handling code here:
        if(txtdescripcion.getText().equals("Descripción")){
            txtdescripcion.setText("");
        }
    }//GEN-LAST:event_txtdescripcionFocusGained

    private void txtdescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdescripcionFocusLost
        // TODO add your handling code here:
        if(txtdescripcion.getText().equals("")){
            txtdescripcion.setText("Descripción");
        }
        txtdescripcion.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_txtdescripcionFocusLost

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
        CategoriaArt CategoriaArt = new CategoriaArt();
        CategoriaArt.setVisible(true);
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
            java.util.logging.Logger.getLogger(Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Articulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCEstado;
    private javax.swing.JButton agregar;
    private javax.swing.JLabel categoriaArt;
    private javax.swing.JButton eliminar;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtfactura;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtordendecompra;
    private javax.swing.JTextField txtrutproveedor;
    private javax.swing.JTextField txtven;
    // End of variables declaration//GEN-END:variables
}
