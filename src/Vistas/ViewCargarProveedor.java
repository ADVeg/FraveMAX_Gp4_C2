package Vistas;

import Entidades.Proveedor;
import javax.swing.JOptionPane;

/**
 *
 * @author Vega Alberto
 */
public class ViewCargarProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewCargarProveedor
     */
    public ViewCargarProveedor() {
        super("CARGAR PROVEEDOR");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLRasonSocial = new javax.swing.JLabel();
        jTRasonSocial = new javax.swing.JTextField();
        jLDomicilio = new javax.swing.JLabel();
        jTDomicilio = new javax.swing.JTextField();
        jLTelefono = new javax.swing.JLabel();
        jTTelefono = new javax.swing.JTextField();
        jBSalir = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();

        jLRasonSocial.setText("Rason Social");

        jLDomicilio.setText("Domicilio");

        jLTelefono.setText("Telefono");

        jTTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTelefonoKeyTyped(evt);
            }
        });

        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBGuardar.setText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLRasonSocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTRasonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTDomicilio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jBGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRasonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTRasonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBGuardar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        boolean msj=false;
        if(!msj){msj=verificarCampos(jTRasonSocial);}
        if(!msj){msj=verificarCampos(jTDomicilio);}
        if(!msj){msj=verificarCampos(jTTelefono);}
        if(!msj){
            Vista_FraveMAX.provD.nuevoProveedor(new Proveedor(jTRasonSocial.getText(),jTDomicilio.getText(),Long.parseLong(jTTelefono.getText())));
            Limpiar();
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTelefonoKeyTyped
        if((evt.getKeyChar()<48||evt.getKeyChar()>57)&&evt.getKeyChar()!=8){
            JOptionPane.showMessageDialog(this, "Igresar solo numeros","Advertencia",JOptionPane.WARNING_MESSAGE);
            evt.consume();
            jTTelefono.requestFocus();
        }
    }//GEN-LAST:event_jTTelefonoKeyTyped

    private boolean verificarCampos(javax.swing.JTextField tx){
        if(tx.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Completar Campo");
            tx.requestFocus();
            return true;
        }else{return false;}
    }
    private void Limpiar(){
        jTDomicilio.setText("");
        jTRasonSocial.setText("");
        jTTelefono.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLDomicilio;
    private javax.swing.JLabel jLRasonSocial;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTRasonSocial;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables
}