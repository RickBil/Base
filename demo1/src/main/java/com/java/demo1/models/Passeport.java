package com.java.demo1.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "passeport")
public class Passeport implements Serializable{

    private String numpass;
    private String type;
    private Citoyen citoyen;
}
