package lk.ac.iit.products_api; // keep YOUR package line here

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/status")
    public String status() {
        return "API is running — Tutorial 1";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return  "Goodbye from Spring Boot!";
    }
}
