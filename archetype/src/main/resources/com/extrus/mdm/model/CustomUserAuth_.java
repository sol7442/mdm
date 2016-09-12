package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.558+0900")
@StaticMetamodel(CustomUserAuth.class)
public class CustomUserAuth_ {
	public static volatile SingularAttribute<CustomUserAuth, String> id;
	public static volatile SingularAttribute<CustomUserAuth, BigInteger> actionCompany;
	public static volatile SingularAttribute<CustomUserAuth, String> actionSource;
	public static volatile SingularAttribute<CustomUserAuth, BigInteger> actionTime;
	public static volatile SingularAttribute<CustomUserAuth, BigInteger> actionUser;
	public static volatile SingularAttribute<CustomUserAuth, Date> createDate;
	public static volatile SingularAttribute<CustomUserAuth, String> deviceUuid;
	public static volatile SingularAttribute<CustomUserAuth, String> message;
	public static volatile SingularAttribute<CustomUserAuth, String> name;
	public static volatile SingularAttribute<CustomUserAuth, Date> updateDate;
}
