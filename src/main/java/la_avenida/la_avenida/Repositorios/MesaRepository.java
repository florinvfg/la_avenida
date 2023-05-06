import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan
public interface MesaRepository extends JpaRepository<Mesa, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}
