package at.kaindorf.springintro.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

// @Value // SingletonPattern -- verträgt sich nicht mit @Data
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private String firstname;
    private String lastname;
    private int age;
}
