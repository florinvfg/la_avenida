package la_avenida.la_avenida.Repositorios;

import java.util.List;
import java.util.Optional;

import la_avenida.la_avenida.Modelo.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesaRepository extends JpaRepository<Mesa, Long> {

    List<Mesa> findAll();
    // Puedes agregar métodos personalizados aquí si es necesario

    Optional<Mesa> findById(Long id);


    void deleteById(Long id);
}
