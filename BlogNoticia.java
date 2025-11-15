import java.util.Date;
import java.util.List;

public class BlogNoticia {
    // Atributos
    private String titulo;
    private String contenido;
    private String resumen;
    private Date fechaPublicacion;
    private String autor;
    private List<String> etiquetas;
    private String url;
    private String imagenPrincipal;
    private String categoria;

    // Constructor
    public BlogNoticia(String titulo, String contenido, String resumen, Date fechaPublicacion, String autor, List<String> etiquetas, String url, String imagenPrincipal, String categoria) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.resumen = resumen;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.etiquetas = etiquetas;
        this.url = url;
        this.imagenPrincipal = imagenPrincipal;
        this.categoria = categoria;
    }

    // Métodos
    public String obtenerContenidoCompleto() {
        return this.contenido;
    }

    public String obtenerResumen() {
        return this.resumen;
    }

    public boolean estaVigente() {
        // Lógica para determinar si está vigente
        return true;
    }

    public int obtenerTiempoLectura() {
        // Lógica para calcular el tiempo de lectura (ej. 1 minuto por cada 500 palabras)
        return this.contenido.split("\\s+").length / 500;
    }

    // Getters y Setters (omitiendo por brevedad)
    // ...
}
