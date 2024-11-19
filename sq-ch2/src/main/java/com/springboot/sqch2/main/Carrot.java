package com.springboot.sqch2.main;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Carrot {

    private String name;

    @PostConstruct
    public void init() {
        this.name = "kiki";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

