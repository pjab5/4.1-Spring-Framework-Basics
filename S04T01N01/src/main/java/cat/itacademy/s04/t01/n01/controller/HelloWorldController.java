package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    @ResponseBody
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nom){
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }
    @GetMapping(value = { "/HelloWorld2", "/HelloWorld2/{nom}"})
    @ResponseBody
    public String saluda2(@PathVariable(required = false) String nom){
        if (nom == null) { nom = "UNKNOWN"; }
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }
}
