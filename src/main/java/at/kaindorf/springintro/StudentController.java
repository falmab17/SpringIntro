package at.kaindorf.springintro;

import at.kaindorf.springintro.beans.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Peter", "Griffin", 40);
    }
}
