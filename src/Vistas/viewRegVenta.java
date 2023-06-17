/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Entidades.Cliente;
import Entidades.DetalleVenta;
import Entidades.Producto;
import Entidades.Venta;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Turconi Matías
 */
public class viewRegVenta extends javax.swing.JInternalFrame {
    
    public viewRegVenta() {
        initComponents();
        cargarComboCliente();
        cargarComboProd();
        LocalDate fecha=LocalDate.now();
        jCheckEstado.setMaxSelectableDate(Date.valueOf(fecha));
        jCheckEstado.setMinSelectableDate(Date.valueOf(fecha));
        jCheckEstado.getDateEditor().setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBoxCliente = new javax.swing.JComboBox<>();
        jBoxProd = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckEstado = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jBotSalir = new javax.swing.JButton();
        jBotEnviar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextCant = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Seleccine un cliente:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Seleccine un producto:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Fecha de venta:");

        jBotSalir.setText("Salir");
        jBotSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotSalirActionPerformed(evt);
            }
        });

        jBotEnviar.setText("Enviar");
        jBotEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotEnviarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad vendida:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("REGISTRAR VENTA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBotEnviar)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(jBoxProd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(jTextCant))))
                        .addGap(95, 95, 95)))
                .addComponent(jBotSalir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBoxProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotSalir)
                    .addComponent(jBotEnviar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jBotEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotEnviarActionPerformed
            
            Vista_FraveMAX.prod=(Producto)jBoxProd.getSelectedItem();
            if(Vista_FraveMAX.prod.getStock()>=Integer.parseInt(jTextCant.getText())){
            Vista_FraveMAX.ventD.registrarVenta((Cliente)jBoxCliente.getSelectedItem(), jCheckEstado.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            Vista_FraveMAX.vent=new Venta(buscarVenta(),jCheckEstado.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),(Cliente)jBoxCliente.getSelectedItem());
            Vista_FraveMAX.detVen=new DetalleVenta(Integer.parseInt(jTextCant.getText()),Vista_FraveMAX.prod.getPrecioActual()*Integer.parseInt(jTextCant.getText()),Vista_FraveMAX.vent,Vista_FraveMAX.prod);
            Vista_FraveMAX.detVenD.nuevoDetalleVenta(Vista_FraveMAX.detVen);
            Vista_FraveMAX.prod.setStock(Vista_FraveMAX.prod.getStock()-Integer.parseInt(jTextCant.getText()));
            Vista_FraveMAX.prodD.modificarProducto(Vista_FraveMAX.prod);
            Vista_FraveMAX.vent=null;
            Vista_FraveMAX.prod=null;
            JOptionPane.showMessageDialog(null, "Venta Realizada");
            }else{
                JOptionPane.showMessageDialog(null, "Cantidad insuficiente");
            }
            Limpiar();
        
    }//GEN-LAST:event_jBotEnviarActionPerformed

    private void jBotSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBotSalirActionPerformed

    
    private int buscarVenta(){
        List<Venta> ventas =new ArrayList<>();
        ventas=Vista_FraveMAX.ventD.venta();
        int id[]=new int[ventas.size()];
        int i=0;
        for (Venta venta : ventas) {
            id[i]=venta.getIdVenta();
            i++;
        }
        return id[i-1];
    }
    
    
    private void Limpiar() {
        jTextCant.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotEnviar;
    private javax.swing.JButton jBotSalir;
    private javax.swing.JComboBox<Cliente> jBoxCliente;
    private javax.swing.JComboBox<Producto> jBoxProd;
    private com.toedter.calendar.JDateChooser jCheckEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextCant;
    // End of variables declaration//GEN-END:variables

    private void cargarComboCliente() {
        for (Cliente cliente : Vista_FraveMAX.cliD.clientes()) {
            jBoxCliente.addItem(cliente);
        }
    }
    
    private void cargarComboProd() {
        for (Producto producto : Vista_FraveMAX.prodD.productos()) {
            jBoxProd.addItem(producto);
        }
    }
    
    
    
}
