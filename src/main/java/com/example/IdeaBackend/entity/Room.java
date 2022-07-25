package com.example.IdeaBackend.entity;

import javax.persistence.Entity;

@Entity
public class Room extends DistributedEntity{

     private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
