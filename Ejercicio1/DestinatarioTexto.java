// Implementación para destinatarios de mensajes de texto
public class DestinatarioTexto implements Destinatario {
    private String numero;

    public DestinatarioTexto(String numero) {
        this.numero = numero;
    }

    @Override
    public String getDestinatario() {
        return numero;
    }
}
