package com.culture.API.Models.MongodbEntity;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Basic;

import com.culture.API.Models.*;
import com.culture.API.Repository.*;


@Document(collection="PendingField")
public class PendingField {
    
    private Owner owner;

    @Basic
    private String hashcode;

    @Basic
    private String description;
    
    @Basic
    private String location;

    @Basic
    private double area;

    public PendingField(){

    }

    public PendingField(Owner owner, String hashcode, String description, String location, double area){
        this.owner = owner;
        this.hashcode = hashcode;
        this.description = description;
        this.location = location;
        this.area = area;
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public static List<PendingField> findAll(PendingFieldRepository repository) throws SQLException {
        List<PendingField> listPending = repository.findAll();
        return listPending;
    }

    public static PendingField save(PendingField pending, PendingFieldRepository repository) throws SQLException {
        PendingField n = repository.save(pending);
        return n;
    }

    public static PendingField findByHashcode(String hashcode, PendingFieldRepository repository)
    {
        return repository.findByHashcode(hashcode);
    }

}