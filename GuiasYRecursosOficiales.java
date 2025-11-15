import java.io.File;
import java.util.List;
import java.util.Map;

public class GuiasYRecursosOficiales {
    // Atributos
    private String titulo;
    private String descripcion;
    private String tipo;
    private String entidadEmisora;
    private int anioPublicacion;
    private boolean versionProfesionales;
    private String urlDescarga;
    private String formato;
    private List<String> categorias;

    // Constructor
    public GuiasYRecursosOficiales(String titulo, String descripcion, String tipo, String entidadEmisora, int anioPublicacion, boolean versionProfesionales, String urlDescarga, String formato, List<String> categorias) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.entidadEmisora = entidadEmisora;
        this.anioPublicacion = anioPublicacion;
        this.versionProfesionales = versionProfesionales;
        this.urlDescarga = urlDescarga;
        this.formato = formato;
        this.categorias = categorias;
    }

    // Métodos
    public File descargarGuia() {
        // Lógica para descargar el archivo
        return null;
    }

    public boolean verEnLinea() {
        // Lógica para ver en línea
        return false;
    }

    public boolean esVersionPacientes() {
        // Lógica para determinar si es versión para pacientes
        return !this.versionProfesionales;
    }

    public boolean esVersionProfesionales() {
        return this.versionProfesionales;
    }

    public String obtenerInformacionCompleta() {
        // Lógica para obtener toda la información
        return "Información completa de la guía.";
    }

    public boolean estaVigente() {
        // Lógica para determinar si está vigente
        return true;
    }

    // Getters y Setters (omitiendo por brevedad)
    // ...
}
