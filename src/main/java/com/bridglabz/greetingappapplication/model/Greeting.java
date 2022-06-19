package com.bridglabz.greetingappapplication.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="GREETING")
public class Greeting{

    @Id
    @Column(name = "id", nullable = false)
    private final long id;
    private String message;

    public Greeting(long id,String message){
        this.id = id;
        this.message = message;
    }

    public Greeting() {
        id=0;
        message="";
    }

}