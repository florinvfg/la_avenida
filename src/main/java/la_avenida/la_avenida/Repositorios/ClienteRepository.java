import org.springframework.data.jpa.repository.JpaRepository;

import la_avenida.la_avenida.Cliente;
@ComponentScan
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // Puedes agregar consultas personalizadas aquí si es necesario

}

