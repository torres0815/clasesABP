import java.util.List;

public class MapaInteractivo {
    // Atributos
    private List<CentroMedico> centrosMedicos;
    private String ciudadSeleccionada;

    // Constructor
    public MapaInteractivo(List<CentroMedico> centrosMedicos) {
        this.centrosMedicos = centrosMedicos;
    }

    // Métodos
    public List<CentroMedico> buscarCentrosPorCiudad(String ciudad) {
        // Lógica para filtrar centros por ciudad
        return null;
    }

    public List<CentroMedico> filtrarPorServicio(String servicio) {
        // Lógica para filtrar centros por servicio
        return null;
    }

    public String obtenerRuta(int centroId) {
        // Lógica para obtener la ruta al centro
        return "Ruta al centro médico con ID: " + centroId;
    }

    // Getters y Setters (omitiendo por brevedad)
    // ...
}
