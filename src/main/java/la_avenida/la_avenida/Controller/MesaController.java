package la_avenida.la_avenida.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.persistence.Table;
import la_avenida.la_avenida.Modelo.Mesa;
import la_avenida.la_avenida.Service.MesaService;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;


@Entity
@Table(name = "mesa")
public class MesaController {

    private final MesaService mesaService;

    public MesaController(MesaService mesaService) {
        this.mesaService = mesaService;
    }

    @GetMapping
    public ResponseEntity<List<Mesa>> obtenerTodasLasMesas() {
        List<Mesa> mesas = MesaService.obtenerTodasLasMesas();
        return ResponseEntity.ok(mesas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mesa> obtenerMesaPorId(@PathVariable Long id) {
        Optional<Mesa> mesa = mesaService.obtenerMesaPorId(id);
        return mesa.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Mesa> crearMesa(@RequestBody Mesa mesa) {
        Mesa nuevaMesa = mesaService.guardarMesa(mesa);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaMesa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mesa> actualizarMesa(@PathVariable Long id, @RequestBody Mesa mesa) {
        Optional<Mesa> mesaExistente = mesaService.obtenerMesaPorId(id);
        if (mesaExistente.isPresent()) {
            mesa.setId(id);
            Mesa mesaActualizada = mesaService.guardarMesa(mesa);
            return ResponseEntity.ok(mesaActualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMesa(@PathVariable Long id) {
        Optional<Mesa> mesaExistente = mesaService.obtenerMesaPorId(id);
        if (mesaExistente.isPresent()) {
            mesaService.eliminarMesa(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
