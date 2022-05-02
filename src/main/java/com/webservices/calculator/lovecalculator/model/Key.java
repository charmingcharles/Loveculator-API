package com.webservices.calculator.lovecalculator.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "KEYS")
public class Key {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Length(min=16, max=32)
    private String key;

    public Key(String key){
        this.key = key;
    }

    protected Key() {
    }

    public String getKey() {
        return key;
    }
}
