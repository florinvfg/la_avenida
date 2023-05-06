package la_avenida.la_avenida;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@ComponentScan
public class Camarero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String numeroEmpleado;

    // Constructor por defecto (necesario para JPA)
    protected Camarero() {}

    public Camarero(String nombre, String apellido, String numeroEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroEmpleado = numeroEmpleado;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
}

