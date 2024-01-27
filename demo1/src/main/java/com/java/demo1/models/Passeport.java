package com.java.demo1.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "passeport")
public class Passeport implements Serializable{

    @Id
    private String numpass;
    @Column(length = 3)
    private String type;
    @OneToOne
    @JoinColumn(name = "numci")
    private Citoyen citoyen;
    
    public Passeport() {
    }
    
}
