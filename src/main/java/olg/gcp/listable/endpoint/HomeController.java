package olg.gcp.listable.endpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "http://localhost:8080")
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

}
