package com.example.IdeaBackend.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Class.class)
public abstract class Class_ extends com.example.IdeaBackend.entity.DistributedEntity_ {

	public static volatile SingularAttribute<Class, String> name;
	public static volatile SingularAttribute<Class, Teacher> classLeader;
	public static volatile SingularAttribute<Class, Pupil[]> pupil;

	public static final String NAME = "name";
	public static final String CLASS_LEADER = "classLeader";
	public static final String PUPIL = "pupil";

}

