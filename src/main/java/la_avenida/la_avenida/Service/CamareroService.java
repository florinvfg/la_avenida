package la_avenida.la_avenida.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import la_avenida.la_avenida.Modelo.Camarero;
import la_avenida.la_avenida.Repositorios.CamareroRepository;

import java.util.List;
import java.util.Optional;


@Service
public class CamareroService {


    @Autowired
    private CamareroRepository camareroRepository;

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


    // Encontrar todas los camareros
    public List<Camarero> findAll() {
        return camareroRepository.findAll();
    }

    // Encontrar un camarero por ID
    public Camarero findById(Long id) {
        Optional<Camarero> camarero = camareroRepository.findById(id);
        if (camarero.isPresent()) {
            return camarero.get();
        } else {
            throw new RuntimeException("camarero no encontrada con el ID: " + id);
        }
    }

   

    // Guardar un camarero
    public Camarero save(Camarero camarero) {
        return camareroRepository.save(camarero);
    }

    // Actualizar un camarero existente
    public Camarero update(Long id, Camarero camareroDetails) {
        Camarero camarero = findById(id);

        /*camarero.setModelo(camareroDetails.getModelo());
        camarero.setMarca(camareroDetails.getMarca());
        camarero.setId(camareroDetails.getId());
        camarero.setReparaciones(camareroDetails.getReparaciones());*/

        return camareroRepository.save(camarero);
    }

    // Eliminar una camarero por ID
    public void delete(Long id) {
        Camarero camarero = findById(id);
        camareroRepository.delete(camarero);
}

}