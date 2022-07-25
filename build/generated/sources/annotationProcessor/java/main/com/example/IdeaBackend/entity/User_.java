package com.example.IdeaBackend.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ extends com.example.IdeaBackend.entity.DistributedEntity_ {

	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, String> surname;
	public static volatile SetAttribute<User, Role> roles;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, Boolean> active;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, String> username;

	public static final String PASSWORD = "password";
	public static final String SURNAME = "surname";
	public static final String ROLES = "roles";
	public static final String NAME = "name";
	public static final String ACTIVE = "active";
	public static final String EMAIL = "email";
	public static final String USERNAME = "username";

}

