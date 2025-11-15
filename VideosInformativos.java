public class VideosInformativos {
    // Atributos
    private int duracion;
    private String url;
    private String formato;
    private String descripcionBreve;

    // Constructor
    public VideosInformativos(int duracion, String url, String formato, String descripcionBreve) {
        this.duracion = duracion;
        this.url = url;
        this.formato = formato;
        this.descripcionBreve = descripcionBreve;
    }

    // Métodos
    public boolean reproducir() {
        // Lógica para reproducir el video
        return true;
    }

    public boolean pausar() {
        // Lógica para pausar el video
        return true;
    }

    // Getters y Setters (omitiendo por brevedad)
    // ...
}
