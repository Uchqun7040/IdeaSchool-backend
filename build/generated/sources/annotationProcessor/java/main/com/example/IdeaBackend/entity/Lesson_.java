package com.example.IdeaBackend.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Lesson.class)
public abstract class Lesson_ extends com.example.IdeaBackend.entity.DistributedEntity_ {

	public static volatile SingularAttribute<Lesson, LocalDateTime> starTime;
	public static volatile SingularAttribute<Lesson, LocalDateTime> finishTime;
	public static volatile SingularAttribute<Lesson, Teacher> teacher;
	public static volatile SingularAttribute<Lesson, Class> clas;
	public static volatile SingularAttribute<Lesson, Subject> subject;
	public static volatile SingularAttribute<Lesson, String> topic;
	public static volatile SingularAttribute<Lesson, Room> room;

	public static final String STAR_TIME = "starTime";
	public static final String FINISH_TIME = "finishTime";
	public static final String TEACHER = "teacher";
	public static final String CLAS = "clas";
	public static final String SUBJECT = "subject";
	public static final String TOPIC = "topic";
	public static final String ROOM = "room";

}

