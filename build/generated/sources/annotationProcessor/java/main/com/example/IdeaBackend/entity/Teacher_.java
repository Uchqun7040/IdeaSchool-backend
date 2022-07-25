package com.example.IdeaBackend.entity;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Teacher.class)
public abstract class Teacher_ extends com.example.IdeaBackend.entity.DistributedEntity_ {

	public static volatile SingularAttribute<Teacher, String> phoneNumber;
	public static volatile SingularAttribute<Teacher, FileStorage> passport;
	public static volatile SingularAttribute<Teacher, Gender> gender;
	public static volatile SingularAttribute<Teacher, String> surname;
	public static volatile SingularAttribute<Teacher, String> document;
	public static volatile SingularAttribute<Teacher, String> name;
	public static volatile SingularAttribute<Teacher, Boolean> active;
	public static volatile SingularAttribute<Teacher, String> middleName;
	public static volatile SingularAttribute<Teacher, LocalDate> dateBirth;

	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String PASSPORT = "passport";
	public static final String GENDER = "gender";
	public static final String SURNAME = "surname";
	public static final String DOCUMENT = "document";
	public static final String NAME = "name";
	public static final String ACTIVE = "active";
	public static final String MIDDLE_NAME = "middleName";
	public static final String DATE_BIRTH = "dateBirth";

}

