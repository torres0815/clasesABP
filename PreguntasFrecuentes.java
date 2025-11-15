public class PreguntasFrecuentes {
    // Atributos
    private String pregunta;
    private String respuesta;
    private String categoria;

    // Constructor
    public PreguntasFrecuentes(String pregunta, String respuesta, String categoria) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.categoria = categoria;
    }

    // Métodos
    public boolean marcarComoUtil() {
        // Lógica para marcar como útil
        return false;
    }

    public boolean actualizarPregunta(String nuevaPregunta) {
        this.pregunta = nuevaPregunta;
        return true;
    }

    public boolean actualizarRespuesta(String nuevaRespuesta) {
        this.respuesta = nuevaRespuesta;
        return true;
    }

    // Getters y Setters (omitiendo por brevedad)
    // ...
}
