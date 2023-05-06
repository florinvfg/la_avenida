import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@ComponentScan
public class MesaService {

    private final MesaRepository mesaRepository;

    @Autowired
    public MesaService(MesaRepository mesaRepository) {
        this.mesaRepository = mesaRepository;
    }

    public List<Mesa> obtenerTodasLasMesas() {
        return mesaRepository.findAll();
    }

    public Optional<Mesa> obtenerMesaPorId(Long id) {
        return mesaRepository.findById(id);
    }

    public Mesa guardarMesa(Mesa mesa) {
        return mesaRepository.save(mesa);
    }

    public void eliminarMesa(Long id) {
        mesaRepository.deleteById(id);
    }
}

