package com.webservices.calculator.lovecalculator.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Key {

    private static Integer BASE_ID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Length(min=16, max=32)
    private String key;

    public Key(String key){
        this.key = key;
        this.id = BASE_ID++;
    }

    protected Key() {
    }

    public String getKey() {
        return key;
    }
}
