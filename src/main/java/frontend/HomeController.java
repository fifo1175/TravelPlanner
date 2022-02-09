package frontend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    // The @GetMapping annotation ensures that HTTP GET requests to /greeting are mapped to the greeting() method.
    // @RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method.
    // Ex: when you use http://localhost:8080/home?name=User with query string name=User, it changes rendered name to User, instead of World
    @GetMapping("/home")
    public String home(@RequestParam(name="name", required = false, defaultValue = "World")
                                   String name, Model model) {
        model.addAttribute("name", name);
        return "home";

    }
}
