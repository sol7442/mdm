package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.591+0900")
@StaticMetamodel(PushHistory.class)
public class PushHistory_ {
	public static volatile SingularAttribute<PushHistory, String> id;
	public static volatile SingularAttribute<PushHistory, BigInteger> actionCompany;
	public static volatile SingularAttribute<PushHistory, String> actionSource;
	public static volatile SingularAttribute<PushHistory, BigInteger> actionTime;
	public static volatile SingularAttribute<PushHistory, BigInteger> actionUser;
	public static volatile SingularAttribute<PushHistory, String> authToken;
	public static volatile SingularAttribute<PushHistory, String> command;
	public static volatile SingularAttribute<PushHistory, Date> createDate;
	public static volatile SingularAttribute<PushHistory, String> errorCode;
	public static volatile SingularAttribute<PushHistory, String> errorMessage;
	public static volatile SingularAttribute<PushHistory, String> handler;
	public static volatile SingularAttribute<PushHistory, String> message;
	public static volatile SingularAttribute<PushHistory, String> name;
	public static volatile SingularAttribute<PushHistory, String> pushId;
	public static volatile SingularAttribute<PushHistory, Integer> status;
	public static volatile SingularAttribute<PushHistory, String> unqKey;
	public static volatile SingularAttribute<PushHistory, Date> updateDate;
	public static volatile SingularAttribute<PushHistory, String> uuid;
}
