/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Producto;
import Entidades.Proveedor;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

/**
 *
 * @author Vega Alberto
 */
public class ViewRealizarPedidoProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewRealizarPedidoProveedor
     */
    public ViewRealizarPedidoProveedor() {
        super("REALIZAR PEDIDO");
        initComponents();
        LocalDate fecha=LocalDate.now();
        jDCFecha.setMaxSelectableDate(Date.valueOf(fecha));
        jDCFecha.setMinSelectableDate(Date.valueOf(fecha));
        jDCFecha.getDateEditor().setEnabled(false);
        cargarProveedoresYProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLProveedores = new javax.swing.JLabel();
        jCBProveedores = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLProductos = new javax.swing.JLabel();
        jCBProductos = new javax.swing.JComboBox<>();
        jLFecha = new javax.swing.JLabel();
        jTCantidad = new javax.swing.JTextField();
        jDCFecha = new com.toedter.calendar.JDateChooser();
        jLCantidad = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jBRealizarPedido = new javax.swing.JButton();

        jLProveedores.setText("PROVEEDORES");

        jLProductos.setText("PRODUCTOS");

        jLFecha.setText("Fecha");

        jTCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCantidadKeyTyped(evt);
            }
        });

        jLCantidad.setText("Cantidad");

        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBRealizarPedido.setText("REALIZAR PEDIDO");
        jBRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRealizarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLProveedores)
                        .addGap(18, 18, 18)
                        .addComponent(jCBProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBRealizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCBProveedores)
                    .addComponent(jLProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCBProductos)
                    .addComponent(jLProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jDCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBRealizarPedido))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCantidadKeyTyped
        if((evt.getKeyChar()<48||evt.getKeyChar()>57)&&evt.getKeyChar()!=8){
            JOptionPane.showMessageDialog(this, "Igresar solo numeros","Advertencia",JOptionPane.WARNING_MESSAGE);
            evt.consume();
            jTCantidad.requestFocus();
        }
    }//GEN-LAST:event_jTCantidadKeyTyped

    private void jBRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRealizarPedidoActionPerformed
        boolean msj=false;
        if(jCBProveedores.getItemCount()==0){
            JOptionPane.showMessageDialog(null, "Cargar un proveedor");
            msj=true;
        }
        if(jCBProductos.getItemCount()==0){
            JOptionPane.showMessageDialog(null, "Cargar un producto");
            msj=true;
        }
        if(!msj){msj=verificarCampos(jTCantidad);}
        if(!msj){
            if(jDCFecha.getDate()==null){
                msj=true;
                JOptionPane.showMessageDialog(null, "Completar Fecha");
                jDCFecha.requestFocus();
            }
        }
        if(!msj){
            Vista_FraveMAX.comD.agregarCompra(new Compra((Proveedor)jCBProveedores.getSelectedItem(),jDCFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()));
            Vista_FraveMAX.comp=new Compra(buscarCompra(),(Proveedor)jCBProveedores.getSelectedItem(),jDCFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            Vista_FraveMAX.prod=(Producto)jCBProductos.getSelectedItem();
            double precio=Vista_FraveMAX.prod.getPrecioActual()*Integer.parseInt(jTCantidad.getText());
            Vista_FraveMAX.detComD.agregarDetalleCompra(new DetalleCompra(Integer.parseInt(jTCantidad.getText()),precio,Vista_FraveMAX.comp,Vista_FraveMAX.prod));
            Vista_FraveMAX.prod.setStock(Vista_FraveMAX.prod.getStock()+Integer.parseInt(jTCantidad.getText()));
            Vista_FraveMAX.prodD.modificarProducto(Vista_FraveMAX.prod);
            Vista_FraveMAX.comp=null;
            Vista_FraveMAX.prod=null;
            JOptionPane.showMessageDialog(this, "Pedido Realizado");
        }
    }//GEN-LAST:event_jBRealizarPedidoActionPerformed

    private int buscarCompra(){
        Vista_FraveMAX.compras=Vista_FraveMAX.comD.compras();
        int id[]=new int[Vista_FraveMAX.compras.size()];
        int i=0;
        for (Compra compra : Vista_FraveMAX.compras) {
            id[i]=compra.getIdCompra();
            i++;
        }
        return id[i-1];
    }
    
    private boolean verificarCampos(javax.swing.JTextField tx){
        if(tx.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Completar Campo");
            tx.requestFocus();
            return true;
        }else{return false;}
    }
    
    private void cargarProveedoresYProductos(){
        for (Proveedor Prov : Vista_FraveMAX.provD.Proveedores()) {
            jCBProveedores.addItem(Prov);
        }
        for (Producto prod : Vista_FraveMAX.prodD.productos()) {
            jCBProductos.addItem(prod);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRealizarPedido;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Producto> jCBProductos;
    private javax.swing.JComboBox<Proveedor> jCBProveedores;
    private com.toedter.calendar.JDateChooser jDCFecha;
    private javax.swing.JLabel jLCantidad;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLProductos;
    private javax.swing.JLabel jLProveedores;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTCantidad;
    // End of variables declaration//GEN-END:variables
}