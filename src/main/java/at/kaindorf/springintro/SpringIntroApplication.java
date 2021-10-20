package at.kaindorf.springintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // Wurzelelement
@RestController //
//@ComponentScan // Scannt automatisch nach Beansklassen (deshalb auch auskommentiert)
public class SpringIntroApplication {

    @GetMapping("/hello") //so aufrufbar in url
    public String sayHello(@RequestParam(name="name", defaultValue = "World") String name){
        return String.format("Hello %s", name);
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringIntroApplication.class, args);
    }

}
