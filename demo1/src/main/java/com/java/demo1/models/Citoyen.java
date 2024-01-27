package com.java.demo1.models;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "citoyens")
public class Citoyen implements Serializable {
    
    @Id
    private String numci;
    @Column(length = 25)
    private String nom;
    @Column(length = 50)
    private String prenom;
    @OneToOne(mappedBy = "citoyen",cascade = CascadeType.ALL)
    private Passeport passeport;
    
    public Citoyen()
    {

    }

}
