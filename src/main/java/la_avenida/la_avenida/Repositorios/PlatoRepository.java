import org.springframework.data.jpa.repository.JpaRepository;

import la_avenida.la_avenida.Plato;
@Query
@ComponentScan
public interface PlatoRepository extends JpaRepository<Plato, Long> {

    // Puedes agregar consultas personalizadas aquí si es necesario

}
