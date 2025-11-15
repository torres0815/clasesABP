import java.util.Date;
import java.util.Map;

public class Medico extends Usuario {
    // Atributos
    private String especialidad;
    private String licencia;
    private boolean estadoVerificacion;

    // Constructor
    public Medico(String nombre, String email, String password, Date fechaRegistro, String rol,
                  String especialidad, String licencia, boolean estadoVerificacion) {
        super(nombre, email, password, fechaRegistro, rol);
        this.especialidad = especialidad;
        this.licencia = licencia;
        this.estadoVerificacion = estadoVerificacion;
    }

    // Métodos
    // Nota: La clase InformacionETS y PreguntaFrecuente deben ser definidas.
    // Las clases ContenidoETS y PreguntasFrecuentes ya han sido definidas.
    // Se ajustará en la Fase 3.

    public boolean validarInformacion(ContenidoETS informacionETS) {
        // Lógica para validar información
        return false;
    }

    public boolean agregarInformacionETS(ContenidoETS informacionETS) {
        // Lógica para agregar información
        return false;
    }

    public boolean responderPregunta(PreguntasFrecuentes pregunta, String respuesta) {
        // Lógica para responder una pregunta frecuente
        return false;
    }

    // Getters y Setters (omitiendo por brevedad)
    // ...
}
