import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;

import la_avenida.la_avenida.Camarero;
@ComponentScan
@Repository
public interface CamareroRepository extends JpaRepository<Camarero, Long> {

    // Puedes agregar consultas personalizadas aquí si es necesario

}
