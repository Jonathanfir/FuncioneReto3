package com.usa.misiontic.masterclass3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name ="tools")
public class Toool implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtools;
    private String brand;
    private Integer model;
    private Integer category_id;
    private String name;

    @ManyToOne 
    @JoinColumn(name="idClient")
    @JsonIgnoreProperties("tools")

    public Integer getIdtools() {
        return idtools;
    }

    public void setIdtools(Integer idtools) {
        this.idtools = idtools;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  
    
    
    
    
    }
    
    


    
    





