// Aplicación Principal
public class Main {

    public static void main(String[] args) {
        // Configuración de implementaciones concretas
        NotificacionSender notificacionSender = new CorreoElectronicoSender(); // Puedes cambiar esto a SMSSender para probar el envío de SMS
        Facturador facturador = new GeneradorFactura();

        // Crear instancia de Cliente y Compra (simulación)
        Cliente cliente = new Cliente("NombreCliente", "cliente@ejemplo.com", "123456789");
        Compra compra = new Compra(1, cliente);

        // Enviar notificaciones y generar factura
        notificacionSender.enviarNotificacion(cliente, "Gracias por tu compra");
        facturador.generarYAlmacenarFactura(compra);
    }
}

