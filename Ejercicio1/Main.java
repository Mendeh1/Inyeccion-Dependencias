public class Main {

    public static void main(String[] args) {
        // Configuración de las implementaciones concretas
        MensajeSender mensajeSender = new MensajeTextoSender(); // Puedes cambiar esto a CorreoElectronicoSender para probar el envío de correos electrónicos

        // Destinatario para mensaje de texto
        Destinatario destinatarioTexto = new DestinatarioTexto("123456789");
        mensajeSender.enviarMensaje(destinatarioTexto, "Hola, ¿cómo estás?");

        // Destinatario para correo electrónico
        Destinatario destinatarioCorreo = new DestinatarioCorreoElectronico("ejemplo@correo.com");
        mensajeSender.enviarMensaje(destinatarioCorreo, "¡Hola! Este es un correo electrónico.");
    }
}
