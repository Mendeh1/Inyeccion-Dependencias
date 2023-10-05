// Implementación para destinatarios de correos electrónicos
public class DestinatarioCorreoElectronico implements Destinatario {
    private String correo;

    public DestinatarioCorreoElectronico(String correo) {
        this.correo = correo;
    }

    @Override
    public String getDestinatario() {
        return correo;
    }
}