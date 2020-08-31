package volley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TarjetaMembresiaController {

    @RequestMapping("/tarjetamembresia")
    public String index() {
        return "Greetings from TarjetaMembresiaController!";
    }

}
