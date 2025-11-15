import java.util.Date;

public class ContenidoETS {
    // Atributos
    private String titulo;
    private String tipo;
    private String contenido;
    private Date fechaCreacion;
    private Date fechaActualizacion;
    private String estado;

    // Constructor
    public ContenidoETS(String titulo, String tipo, String contenido, Date fechaCreacion, Date fechaActualizacion, String estado) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.estado = estado;
    }

    // Métodos
    public boolean publicar() {
        this.estado = "Publicado";
        return true;
    }

    public boolean archivar() {
        this.estado = "Archivado";
        return true;
    }

    public boolean editarContenido(String nuevoContenido) {
        this.contenido = nuevoContenido;
        this.fechaActualizacion = new Date();
        return true;
    }

    // Getters y Setters (omitiendo por brevedad)
    // ...
}
