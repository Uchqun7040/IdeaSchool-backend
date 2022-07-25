package com.example.IdeaBackend.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Teacher extends DistributedEntity {

    private String name;
    private String surname;
    private String middleName;
     @ManyToOne
     private FileStorage passport;
     private String phoneNumber;
     private LocalDate dateBirth;
     private Boolean active;
     private String document;
     private Gender gender;

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public FileStorage getPassport() {
        return passport;
    }

    public void setPassport(FileStorage passport) {
        this.passport = passport;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
