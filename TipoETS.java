import java.util.Map;

public class TipoETS {
    // Atributos
    private String nombre;
    private String descripcionBreve;
    private String imagen;

    // Constructor
    public TipoETS(String nombre, String descripcionBreve, String imagen) {
        this.nombre = nombre;
        this.descripcionBreve = descripcionBreve;
        this.imagen = imagen;
    }

    // Métodos
    public Map<String, String> obtenerInformacionCompleta() {
        // Lógica para obtener toda la información
        return null;
    }

    public boolean actualizarInformacion(Map<String, String> nuevosDatos) {
        // Lógica para actualizar la información
        return false;
    }

    public boolean cambiarEstado(String nuevoEstado) {
        // Lógica para cambiar el estado
        return false;
    }

    // Getters y Setters (omitiendo por brevedad)
    // ...
}
