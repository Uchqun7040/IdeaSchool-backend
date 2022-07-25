package com.example.IdeaBackend.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Lesson extends DistributedEntity {


    private String topic;
    @ManyToOne
    private Subject subject;
    @ManyToOne
    private Room room;
    @ManyToOne
    private Class clas;
    @ManyToOne
    private Teacher teacher;
    private LocalDateTime starTime;
    private LocalDateTime finishTime;


    public Lesson() {
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Class getClas() {
        return clas;
    }

    public void setClas(Class clas) {
        this.clas = clas;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public LocalDateTime getStarTime() {
        return starTime;
    }

    public void setStarTime(LocalDateTime starTime) {
        this.starTime = starTime;
    }

    public LocalDateTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(LocalDateTime finishTime) {
        this.finishTime = finishTime;
    }
}
