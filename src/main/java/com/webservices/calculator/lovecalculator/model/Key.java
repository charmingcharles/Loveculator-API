package com.webservices.calculator.lovecalculator.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "KEYS")
public class Key {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Length(min=16, max=32)
    private String key;

    private Integer callsLeft;

    public Key(String key, int callsLeft){
        this.callsLeft = callsLeft;
        this.key = key;
    }

    protected Key() {
    }

    public String getKey() {
        return key;
    }


    public Integer getCallsLeft() {
        return callsLeft;
    }

    public void setCallsLeft(Integer callsLeft) {
        this.callsLeft = callsLeft;
    }

    public Integer getId() {
        return id;
    }
}
