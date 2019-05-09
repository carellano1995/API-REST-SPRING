package com.springboot.apirest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.springboot.apirest.validations.ValidRut;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String name;
    @ValidRut
    private String rut;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + ", rut=" + rut + "]";
    }

}