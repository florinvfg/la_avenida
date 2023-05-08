package la_avenida.la_avenida.Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import la_avenida.la_avenida.Modelo.Camarero;
import la_avenida.la_avenida.Service.CamareroService;

import java.util.List;

import java.util.Optional;
@ComponentScan
@RestController
@RequestMapping("/camareros")
public class CamareroController {

    private final CamareroService camareroService;

    public CamareroController(CamareroService camareroService) {
        this.camareroService = camareroService;
    }

    @GetMapping
    public ResponseEntity<List<Camarero>> obtenerTodosLosCamareros() {
        List<Camarero> camareros = camareroService.obtenerTodosLosCamareros();
        return new ResponseEntity<>(camareros, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Camarero> obtenerCamareroPorId(@PathVariable Long id) {
        Optional<Camarero> camarero = camareroService.obtenerCamareroPorId(id);
        return camarero.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Camarero> guardarCamarero(@RequestBody Camarero camarero) {
        Camarero nuevoCamarero = camareroService.guardarCamarero(camarero);
        return new ResponseEntity<>(nuevoCamarero, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCamarero(@PathVariable Long id) {
        camareroService.eliminarCamarero(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
