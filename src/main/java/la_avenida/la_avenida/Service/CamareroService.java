import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@ComponentScan
@Service
public class CamareroService {

    private final CamareroRepository camareroRepository;

    @Autowired
    public CamareroService(CamareroRepository camareroRepository) {
        this.camareroRepository = camareroRepository;
    }

    public List<Camarero> obtenerTodosLosCamareros() {
        return camareroRepository.findAll();
    }

    public Optional<Camarero> obtenerCamareroPorId(Long id) {
        return camareroRepository.findById(id);
    }

    public Camarero guardarCamarero(Camarero camarero) {
        return camareroRepository.save(camarero);
    }

    public void eliminarCamarero(Long id) {
        camareroRepository.deleteById(id);
    }
}

