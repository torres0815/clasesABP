import java.util.List;
import java.util.Map;

public class RecursosDeAyuda {
    // Atributos
    private int id;
    private String organizacion;
    private List<String> telefonos;
    private String email;
    private String whatsapp;
    private String cobertura;
    private String tipoServicio;
    private boolean esEmergencia;

    // Constructor
    public RecursosDeAyuda(int id, String organizacion, List<String> telefonos, String email, String whatsapp, String cobertura, String tipoServicio, boolean esEmergencia) {
        this.id = id;
        this.organizacion = organizacion;
        this.telefonos = telefonos;
        this.email = email;
        this.whatsapp = whatsapp;
        this.cobertura = cobertura;
        this.tipoServicio = tipoServicio;
        this.esEmergencia = esEmergencia;
    }

    // Métodos
    public Map<String, String> obtenerInformacionCompleta() {
        // Lógica para obtener toda la información
        return null;
    }

    public boolean contactarPorTelefono() {
        // Lógica para iniciar contacto telefónico
        return true;
    }

    public boolean contactarPorEmail() {
        // Lógica para iniciar contacto por email
        return true;
    }

    public String obtenerEnlaceWhatsapp() {
        // Lógica para obtener el enlace de WhatsApp
        return "https://wa.me/" + this.whatsapp;
    }

    public boolean esServicioNacional() {
        // Lógica para determinar si es servicio nacional
        return this.cobertura.equalsIgnoreCase("Nacional");
    }

    public String obtenerTelefonosFormateados() {
        // Lógica para formatear los teléfonos
        return String.join(" / ", this.telefonos);
    }

    // Getters y Setters (omitiendo por brevedad)
    // ...
}
