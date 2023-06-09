package Vistas;

import Entidades.Proveedor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vega Alberto
 */
public class ViewEliminarProveedor extends javax.swing.JInternalFrame {
    private int id[];
    /**
     * Creates new form ViewEliminarProveedor
     */
    public ViewEliminarProveedor() {
        super("ELIMINAR PROVEEDOR");
        initComponents();
        CargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLProveedor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDatos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jBSalir = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jTProveedor = new javax.swing.JTextField();

        jLProveedor.setText("Proveedor");

        jTDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTDatos);

        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBEliminar.setText("ELIMINAR");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jTProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTProveedorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLProveedor)
                .addGap(18, 18, 18)
                .addComponent(jTProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLProveedor)
                    .addComponent(jTProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBEliminar))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProveedorKeyReleased
        CargarTabla();
    }//GEN-LAST:event_jTProveedorKeyReleased

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if(jTDatos.getSelectedRow()>-1){
            Vista_FraveMAX.provD.Baja(id[jTDatos.getSelectedRow()]);
            CargarTabla();
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un proveedor");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void CargarTabla(){
        String colum[]={"RASON SOCIAL","DOMICILIO","TELEFONO"};
        Vista_FraveMAX.proveedores=Vista_FraveMAX.provD.Proveedores(jTProveedor.getText(),true);
        id=new int[Vista_FraveMAX.proveedores.size()];
        String datos[][]=new String[Vista_FraveMAX.proveedores.size()][3];
        int i=0;
        for (Proveedor proveedor : Vista_FraveMAX.proveedores) {
            id[i]=proveedor.getIdProveedor();
            datos[i][0]=proveedor.getRasonSocial();
            datos[i][1]=proveedor.getDomicilio();
            datos[i][2]=proveedor.getTelefono()+"";
            i++;
        }
        jTDatos.setModel(new DefaultTableModel(datos,colum));
        jTDatos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLProveedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTDatos;
    private javax.swing.JTextField jTProveedor;
    // End of variables declaration//GEN-END:variables
}
