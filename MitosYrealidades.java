import java.util.Date;

public class MitosYrealidades {
    // Atributos
    private int id;
    private String mito;
    private String realidad;
    private String fuente;
    private boolean esVerificado;
    private Date fechaActualizacion;

    // Constructor
    public MitosYrealidades(int id, String mito, String realidad, String fuente, boolean esVerificado, Date fechaActualizacion) {
        this.id = id;
        this.mito = mito;
        this.realidad = realidad;
        this.fuente = fuente;
        this.esVerificado = esVerificado;
        this.fechaActualizacion = fechaActualizacion;
    }

    // Métodos
    public boolean marcarComoVerificado() {
        this.esVerificado = true;
        return true;
    }

    public boolean actualizarMito(String nuevoMito) {
        this.mito = nuevoMito;
        return true;
    }

    public boolean actualizarRealidad(String nuevaRealidad) {
        this.realidad = nuevaRealidad;
        return true;
    }

    public boolean validarInformacion() {
        // Lógica de validación
        return false;
    }

    public String obtenerResumen() {
        return "Mito: " + this.mito + ", Realidad: " + this.realidad;
    }

    // Getters y Setters (omitiendo por brevedad)
    // ...
}
