package com.helloworld.greet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GreetController {
    @GetMapping("/greet")
    public Person profile () {
        Person person = new Person("John", 30);
        return person;
    }
}
