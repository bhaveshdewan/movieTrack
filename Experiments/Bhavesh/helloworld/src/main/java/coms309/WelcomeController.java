package coms309;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "Hello World";
    }

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name) {
        return "Hello " + name + "\n" + "Welcome to COMS 309 - Fall 2022";
    }
    
}
