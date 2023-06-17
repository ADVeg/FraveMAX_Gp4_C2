package Vistas;

import AccesoADatos.ClienteData;
import AccesoADatos.CompraData;
import AccesoADatos.DetalleCompraData;
import AccesoADatos.DetalleVentaData;
import AccesoADatos.ProductoData;
import AccesoADatos.ProveedorData;
import AccesoADatos.VentaData;
import Entidades.Cliente;
import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.DetalleVenta;
import Entidades.Producto;
import Entidades.Proveedor;
import Entidades.Venta;
import java.util.List;


/**
 *
 * @author Turconi Matías
 */
public class Vista_FraveMAX extends javax.swing.JFrame {
    public static ClienteData cliD=new ClienteData();
    public static CompraData comD=new CompraData();
    public static DetalleCompraData detComD=new DetalleCompraData();
    public static DetalleVentaData detVenD=new DetalleVentaData();
    public static ProductoData prodD=new ProductoData();
    public static ProveedorData provD=new ProveedorData();
    public static VentaData ventD=new VentaData();
    public static Cliente clien=null;
    public static Compra comp=null;
    public static List<Compra> compras=null;
    public static DetalleCompra detCom=null;
    public static DetalleVenta detVen=null;
    public static Producto prod=null;
    public static Proveedor prov=null;
    public static List<Proveedor> proveedores=null;
    public static Venta vent=null;
    public static List<DetalleVenta> detventas=null;
    public static List<Producto> productos=null;   

    public Vista_FraveMAX() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jAdmin = new javax.swing.JMenu();
        jAgrCliente = new javax.swing.JMenuItem();
        jModCliente = new javax.swing.JMenuItem();
        jElimCliente = new javax.swing.JMenuItem();
        jRegVenta = new javax.swing.JMenuItem();
        jConsVenta = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMICargar = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");

        jMenu5.setText("jMenu5");

        jMenu6.setText("File");
        jMenuBar4.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar4.add(jMenu7);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        jAdmin.setText("Administrar");

        jAgrCliente.setText("Agregar Cliente");
        jAgrCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgrClienteActionPerformed(evt);
            }
        });
        jAdmin.add(jAgrCliente);

        jModCliente.setText("Modificar Cliente");
        jModCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModClienteActionPerformed(evt);
            }
        });
        jAdmin.add(jModCliente);

        jElimCliente.setText("Eliminar Cliente");
        jElimCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jElimClienteActionPerformed(evt);
            }
        });
        jAdmin.add(jElimCliente);

        jRegVenta.setText("Registrar Venta");
        jRegVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegVentaActionPerformed(evt);
            }
        });
        jAdmin.add(jRegVenta);

        jConsVenta.setText("Consultar Ventas");
        jConsVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsVentaActionPerformed(evt);
            }
        });
        jAdmin.add(jConsVenta);

        jMenuBar1.add(jAdmin);

        jMenu8.setText("Productos");

        jMICargar.setText("Cargar");
        jMICargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICargarActionPerformed(evt);
            }
        });
        jMenu8.add(jMICargar);

        jMenuItem5.setText("Inventario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem5);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Proveedores");

        jMenuItem3.setText("Cargar Proveedor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem3);

        jMenuItem4.setText("Realizar Pedido");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem4);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jModClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModClienteActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        viewModCliente vmc=new viewModCliente();
        vmc.setVisible(true);
        Escritorio.add(vmc); 
    }//GEN-LAST:event_jModClienteActionPerformed

    private void jElimClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jElimClienteActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        viewElimCliente vec=new viewElimCliente();
        vec.setVisible(true);
        Escritorio.add(vec);
    }//GEN-LAST:event_jElimClienteActionPerformed

    private void jConsVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsVentaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ViewConsultarVentas vcv=new ViewConsultarVentas();
        vcv.setVisible(true);
        Escritorio.add(vcv);
    }//GEN-LAST:event_jConsVentaActionPerformed

    private void jAgrClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgrClienteActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        viewAgregarCliente vac=new viewAgregarCliente();
        vac.setVisible(true);
        Escritorio.add(vac);
    }//GEN-LAST:event_jAgrClienteActionPerformed

    private void jRegVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegVentaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        viewRegVenta vrv=new viewRegVenta();
        vrv.setVisible(true);
        Escritorio.add(vrv);
    }//GEN-LAST:event_jRegVentaActionPerformed

    private void jMICargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICargarActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ViewCargarProducto vCP=new ViewCargarProducto();
        vCP.setVisible(true);
        Escritorio.add(vCP);
    }//GEN-LAST:event_jMICargarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ViewCargarProveedor vCP=new ViewCargarProveedor();
        vCP.setVisible(true);
        Escritorio.add(vCP);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ViewRealizarPedidoProveedor vRPP=new ViewRealizarPedidoProveedor();
        vRPP.setVisible(true);
        Escritorio.add(vRPP);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ViewConsultarInventario vRPP=new ViewConsultarInventario();
        vRPP.setVisible(true);
        Escritorio.add(vRPP);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_FraveMAX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_FraveMAX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_FraveMAX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_FraveMAX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Vista_FraveMAX().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jAdmin;
    private javax.swing.JMenuItem jAgrCliente;
    private javax.swing.JMenuItem jConsVenta;
    private javax.swing.JMenuItem jElimCliente;
    private javax.swing.JMenuItem jMICargar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jModCliente;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenuItem jRegVenta;
    // End of variables declaration//GEN-END:variables
}
