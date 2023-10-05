// Implementación para enviar correos electrónicos
public class CorreoElectronicoSender implements MensajeSender {
    @Override
    public void enviarMensaje(Destinatario destinatario, String mensaje) {
        // Lógica para enviar correos electrónicos
        System.out.println("Enviando correo electrónico a " + destinatario.getDestinatario() + ": " + mensaje);
    }
}