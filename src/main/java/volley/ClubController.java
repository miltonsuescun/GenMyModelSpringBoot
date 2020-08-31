package volley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ClubController {

    @RequestMapping("/club")
    public String index() {
        return "Greetings from ClubController!";
    }

}
