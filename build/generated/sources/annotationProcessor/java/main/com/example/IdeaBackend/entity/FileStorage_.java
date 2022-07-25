package com.example.IdeaBackend.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FileStorage.class)
public abstract class FileStorage_ extends com.example.IdeaBackend.entity.DistributedEntity_ {

	public static volatile SingularAttribute<FileStorage, String> extension;
	public static volatile SingularAttribute<FileStorage, Long> fileSize;
	public static volatile SingularAttribute<FileStorage, String> uploadPath;
	public static volatile SingularAttribute<FileStorage, String> name;
	public static volatile SingularAttribute<FileStorage, String> hashId;
	public static volatile SingularAttribute<FileStorage, String> contentType;
	public static volatile SingularAttribute<FileStorage, FileStatus> status;

	public static final String EXTENSION = "extension";
	public static final String FILE_SIZE = "fileSize";
	public static final String UPLOAD_PATH = "uploadPath";
	public static final String NAME = "name";
	public static final String HASH_ID = "hashId";
	public static final String CONTENT_TYPE = "contentType";
	public static final String STATUS = "status";

}

