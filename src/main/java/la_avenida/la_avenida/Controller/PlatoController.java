import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/platos")
public class PlatoController {

    private final PlatoService platoService;

    @Autowired
    public PlatoController(PlatoService platoService) {
        this.platoService = platoService;
    }

    @GetMapping
    public ResponseEntity<List<Plato>> obtenerTodosLosPlatos() {
        List<Plato> platos = platoService.obtenerTodosLosPlatos();
        return ResponseEntity.ok(platos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plato> obtenerPlatoPorId(@PathVariable Long id) {
        Optional<Plato> plato = platoService.obtenerPlatoPorId(id);
        return plato.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Plato> crearPlato(@RequestBody Plato plato) {
        Plato nuevoPlato = platoService.guardarPlato(plato);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoPlato);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plato> actualizarPlato(@PathVariable Long id, @RequestBody Plato plato) {
        Optional<Plato> platoExistente = platoService.obtenerPlatoPorId(id);
        if (platoExistente.isPresent()) {
            plato.setId(id);
            Plato platoActualizado = platoService.guardarPlato(plato);
            return ResponseEntity.ok(platoActualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPlato(@PathVariable Long id) {
        Optional<Plato> platoExistente = platoService.obtenerPlatoPorId(id);
        if (platoExistente.isPresent()) {
            platoService.eliminarPlato(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

