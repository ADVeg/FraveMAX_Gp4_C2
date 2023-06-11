package Vistas;

import AccesoADatos.VentaData;
import AccesoADatos.ClienteData;
import java.time.LocalDate;

public class FraveMAX_Gp4_C2 {

///-------------------------------------------------PRUEBA ClienteData-----------------------------------------------------
//    public static void main(String[] args) {
//        ClienteData clienteData = new ClienteData();
//
//        clienteData.agregarCliente("Juan Perez", "Calle 123", "123456789");
//
//        clienteData.modificarCliente(1, "Juan Lopez", "Avenida 456", "987654321");
//
//        clienteData.eliminarCliente(2);
    }
///-------------------------------------------------FIN PRUEBA ClienteData-----------------------------------------------------

///-------------------------------------------------PRUEBA VentaData-----------------------------------------------------
    
 //       VentaData ventaData = new VentaData();

//ventaData.registrarVenta(1, LocalDate.now());

//ventaData.consultarVentas();
//   }
///-------------------------------------------------FIN PRUEBA VentaData-----------------------------------------------------

    

///-------------------------------------------------PRUEBA PRODUCTODATA-----------------------------------------------------
//        ProductoData prodD=new ProductoData();  ///CONEXION
        
//        prodD.nuevoProducto(new Producto(7,"Cacao","Chocolate","CACAO NESQUIK BOLSA 800gr",143.3,1,true));  ///CARGAR PRODUCTO

//        for (Producto prod1 : prodD.buscarCategoria("chocolate")) { ///BUSCAR PRODUCTO POR CATEGORIA
//            System.out.println(prod1);
//        }

//        System.out.println(prodD.buscarID(7)); ///BUSCAR POR ID

//        for (Producto prod2 : prodD.buscarNombre("cacao")) {    ///BUSCAR POR NOMBRE
//            System.out.println(prod2);
//        }

//        for (Producto producto : prodD.productosEnAlta()) {   ///PRODUCTOS EN ALTA
//            System.out.println(producto);
//        }

//        for (Producto producto : prodD.productosEnBaja()) { ///PRODUCTOS EN BAJA
//            System.out.println(producto);
//        }

//        prodD.modificarProducto(prod);    ///MODIFICAR PRODUCTO

//        prodD.bajaProducto(7);  ///BAJA PRODUCTO

//        prodD.altaProducto(7);    ///ALTA PRODUCTO
///-------------------------------------------------FIN PRUEBA PRODUCTODATA-----------------------------------------------------

///-------------------------------------------------PRUEBA DETALLEVENTADATA-----------------------------------------------------
//       DetalleVentaData detVD=new DetalleVentaData();
///------------------------------------CARGA DETALLEVENTA Y MODIFICAR-------------------------------------
//        Venta vent=new Venta();
//        vent.setIdVenta(1);
//        Producto prod4=new Producto();
//        prod4.setIdProducto(7);
//        detVD.nuevoDetalleVenta(new DetalleVenta(2,286.6,vent,prod4)); ///CARGAR DETALLEVENTA

//        detVD.modificarDetalleVenta(new DetalleVenta(8,2,286.6,vent,prod4));
///-------------------------------------------------------------------------------------------

//        System.out.println(detVD.buscarIdProducto(7));  ///BUSCAR POR IDPRODUCTO
        
//        System.out.println(detVD.buscarIdVenta(1)); ///BUSCAR POR IDVENTA

//        System.out.println(detVD.buscarIdDetalleVenta(8));  ///BUSCAR POR IDDETALLEVENTA

//        detVD.eliminarDetalleVentaPorID(8);    ///ELIMINAR DETALLEVENTA POR ID
//
//        for (DetalleVenta dV : detVD.detallesDeVenta()) {   ///LISTA DETALLEVENTA
//            System.out.println(dV);
//        }

///-------------------------------------------------FIN PRUEBA DETALLEVENTADATA-----------------------------------------------------


///-------------------------------------------------PRUEBA ProveedorData-----------------------------------------------------
    
//    ProveedorData proveedorData = new ProveedorData();
//
//        proveedorData.realizarPedido("Producto 1", 5, LocalDate.now().toString());

///-------------------------------------------------FIN PRUEBA ProveedorData-----------------------------------------------------

///-------------------------------------------------PRUEBA CompraData-----------------------------------------------------

//CompraData compraData = new CompraData();
//
//        Compra compra = new Compra();
//        compra.setIdCompra(1);
//        compra.setIdProveedor(1);
//        compra.setFecha(LocalDate.now());
//        compraData.agregarCompra(compra);
//
//        compraData.eliminarCompra(1);
//
//        Compra compraEncontrada = compraData.buscarCompra(1);
//        if (compraEncontrada != null) {
//            System.out.println("Compra encontrada:");
//            System.out.println("ID Compra: " + compraEncontrada.getIdCompra());
//            System.out.println("ID Proveedor: " + compraEncontrada.getIdProveedor());
//            System.out.println("Fecha: " + compraEncontrada.getFecha());

///-------------------------------------------------FIN PRUEBA CompraData-----------------------------------------------------

///-------------------------------------------------PRUEBA DetalleCompraData-----------------------------------------------------

//DetalleCompraData detalleCompraData = new DetalleCompraData();
//
//        // Agregar un detalle de compra
//        DetalleCompra detalleCompra = new DetalleCompra();
//        detalleCompra.setIdDetalle(1);
//        detalleCompra.setCantidad(10);
//        detalleCompra.setPrecioCosto(20.5);
//        detalleCompra.setIdCompra(1);
//        detalleCompra.setIdProducto(1);
//        detalleCompraData.agregarDetalleCompra(detalleCompra);
//
//        // Actualizar un detalle de compra
//        detalleCompra.setCantidad(5);
//        detalleCompraData.actualizarDetalleCompra(detalleCompra);
//
//        // Eliminar un detalle de compra
//        detalleCompraData.eliminarDetalleCompra(1);

///-------------------------------------------------FIN PRUEBA DetalleCompraData-----------------------------------------------------

