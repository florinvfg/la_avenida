package la_avenida.la_avenida.Repositorios;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import la_avenida.la_avenida.Modelo.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findAll();

    Optional<Cliente> findById(Long id);

    void deleteById(Long id);

    // Puedes agregar consultas personalizadas aquí si es necesario

}

