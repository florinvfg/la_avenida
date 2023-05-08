package la_avenida.la_avenida.Repositorios;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import la_avenida.la_avenida.Modelo.Plato;
@Entity
@Table(name = "plato")

public interface PlatoRepository extends JpaRepository<la_avenida.la_avenida.Modelo.Plato, Long> {

    List<Plato> findAll();

    Optional<Plato> findById(Long id);

    void deleteById(Long id);

    // Puedes agregar consultas personalizadas aquí si es necesario

}
