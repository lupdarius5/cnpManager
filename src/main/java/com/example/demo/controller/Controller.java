package com.example.demo.controller;

import com.example.demo.model.CnpEntity;
import com.example.demo.repository.CnpRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    private final CnpRepository cnpRepository;

    public Controller(CnpRepository cnpRepository) {
        this.cnpRepository = cnpRepository;
    }

    @GetMapping("/generator")
    public String generateAndSaveCNP() {
        String generatedCNP = CnpGenerator.generateCNP();

        
        CnpEntity newCnp = new CnpEntity(generatedCNP);
        cnpRepository.save(newCnp);

        return "CNP salvat în MongoDB: " + generatedCNP;
    }
}
