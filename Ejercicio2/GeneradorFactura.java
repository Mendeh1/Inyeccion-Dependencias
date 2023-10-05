// Implementación para generación y almacenamiento de facturas
public class GeneradorFactura implements Facturador {
    @Override
    public void generarYAlmacenarFactura(Compra compra) {
        // Lógica para generar y almacenar factura en la base de datos
        System.out.println("Generando factura y almacenándola en la base de datos para la compra con ID: " + compra.getId());
    }
}