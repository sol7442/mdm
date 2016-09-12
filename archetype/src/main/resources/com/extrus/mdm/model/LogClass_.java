package com.extrus.mdm.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.570+0900")
@StaticMetamodel(LogClass.class)
public class LogClass_ {
	public static volatile SingularAttribute<LogClass, String> code;
	public static volatile SingularAttribute<LogClass, Integer> defaultSeverity;
	public static volatile SingularAttribute<LogClass, String> issueHandlerFMC;
	public static volatile SingularAttribute<LogClass, String> issueHandlerFS;
	public static volatile SingularAttribute<LogClass, String> issueStatusCheckScript;
	public static volatile SingularAttribute<LogClass, String> issueUrlFormat;
	public static volatile SingularAttribute<LogClass, Integer> sourceType;
}
