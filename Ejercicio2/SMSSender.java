// Implementación para enviar mensajes SMS
public class SMSSender implements NotificacionSender {
    @Override
    public void enviarNotificacion(Cliente cliente, String mensaje) {
        // Lógica para enviar mensaje SMS
        System.out.println("Enviando SMS a " + cliente.getNumeroTelefono() + ": " + mensaje);
    }
}
