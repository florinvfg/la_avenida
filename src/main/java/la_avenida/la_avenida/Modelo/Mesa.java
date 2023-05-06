package la_avenida.la_avenida;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@ComponentScan
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String numero;
    
    private int capacidad;
    
    // Constructor por defecto
    public Mesa() {
    }
    
    // Constructor con parámetros
    public Mesa(String numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    // Otros métodos si es necesario
}

