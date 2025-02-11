package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/users/{cnp}")
    public String fetchUserById(@PathVariable(name = "cnp", required = true) String cnp) {
        cnp = cnp.trim();
        System.out.println("CNP primit: " + cnp);
        System.out.println("Lungime: " + cnp.length());

        if (ValidareCNP.esteValid(cnp)) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }

    @GetMapping("/generator")
    public String generateCode() {
        return CnpGenerator.generateCNP();
    }

}
