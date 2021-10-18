

package vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Cliente extends javax.swing.JFrame {
    DefaultTableModel modelo;

    
    public Cliente() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn ("Nombre Cliente");
        modelo.addColumn ("Rut Cliente");
        modelo.addColumn ("F. Nacimiento");
        modelo.addColumn ("Telefono");
        modelo.addColumn ("Celular");
        modelo.addColumn ("Correo");
        modelo.addColumn ("Redes Sociales");
        this.jTable2.setModel(modelo);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        nombreCliente = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        numeroTelefono = new javax.swing.JTextField();
        numeroCelular = new javax.swing.JTextField();
        correoElectronico = new javax.swing.JTextField();
        redesSociales = new javax.swing.JTextField();
        botonDesactivar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DreamGifts");

        jPanel1.setPreferredSize(new java.awt.Dimension(650, 550));

        nombreCliente.setForeground(new java.awt.Color(102, 102, 102));
        nombreCliente.setText("Nombre Cliente");
        nombreCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreClienteFocusLost(evt);
            }
        });

        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("Rut Cliente");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        numeroTelefono.setForeground(new java.awt.Color(102, 102, 102));
        numeroTelefono.setText("Telefono");
        numeroTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numeroTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numeroTelefonoFocusLost(evt);
            }
        });

        numeroCelular.setForeground(new java.awt.Color(102, 102, 102));
        numeroCelular.setText("Celular");
        numeroCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numeroCelularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numeroCelularFocusLost(evt);
            }
        });

        correoElectronico.setForeground(new java.awt.Color(102, 102, 102));
        correoElectronico.setText("Correo");
        correoElectronico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                correoElectronicoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                correoElectronicoFocusLost(evt);
            }
        });
        correoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoElectronicoActionPerformed(evt);
            }
        });

        redesSociales.setForeground(new java.awt.Color(102, 102, 102));
        redesSociales.setText("Redes Sociales");
        redesSociales.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                redesSocialesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                redesSocialesFocusLost(evt);
            }
        });
        redesSociales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redesSocialesActionPerformed(evt);
            }
        });

        botonDesactivar.setText("Desactivar");
        botonDesactivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDesactivarMouseClicked(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(numeroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(numeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(redesSociales, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(botonDesactivar)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redesSociales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDesactivar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numeroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Ventas");

        jMenu2.setText("Cliente");
        jMenu1.add(jMenu2);

        jMenu3.setText("Articulos");
        jMenu1.add(jMenu3);

        jMenu4.setText("Packs");
        jMenu1.add(jMenu4);

        jMenu5.setText("Bancos");
        jMenu1.add(jMenu5);

        jMenu6.setText("Despacho");
        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        jMenu7.setText("Compras");

        jMenu10.setText("Facturas");
        jMenu7.add(jMenu10);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Informes");

        jMenu11.setText("Listado Inventario");
        jMenu8.add(jMenu11);

        jMenu12.setText("Vencimiento Articulo");
        jMenu8.add(jMenu12);

        jMenu13.setText("Distribución Packs");
        jMenu8.add(jMenu13);

        jMenu14.setText("Informe Ventas Periodo");
        jMenu8.add(jMenu14);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Admin");

        jMenu15.setText("Ventas");
        jMenu9.add(jMenu15);

        jMenu16.setText("Compras");
        jMenu9.add(jMenu16);

        jMenu17.setText("Informes");
        jMenu9.add(jMenu17);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void redesSocialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redesSocialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redesSocialesActionPerformed

    private void correoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoElectronicoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String []Datos= new String[6];
        Datos[0]=nombreCliente.getText();
        nombreCliente.setText("");
        Datos[1]=jTextField1.getText();
        jTextField1.setText("");
        Datos[2]=numeroCelular.getText();
        numeroCelular.setText("");
        Datos[3]=numeroTelefono.getText();
        numeroTelefono.setText("");
        Datos[4]=correoElectronico.getText();
        correoElectronico.setText("");
        Datos[5]=redesSociales.getText();
        redesSociales.setText("");
        modelo.addRow(Datos);
    }//GEN-LAST:event_jButton1MouseClicked

    private void botonDesactivarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDesactivarMouseClicked
        int fila=jTable2.getSelectedRow();
        if(fila>=0){
            modelo.removeRow(fila);
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccionar fila");
        }
    }//GEN-LAST:event_botonDesactivarMouseClicked

    private void nombreClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreClienteFocusGained
        
        
        if(nombreCliente.getText().equals("Nombre Cliente")){
            nombreCliente.setText("");
        }
    }//GEN-LAST:event_nombreClienteFocusGained

    private void nombreClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreClienteFocusLost
        // TODO add your handling code here:
        if(nombreCliente.getText().equals("")){
            nombreCliente.setText("Nombre Cliente");
        }
        nombreCliente.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_nombreClienteFocusLost

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        if(jTextField1.getText().equals("")){
            jTextField1.setText("Rut Cliente");
        }
        jTextField1.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        if(jTextField1.getText().equals("Rut Cliente")){
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void numeroCelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroCelularFocusGained
        // TODO add your handling code here:
        if(numeroCelular.getText().equals("Celular")){
            numeroCelular.setText("");
        }
    }//GEN-LAST:event_numeroCelularFocusGained

    private void numeroCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroCelularFocusLost
        // TODO add your handling code here:
        if(numeroCelular.getText().equals("")){
            numeroCelular.setText("Celular");
        }
        numeroCelular.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_numeroCelularFocusLost

    private void numeroTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroTelefonoFocusGained
        // TODO add your handling code here:
        if(numeroTelefono.getText().equals("Telefono")){
            numeroTelefono.setText("");
        }
    }//GEN-LAST:event_numeroTelefonoFocusGained

    private void numeroTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroTelefonoFocusLost
        // TODO add your handling code here:
        if(numeroTelefono.getText().equals("")){
            numeroTelefono.setText("Telefono");
        }
        numeroTelefono.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_numeroTelefonoFocusLost

    private void correoElectronicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoElectronicoFocusLost
        // TODO add your handling code here:
        if(correoElectronico.getText().equals("")){
            correoElectronico.setText("Correo");
        }
        correoElectronico.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_correoElectronicoFocusLost

    private void correoElectronicoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoElectronicoFocusGained
        // TODO add your handling code here:
        if(correoElectronico.getText().equals("Correo")){
            correoElectronico.setText("");
        }
    }//GEN-LAST:event_correoElectronicoFocusGained

    private void redesSocialesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_redesSocialesFocusGained
        // TODO add your handling code here:
        if(redesSociales.getText().equals("Redes Sociales")){
            redesSociales.setText("");
        }
    }//GEN-LAST:event_redesSocialesFocusGained

    private void redesSocialesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_redesSocialesFocusLost
        // TODO add your handling code here:
        if(redesSociales.getText().equals("")){
            redesSociales.setText("Redes Sociales");
        }
        redesSociales.setForeground(new Color (102,102,102));
    }//GEN-LAST:event_redesSocialesFocusLost

    /*
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDesactivar;
    private javax.swing.JTextField correoElectronico;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JTextField numeroCelular;
    private javax.swing.JTextField numeroTelefono;
    private javax.swing.JTextField redesSociales;
    // End of variables declaration//GEN-END:variables
}
