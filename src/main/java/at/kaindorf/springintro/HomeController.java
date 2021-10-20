package at.kaindorf.springintro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Kommt in den IoC-Container und Spring verwaltet dies atomatisch
public class HomeController {
    @GetMapping("/home")
    public /* @ResponseBody */ String home (){ // @ResponseBody  gibt den Text zurück und ruft nicht mehr die HTML auf
        return "homepage"; // ruft HTML homepage auf
    }
}
