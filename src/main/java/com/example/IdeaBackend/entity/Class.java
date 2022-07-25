package com.example.IdeaBackend.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Class extends DistributedEntity{
    private String name;
    @ManyToOne
    private Teacher classLeader;
    @ManyToOne
    private Pupil[] pupil;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Teacher getClassLeader() {
        return classLeader;
    }

    public void setClassLeader(Teacher classLeader) {
        this.classLeader = classLeader;
    }

    public Pupil[] getPupil() {
        return pupil;
    }

    public void setPupil(Pupil[] pupil) {
        this.pupil = pupil;
    }
}
