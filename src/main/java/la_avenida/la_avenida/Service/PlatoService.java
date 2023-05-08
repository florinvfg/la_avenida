package la_avenida.la_avenida.Service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import la_avenida.la_avenida.Modelo.Plato;
import la_avenida.la_avenida.Repositorios.PlatoRepository;

import java.util.List;
import java.util.Optional;

@Service
@ComponentScan
public class PlatoService {

    private final PlatoRepository platoRepository;

    public PlatoService(PlatoRepository platoRepository) {
        this.platoRepository = platoRepository;
    }

    public List<Plato> obtenerTodosLosPlatos() {
        return platoRepository.findAll();
    }

    public Optional<Plato> obtenerPlatoPorId(Long id) {
        return platoRepository.findById(id);
    }

    public Plato guardarPlato(Plato plato) {
        return platoRepository.save(plato);
    }

    public void eliminarPlato(Long id) {
        platoRepository.deleteById(id);
    }
}

