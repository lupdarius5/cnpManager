package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cnp") //
public class CnpEntity {

    @Id
    private String id;
    private String cnp;

    public CnpEntity(String cnp) {
        this.cnp = cnp;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
}
