package la_avenida.la_avenida.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //se utiliza para construir aplicaciones web y devuelve vistas.
//@RestController // es una versión especializada de @Controller que se utiliza para construir servicios RESTful y devuelve directamente objetos JSON. incompatible con @Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        //return "Hello, world! cambiado 16 Abril 2023";
     
        return "main";
    }

}