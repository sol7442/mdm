package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.604+0900")
@StaticMetamodel(UserTitle.class)
public class UserTitle_ {
	public static volatile SingularAttribute<UserTitle, String> id;
	public static volatile SingularAttribute<UserTitle, BigInteger> actionCompany;
	public static volatile SingularAttribute<UserTitle, String> actionSource;
	public static volatile SingularAttribute<UserTitle, BigInteger> actionTime;
	public static volatile SingularAttribute<UserTitle, BigInteger> actionUser;
	public static volatile SingularAttribute<UserTitle, Date> createDate;
	public static volatile SingularAttribute<UserTitle, String> name;
	public static volatile SingularAttribute<UserTitle, Date> updateDate;
}
