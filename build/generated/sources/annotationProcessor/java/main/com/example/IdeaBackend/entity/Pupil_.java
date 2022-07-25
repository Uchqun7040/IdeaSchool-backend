package com.example.IdeaBackend.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pupil.class)
public abstract class Pupil_ extends com.example.IdeaBackend.entity.DistributedEntity_ {

	public static volatile SingularAttribute<Pupil, String> phoneNumber;
	public static volatile SingularAttribute<Pupil, Gender> gender;
	public static volatile SingularAttribute<Pupil, String> birthCertificate;
	public static volatile SingularAttribute<Pupil, String> surname;
	public static volatile SingularAttribute<Pupil, String> name;
	public static volatile SingularAttribute<Pupil, Boolean> active;
	public static volatile SingularAttribute<Pupil, String> middleName;
	public static volatile SingularAttribute<Pupil, Date> dateBirth;

	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String GENDER = "gender";
	public static final String BIRTH_CERTIFICATE = "birthCertificate";
	public static final String SURNAME = "surname";
	public static final String NAME = "name";
	public static final String ACTIVE = "active";
	public static final String MIDDLE_NAME = "middleName";
	public static final String DATE_BIRTH = "dateBirth";

}

