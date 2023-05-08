package la_avenida.la_avenida.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

import la_avenida.la_avenida.Modelo.Camarero;


public interface CamareroRepository extends JpaRepository<Camarero, Long> {

    List<Camarero> findAll();

    Optional<Camarero> findById(Long id);


    void deleteById(Long id);

    void delete(Camarero camarero);

    // Puedes agregar consultas personalizadas aquí si es necesario

}
