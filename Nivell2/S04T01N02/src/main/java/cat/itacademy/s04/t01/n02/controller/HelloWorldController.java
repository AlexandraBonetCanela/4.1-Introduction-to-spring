package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String helloWorld(@RequestParam(defaultValue = "UNKNOWN") String name) {
        return "Hello " + name + ". You are executing a Gradle project";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String helloWorld2(@PathVariable(required = false) String name) {
        return "Hello " + name + ". You are executing a Gradle project";
    }
}