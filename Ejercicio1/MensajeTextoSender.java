// Implementación para enviar mensajes de texto
public class MensajeTextoSender implements MensajeSender {
    @Override
    public void enviarMensaje(Destinatario destinatario, String mensaje) {
        // Lógica para enviar mensajes de texto
        System.out.println("Enviando mensaje de texto a " + destinatario.getDestinatario() + ": " + mensaje);
    }
}

