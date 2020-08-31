package volley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MiembroController {

    @RequestMapping("/miembro")
    public String index() {
        return "Greetings from MiembroController!";
    }

}
