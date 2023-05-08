package la_avenida.la_avenida.Service;

import jakarta.persistence.Table;
import la_avenida.la_avenida.Modelo.Mesa;
import la_avenida.la_avenida.Repositorios.MesaRepository;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;


@Entity
@Table(name = "mesa")
public class MesaService {

    private static MesaRepository mesaRepository;

    public MesaService(MesaRepository mesaRepository) {
        MesaService.mesaRepository = mesaRepository;
    }

    public static List<Mesa> obtenerTodasLasMesas() {
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

