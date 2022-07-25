package com.example.IdeaBackend.entity;


import javax.persistence.*;

@Entity
public  class Subject extends DistributedEntity{
    private String name;

    public Subject() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
