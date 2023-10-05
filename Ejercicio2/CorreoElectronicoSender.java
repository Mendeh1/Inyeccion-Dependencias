// Implementación para enviar correos electrónicos
public class CorreoElectronicoSender implements NotificacionSender {
    @Override
    public void enviarNotificacion(Cliente cliente, String mensaje) {
        // Lógica para enviar correo electrónico
        System.out.println("Enviando correo electrónico a " + cliente.getEmail() + ": " + mensaje);
    }
}
