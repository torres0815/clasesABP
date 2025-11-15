import java.util.Date;
import java.util.Map;
import java.util.List;

public class Usuario {
    // Atributos
    private String nombre;
    private String email;
    private String password;
    private Date fechaRegistro;
    private String rol;

    // Constructor
    public Usuario(String nombre, String email, String password, Date fechaRegistro, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.fechaRegistro = fechaRegistro;
        this.rol = rol;
    }

    // Métodos
    public boolean login(String email, String password) {
        // Lógica de autenticación
        return false;
    }

    public void logout() {
        // Lógica de cierre de sesión
    }

    public boolean cambiarPassword(String nuevaPassword) {
        // Lógica para cambiar la contraseña
        return false;
    }

    public boolean actualizarPerfil(Map<String, Object> datos) {
        // Lógica para actualizar el perfil
        return false;
    }

    // Getters y Setters (omitiendo por brevedad, se pueden añadir si es necesario)
    // ...
}
