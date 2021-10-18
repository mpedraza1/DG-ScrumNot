
package vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class CategoriaArt extends javax.swing.JFrame {
        DefaultTableModel modelo;
    /**
     * Creates new form CategoriaArt
     */
    public CategoriaArt() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("categoria articulo");
        modelo.addColumn("estado");
        this.jTable1.setModel(modelo);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        agregarArticulo = new javax.swing.JButton();
        guardarArticulo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        seleccionEstadocategoriaart = new javax.swing.JComboBox<>();
        labelEstadocategoriaarticulo = new javax.swing.JLabel();
        seleccionCatArt = new javax.swing.JComboBox<>();
        labelCategoriaArt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        menuProveedor = new javax.swing.JMenu();
        menuFacturas = new javax.swing.JMenu();
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

        jPanel1.setToolTipText("");

        agregarArticulo.setText("Actualizar");
        agregarArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarArticuloMouseClicked(evt);
            }
        });

        guardarArticulo.setText("Desactivar");
        guardarArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarArticuloMouseClicked(evt);
            }
        });

        seleccionEstadocategoriaart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        seleccionEstadocategoriaart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionEstadocategoriaartActionPerformed(evt);
            }
        });

        labelEstadocategoriaarticulo.setText("Estado");

        seleccionCatArt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chocolates", "Galletas", "Globos", "Tazones", "Licores", "Flores" }));

        labelCategoriaArt.setText("Categoria Articulo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(labelCategoriaArt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seleccionCatArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(labelEstadocategoriaarticulo)
                .addGap(18, 18, 18)
                .addComponent(seleccionEstadocategoriaart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(agregarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guardarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(agregarArticulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEstadocategoriaarticulo)
                            .addComponent(seleccionEstadocategoriaart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seleccionCatArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCategoriaArt))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardarArticulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Categoria Articulo", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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

        menuProveedor.setText("Proveedor");
        jMenu7.add(menuProveedor);

        menuFacturas.setText("Facturas");
        jMenu7.add(menuFacturas);

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionEstadocategoriaartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionEstadocategoriaartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionEstadocategoriaartActionPerformed

    private void agregarArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarArticuloMouseClicked
        // TODO add your handling code here:
        String []Datos= new String[2];
        Datos[0]=seleccionCatArt.getSelectedItem().toString();
        Datos[1]=seleccionEstadocategoriaart.getSelectedItem().toString();
        modelo.addRow(Datos);
    }//GEN-LAST:event_agregarArticuloMouseClicked

    private void guardarArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarArticuloMouseClicked
        
        int fila=jTable1.getSelectedRow();
        if(fila>=0){
            modelo.removeRow(fila);
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccionar fila");
    }//GEN-LAST:event_guardarArticuloMouseClicked
}
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
            java.util.logging.Logger.getLogger(CategoriaArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoriaArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoriaArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoriaArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoriaArt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarArticulo;
    private javax.swing.JButton guardarArticulo;
    private javax.swing.JMenu jMenu1;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelCategoriaArt;
    private javax.swing.JLabel labelEstadocategoriaarticulo;
    private javax.swing.JMenu menuFacturas;
    private javax.swing.JMenu menuProveedor;
    private javax.swing.JComboBox<String> seleccionCatArt;
    private javax.swing.JComboBox<String> seleccionEstadocategoriaart;
    // End of variables declaration//GEN-END:variables
}
